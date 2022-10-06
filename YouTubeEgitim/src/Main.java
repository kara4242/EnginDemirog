


public class Main {

	public static void main(String[] args) {
		
		CreditManager creditManager = new CreditManager();
		creditManager.calculate();
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer(); 
		customer.setId(1);
		customer.setCity("Antalya");

		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save();
		customerManager.delete();
		
		Company company = new Company();
		company.setTaxNumber("123456789");
		company.setCompanyName("Company Name");
		company.setId(100);
		
		CustomerManager customerManager2 = new CustomerManager(company);
		customerManager2.save();
		customerManager2.delete();
		
		Person person = new Person();
		person.setFirstName("Name");
		person.setNationalIdentity("12345");
		

	}

}
class Customer{
 private int id;
 private String firstName;
 private String lastName;
 private String NationalIdentity;
 private String city;
 
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Customer() {
	System.out.println("Constructor has been started.");
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getNationalIdentity() {
	return NationalIdentity;
}
public void setNationalIdentity(String nationalIdentity) {
	NationalIdentity = nationalIdentity;
}
}
	
class CustomerManager{
	private Customer cs;
	public CustomerManager(Customer cs)
	{
		this.cs=cs;
		
	}
	public void save()
	{
		System.out.println("Müsteri kayıt edildi"+cs.getFirstName());
		
	}
	public void delete() {
		System.out.println("Customer has been deleted. ID: " + cs.getId());
	}
}

  class Company extends Customer {
	private String taxNumber;
	private String companyName;

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
  
   class Person extends Customer {
		private String nationalIdentity;
		private String firstName;
		private String lastName;

		public String getNationalIdentity() {
			return nationalIdentity;
		}

		public void setNationalIdentity(String nationalIdentity) {
			this.nationalIdentity = nationalIdentity;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	}

