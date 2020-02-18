import java.util.Arrays;

public class ArrayPractice {

	
	
	public static void main(String[] args) {
		
		/**
		 *One way to make an array
		 *
		 *int[] x = new int [5];
		 //*This makes an array with a length of 5
		 //*BT: Numeric Types are defaults to 0
		 //*BT - Big takeaway 
		 *x[0] = 1;
		 *x[1] = 2;
		 *x[2] = 3;
		 *x[3] = 4;
		 *x[4] = 5;
		 *
		 *
		 //*/
		
		//another way to make an array
		int[] x = new int[] {1, 2, 3, 4, 5};

		
		System.out.println(x);
		
		
		//One way to make a loop
		int n = 0;
		
		while (n > x.length) {
			n=n+1;
			System.out.println(x[n]);
		}
		
		//*/
		
		
		for (int i = 0; i < x.length; i=i+1) {
			System.out.println(x[i]);
		}
		//*/
		
		
		for (int i = x.length -1; i >= 0; i = i - 1) {
			System.out.println(x[i]);
		}
		//*/
		
		
		
		//FOR EACH LOOP
		for (int i: x) {
			System.out.println(i);
		}
		//*/
		
		
		//REALLY NICE SHORTCUT
		//toString is an overloaded method. This means
		//that there are multiple versions that have different parameters.
		//The Program knows which one to pick based on the parameters.
		System.out.println(Arrays.toString(x));
		
		
		//BT - Big takeaway
		//BT: You must be very careful when writing methods that have a reference type parameter
		//If you change the parameter the change is permanent
		doThis(x);
		System.out.println(Arrays.toString(x));
		
		
		
		int q = 100;
		System.out.println(q);
		doThat(q);
		System.out.println(q);
		
		
		
	}

	
	
	
	public static void doThat(int n) {
		n = 99;
	}
	
	/**
	 * 
	 * @param array
	 * 
	 * postcondition - 
	 * 
	 */
	public static void doThis(int[] array) {
		array[0] = 17;
	}
	
	
}
