package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

     @Override
	public boolean CheckIfRealPerson(Customer customer) throws Exception {
		

        KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = false;
		try {
			return kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()),customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth());
   
		}catch(RemoteException e) {
			
		}
		return result;
	}

	
	

}
