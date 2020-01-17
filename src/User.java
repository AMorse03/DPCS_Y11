
public class User{
	
	//BEHAVIOURS
	
	private String name;
	private int age;
	private int priority;
	private String email;
	private String city;
	
	
	//CONSTRUCTORS
	
	public User() {}
	public User(String n, String e) {name = n; email = e;}
	public User(String n,int a, String e, int p, String c) {name = n; if (a > 0) {age = a;} email = e; if (p>0 && p<=3) {priority = p;}; city = c;}
	public User(User u) {this.name = u.name; this.age = u.age; this.priority = u.priority; this.email = u.email; this.city = u.city;}
	
	//BEHAVIOURS
	
		//getters
	public String getName() {return name;}
	public int getAge() {return age;}
	public int getPriority() {return priority;}
	public String getEmail() {return email;}
	
		//setters
	public void setName(String n) {name = n;}
	public void setAge(int a) {if (a > 0) {age = a;}}
	public void setPriority(int p) {if (p>0 && p<=3) {priority = p;}}
	public void setEmail(String e) {email = e;}
	
	public static User copyUser(User x) {
		User u2 = new User(x);
		return u2;
	}
	
	
	public String toString() {
		String result = "Name: " + name;
		result = result + "\nAge: " + age;
		result = result + "\nPriority Level: " + priority;
		result = result + "\nEmail: " + email;
		
		return result;
	}
	
}
