package phoneBookProject;

public class Person {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private String fullName;
	private String state;
	private String city;
	private String street;
	private double zipcode;
	private long phoneNumber;
	
	
	
	
	
	public Person() {}


	public Person(String firstName, String middleName, String lastName, String fullName, String state, String city,
			String street, double zipcode, long phoneNumber) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fullName = fullName;
		this.state = state;
		this.city = city;
		this.street = street;
		this.zipcode = zipcode;
		this.phoneNumber = phoneNumber;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public double getZipcode() {
		return zipcode;
	}


	public void setZipcode(double zipcode) {
		this.zipcode = zipcode;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public void getPerson() {
		
		
		System.out.println("Person: firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName
				+ ", fullName=" + fullName + ", state=" + state + ", city=" + city + ", street=" + street + ", zipcode="
				+ zipcode + ", phoneNumber=" + phoneNumber );
		
		
	}


	
	
	
	
	
	
	
	

}
