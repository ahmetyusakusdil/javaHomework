package entities.concrete;

import java.time.LocalDate;

public class Customer extends User {

	private String firstName;
	private String lastName;
	private String nickname;
	private LocalDate dateOfBirth;
	private String nationalityId;
	
	public Customer(int id, String email, String password, String firstName, String lastName, String nickname,
			LocalDate dateOfBirth, String nationalityId) {
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickname = nickname;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	
	
	
}
