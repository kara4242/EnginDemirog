


public class Main {

	public static void main(String[] args) {
		
		
		CreditManager  creditManager=new CreditManager();
		creditManager.save();
		creditManager.calculate();
		Customer customer=new Customer();
		customer.setId(1);
		customer.setFirstName("Engin");
		customer.setLastName("Demirog");
		customer.setNationalIdentity("123456");
		customer.setCity("İzmir");
		CustomerManager cs=new CustomerManager();
		cs.Save(customer);

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
	
	public void Save(Customer customer)
	{
		System.out.println("Müsteri kayıt edildi");
		
	}
}
