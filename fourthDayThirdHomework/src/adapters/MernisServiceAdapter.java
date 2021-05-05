package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.concrete.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter  implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		final KPSPublicSoap client = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(),
					customer.getLastName(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException | RemoteException e) {
			e.printStackTrace();
		}
		return result;

		
	
	}

}
