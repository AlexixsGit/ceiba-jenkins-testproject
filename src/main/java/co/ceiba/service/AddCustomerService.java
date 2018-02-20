package co.ceiba.service;

import co.ceiba.domain.Customer;

public class AddCustomerService {

	/**
	 * Adding customers
	 * 
	 * @param customer
	 * @return
	 */
	public String addCustomer(Customer customer) {
		return "Customer " + customer.getOrganizationName() + " added successfully";
	}
}
