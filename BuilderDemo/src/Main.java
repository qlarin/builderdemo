
public class Main {

	public static void main(String[] args){
		
		Provider provider = new Provider();
		Builder builder = new PersonBuilder();
		
		System.out.println("Person: ");
		provider.setBuilder(builder);
		provider.makeUser();
		User newUser = provider.getUser();
		newUser.show();
		
	}
}
