
abstract class Builder {

	protected User user;
	
	public void newUser(){
		user = new User();
	}
	
	public User getUser(){
		return user;
	}
	
	public abstract void buildFirstName();
	public abstract void buildLastName();
	public abstract void buildAge();
	public abstract void buildPhoneNumber();
	public abstract void buildAddress();
	
}
