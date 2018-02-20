package co.ceiba.domain;

public class Customer {

	private String organizationName;
	private String customerCode;
	private Person person;

	public Customer(String organizationName, String customerCode, Person person) {
		this.organizationName = organizationName;
		this.customerCode = customerCode;
		this.person = person;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}
