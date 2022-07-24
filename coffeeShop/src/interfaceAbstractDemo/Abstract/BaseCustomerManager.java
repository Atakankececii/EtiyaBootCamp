package interfaceAbstractDemo.Abstract;

import interfaceAbstractDemo.Entities.Customer;

public class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Veri tabanına kaydedildi :" + customer.getFirstName());
	}

	

}
