
public class Customer {
	
	//ATTRIBUTES
	private String memberId;
	private String email;
	private boolean gold;
	
	
	//CONSTRUCTORS
	
	public Customer() {}
	public Customer (String a, String b) {memberId = a; email = b; gold = false;}
	
	
	
	
	//BEHAVIOURS
	
		//Getters
	public String getMemberId() {return memberId;}
	public String getEmail() {return email;}
	
	public void setGold() {gold = true;}
		
	//public boolean isGold() {}
	public void changeStatus() {gold = !gold;}
	

}
