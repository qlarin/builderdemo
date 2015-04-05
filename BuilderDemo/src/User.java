
class User {
	
	private String firstName;
	private String lastName;
	private int age;
	private String phoneNumber;
	private String address;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void show(){
		if(firstName!=null) System.out.println("Firstname: " + firstName);
		if(lastName!=null) System.out.println("Lastname: " + lastName);
		if(age>0) System.out.println("Age: " + age);
		if(phoneNumber!=null) System.out.println("Phone number: " + phoneNumber);
		if(address!=null) System.out.println("Address: " + address);
	}
}
