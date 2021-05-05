package abstracts;

import entities.concrete.Customer;

public interface CustomerCheckService {

	boolean CheckIfRealPerson(Customer customer);
}
