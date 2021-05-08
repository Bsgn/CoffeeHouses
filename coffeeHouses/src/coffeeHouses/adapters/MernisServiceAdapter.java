package coffeeHouses.adapters;

import java.rmi.RemoteException;

import coffeeHouses.abstracts.CustomerCheckService;
import coffeeHouses.entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws RemoteException {
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		return kpsPublic.TCKimlikNoDogrula(customer.getNationalitId(), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
	}

}
