
public class Provider {

	private Builder builder;
	
	public void setBuilder(Builder builder){
		this.builder = builder;
	}
	
	public User getUser(){
		return builder.getUser();
	}
	
	public void makeUser(){
		builder.newUser();
		builder.buildFirstName();
		builder.buildLastName();
		builder.buildAge();
		builder.buildPhoneNumber();
		builder.buildAddress();
	}
}
