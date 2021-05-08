package business.abstracts;

import entities.concretes.User;

public interface UserValidService {

	boolean validate(User user);
}
