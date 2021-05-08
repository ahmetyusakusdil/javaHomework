package fifthDayHomework;

import business.abstracts.AuthService;
import business.concretes.UserManager;
import business.concretes.UserValidateManager;
import core.adapters.GoogleLoginAdapter;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "Ahmet", "Kuþdil", "ahmet.kusdil@gmail.com", "1234566");
		UserManager userManager = new UserManager(new InMemoryUserDao());
		userManager.add(user1);
		
		
		UserValidateManager userValidateManager = new UserValidateManager();
		userValidateManager.validate(user1);
		
		User user2=new User(1,"Burak","Aydemir","burak@gmail.com","123456");
		userManager.add(user2);
		
		AuthService authService= new GoogleLoginAdapter();
		authService.Register(user2);
		authService.Login("burak@gmail.com", "123456");
		
		
	}

}
