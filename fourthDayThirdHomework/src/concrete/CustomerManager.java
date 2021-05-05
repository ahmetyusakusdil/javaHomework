package concrete;

import abstracts.CustomerCheckService;
import abstracts.CustomerService;
import entities.concrete.Customer;

public class CustomerManager implements CustomerService {

	CustomerCheckService customerCheckService;
	
	public CustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void add(Customer customer) throws Exception {
		
		if (!customerCheckService.CheckIfRealPerson(customer)) 
			throw new Exception("Not a valid person");
		
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli müsteri eklendi ");
		
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli müsteri güncellendi ");

	}

	@Override
	public void delete(Customer customer) {
		System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli müsteri silindi ");

		
	}



}
