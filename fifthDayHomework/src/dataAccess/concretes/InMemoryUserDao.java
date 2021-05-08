package dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class InMemoryUserDao implements UserDao {

	List<User> userDataBase=new ArrayList<User>();
	@Override
	public void add(User user) {
	
		userDataBase.add(user);
		System.out.println(user.getFirstName() + "InMemory ile eklendi.");
	
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName() + "InMemory ile güncellendi.");
		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getFirstName() + "InMemory ile silindi.");
		
	}

	@Override
	public User get(int id) {
		
		return this.get(id);
	}

	@Override
	public List<User> getAll() {
		
		return this.getAll();
	}

	@Override
	public User getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	

	


}
