
import adapters.MernisServiceAdapter;
import concrete.BaseCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager bCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		bCustomerManager.save(new Customer(1, "Ahmet Yuþa", "Kuþdil", 1995, "45226395950"));
	}

}
