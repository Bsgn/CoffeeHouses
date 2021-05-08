package coffeeHouses.concrete;


import coffeeHouses.abstracts.BaseCustomerManager;
import coffeeHouses.abstracts.CustomerCheckService;
import coffeeHouses.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	CustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) throws Exception{
		
		if(customerCheckService.CheckIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			throw new Exception("Not a valid person");
		}
		
		
	}
	

}
