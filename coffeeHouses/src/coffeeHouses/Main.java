package coffeeHouses;

import java.time.LocalDate;

import coffeeHouses.abstracts.BaseCustomerManager;
import coffeeHouses.abstracts.CustomerCheckService;
import coffeeHouses.adapters.MernisServiceAdapter;
import coffeeHouses.concrete.CustomerCheckManager;
import coffeeHouses.concrete.NeroCustomerManager;
import coffeeHouses.concrete.StarbucksCustomerManager;
import coffeeHouses.entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {

		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter()); 
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Muhammet Ali");
		customer.setLastName("Biþgin");
		customer.setDateOfBirth(LocalDate.of(1997,12,9));
		customer.setNationalitId(Long.parseLong("44444444444"));
		
		customerManager.save(customer);

	}

}
