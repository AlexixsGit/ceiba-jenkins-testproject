package co.ceiba.testdatabuilder;

import co.ceiba.domain.Customer;
import co.ceiba.domain.Person;

public class CustomerTestDataBuilder {

	private String organizationName;
	private String customerCode;
	private Person person;

	public CustomerTestDataBuilder() {
		this.organizationName = "Software";
		this.customerCode = "123456";
		this.person = new PersonTestDataBuilder().build();
	}

	public CustomerTestDataBuilder withOrganizationName(String organizationName) {
		this.organizationName = organizationName;
		return this;
	}

	public CustomerTestDataBuilder withCustomerCode(String customerCode) {
		this.customerCode = customerCode;
		return this;
	}

	public CustomerTestDataBuilder withPerson(Person person) {
		this.person = person;
		return this;
	}

	public Customer build() {
		return new Customer(this.organizationName, this.customerCode, this.person);
	}

}
