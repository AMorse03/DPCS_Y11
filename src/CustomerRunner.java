import java.util.ArrayList;

public class CustomerRunner {
	
	public static void main(String[] args) {
		
		//Step 1: Create an ArrayList of Customers
		ArrayList<Customer> allCustomers = new ArrayList<Customer>();
		//When a data structure of objects is created we need to construct each object
		
		Customer[] customerArray = new Customer[10];
		//I HAVE NOT CONSTRUCTED customerArray[0] SO I CAN'T USE IT
		customerArray[0].changeStatus();//ERROR
		customerArray[1] = new Customer("123", "123@45.com");
		customerArray[1].changeStatus();
		
		
		
	}
}
