
public class PersonBuilder extends Builder {

	@Override
	public void buildFirstName() {
		user.setFirstName("Adam");
		
	}


	@Override
	public void buildLastName() {
		user.setLastName("Kowalski");	
		
	}


	@Override
	public void buildAge() {
		user.setAge(24);
		
	}


	@Override
	public void buildPhoneNumber() {
		user.setPhoneNumber("555-890-788");
		
	}


	@Override
	public void buildAddress() {
		//implementation of address
		
	}
	
}
