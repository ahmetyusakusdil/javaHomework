package fourthDayThirdHomework;

import java.time.LocalDate;

import adapters.MernisServiceAdapter;
import concrete.CampaignManager;
import concrete.CustomerManager;
import concrete.GameManager;
import concrete.OrderManager;
import entities.concrete.Campaign;
import entities.concrete.Customer;
import entities.concrete.Game;
import entities.concrete.Order;

public class Main {

	public static void main(String[] args) throws Exception {
		
		CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		Customer customer = new Customer(1, "ahmet.kusdil@gmail.com", "123", "Ahmet Yuþa", "Kuþdil", "ayk", LocalDate.of(1995, 3, 28), "45226395950");
		customerManager.add(customer);

		GameManager gameManager = new GameManager();
		Game game = new Game(1, "Call of Duty", 60.00);
		gameManager.add(game);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign(1, "çýlgýn indirim", (byte)20, true);
		campaignManager.add(campaign);
		
		OrderManager orderManager = new OrderManager();
		Order order = new Order(1, 1, 1, LocalDate.of(2021, 5, 5));
		orderManager.add(order);
		orderManager.buy(customer, game, campaign);
		
	}

}
