
public class UserRunner {

	public static void main(String[] args) {
		
		User u1 = new User("Bob", 44, "bob.bob@bob.com", 1, "Oshawa");
		
		System.out.println(u1);
		
		User u2 = new User();
		u2 = User.copyUser(u1);
		
		System.out.println("");
		
		System.out.println(u2);
		
		
		
		
		
	}

}
