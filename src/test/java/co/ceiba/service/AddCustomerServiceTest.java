package co.ceiba.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import co.ceiba.domain.Customer;
import co.ceiba.testdatabuilder.CustomerTestDataBuilder;

public class AddCustomerServiceTest {

	private AddCustomerService addCustomerService;

	@Before
	public void setup() {
		this.addCustomerService = new AddCustomerService();
	}

	@Test
	public void addCustomer() {
		// Arrange
		Customer customer = new CustomerTestDataBuilder().build();
		// Act
		String saveMessage = this.addCustomerService.addCustomer(customer);
		// Assert
		assertNotNull(saveMessage);
	}
}
