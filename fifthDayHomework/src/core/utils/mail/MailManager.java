package core.utils.mail;

public class MailManager implements MailService {

	@Override
	public void sendMail(String email, String message) {
		System.out.println("Send to :" + email + "Message : " + message);
		
	}

	@Override
	public boolean getVerification() {
		
		/*Scanner entry=new Scanner(System.in);
		System.out.println("Onaylamak i�in : yes/no");
		String onay=entry.next();
		System.out.println(onay);
		if(onay.toString()=="yes") {
			return true;
		}else {
			return false;
		}*/
		return true;
		
	}

}
