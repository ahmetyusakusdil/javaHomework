package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.abstracts.UserValidService;
import core.utils.mail.MailService;
import entities.concretes.User;

public class AuthManager implements AuthService  {


	private UserService userService;
	private UserValidService userValidService;
	private MailService mailService;
	
	public AuthManager(UserService userService,UserValidService userValidService,MailService mailService) {
		super();
		this.userService = userService;
		this.userValidService=userValidService;
		this.mailService=mailService;
	}

	@Override
	public void Register(User user) {
		if(!userValidService.validate(user)) {
			System.out.println("Validasyon işlemi başarısız");
			return;
		}
		if(!userService.checkIfMailExist(user.getEmail())) {
			System.out.println("Bu e-posta edresi sistemde kayıtlı");
			return;
		}
		System.out.println("Kayıt işlemi başarılı. Doğrulama adresi epostanıza gönderilmiştir.");
		mailService.sendMail(user.getEmail(), " Doğrulama maili");
		userService.add(user);
		
		
	}

	@Override
	public void Login(String email, String password) {
		User getUser=userService.getByEmail(email);
		if(getUser==null) {
			System.out.println(" Böyle bir kullanici bulunamadi.");
			return;
		}else if(getUser.getPassword()!=password) {
			System.out.println("Yanlış parola girdiniz.");
		}else {
			System.out.println("Hoş geldiniz "+getUser.getFirstName()+" "+getUser.getLastName());
		}
		
	}
}
