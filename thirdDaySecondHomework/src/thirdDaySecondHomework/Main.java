package thirdDaySecondHomework;

public class Main {

public static void main(String[] args) {
		
		User user1 = new User(1, "Engin", "Demirog", "engin@engin.com","123");
		User user2 = new User(2, "Ahmet Yusa", "Kusdil", "ahmet@ahmet.com","1234");
		
	    User[] users = {user1,user2};
	    
	    UserManager userManager = new UserManager();
	    userManager.addMultiple(users);
	    userManager.delete(user2);
	    userManager.getall();
	    userManager.getById(1);
	    userManager.login("ahmet@ahmetcom", "123");
	    userManager.logout(user1);
	   
	    Instructor instructor = new Instructor(1, 1, "Java", "Ödev 1","Egitmen 1 ");
	    Student student = new Student(1, 2, "Java", "Ödev1");
		
	    InstructorManager instructorManager = new InstructorManager();
	    instructorManager.addCourse(instructor);
	    
	    StudentManager studentManager = new StudentManager();
	    studentManager.addDoneHomeword(student);
	    studentManager.addTakenCourse(student);
	    
	}
}
