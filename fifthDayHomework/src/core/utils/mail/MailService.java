package core.utils.mail;

public interface MailService {
	
	void sendMail(String email , String message);
	boolean getVerification();
}
