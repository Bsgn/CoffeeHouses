package coffeeHouses.abstracts;

import coffeeHouses.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) throws Exception {
		System.out.println("Veri tabanýna kaydedildi: " + customer.getFirstName());
		
	}

}
