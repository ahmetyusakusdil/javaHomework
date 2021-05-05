package concrete;

import abstracts.OrderService;
import entities.concrete.Campaign;
import entities.concrete.Customer;
import entities.concrete.Game;
import entities.concrete.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		
		System.out.println(order.getId() + " kimlikli sipariþ eklendi. ");
	}

	@Override
	public void buy(Customer customer, Game game, Campaign campaign) {
		
		if (campaign!= null) {
			System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli kullanici "
					
				+ game.getName() + " isimli oyunu " + campaign.getName() + " kampanyasindaki % " + campaign.getDiscount()
				+ " indirim ile " + game.getPrice() * (100 - campaign.getDiscount()) / 100 
		        + " fiyat üzerinden satin aldi."  );
		} else {
			
            System.out.println(customer.getFirstName() + " " + customer.getLastName() + " isimli kullanici "
					
				+ game.getName() + "isimli oyunu" + game.getPrice() 
		        + " fiyat üzerinden satin aldi."  );
			
		}
		
		
	}

}
