package coffeeHouses.concrete;

import coffeeHouses.abstracts.CustomerCheckService;
import coffeeHouses.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return false;
		
	}

	

}
