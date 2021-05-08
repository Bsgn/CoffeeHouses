package coffeeHouses.abstracts;

import java.rmi.RemoteException;

import coffeeHouses.entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer) throws RemoteException;
}
