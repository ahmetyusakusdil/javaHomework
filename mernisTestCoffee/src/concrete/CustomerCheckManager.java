package concrete;

import abstracts.CustomerCheckService;

import entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception {
		// TODO Auto-generated method stub
		return true;
	}

}
