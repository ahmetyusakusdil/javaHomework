package fourthDayFirstHomework;

public class Main {

	public static void main(String[] args) {
		
		GameCalculator[] calculators = {new KidsGameCalculator() , new ManGameCalculator() ,new WomanGameCalculator()};
		
		for (GameCalculator gameCalculator : calculators) {
			
			gameCalculator.calculate();
			
			
			
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		
			
		
		}

	}

}
