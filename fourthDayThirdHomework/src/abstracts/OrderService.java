package abstracts;

import entities.concrete.Campaign;
import entities.concrete.Customer;
import entities.concrete.Game;
import entities.concrete.Order;

public interface OrderService {

	void add(Order order);
	void buy(Customer customer , Game game , Campaign campaign);
	
}
