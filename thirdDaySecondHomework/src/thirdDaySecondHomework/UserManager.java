package thirdDaySecondHomework;

public class UserManager {

	public void add(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullanýcý Eklendi. " );
	}
	
	public void addMultiple(User[] users) {
		
		for (User user : users) {
			add(user);
		}
	}
	
	
	public void delete(User user) {
		
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullanýcý Silindi. " );
	}
	
	public void getall() {
		
		System.out.println(" Kullanýcýlar Listelendi .");
		
	}
	
	public void getById(int userId) {
		System.out.println(" Ýlgili Kullanýcý listelendi.");
	}
	
	public void login(String email , String password) {
		
		System.out.println(email + " Hesabý giriþ yaptý");
	}
	
	public void logout(User user) {
		
		System.out.println(user.getFirstName() + " "+ user.getLastName()+" Kullanýcý çýkýþ yaptý.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kullanýcýsý güncellendi.");
	}
	
}