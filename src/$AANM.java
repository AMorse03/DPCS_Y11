import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class $AANM {
//Tools Class
	
	
	/**
	 *  This function checks to see if a char "c" is a vowel
	 * @param c
	 * @return
	 * 
	 * Preconditions:
	 * Postconditions:
	 * 
	 */
	public static boolean isVowel(char c) {
		String str = "" + c; //converts c to a string
		str = str.toLowerCase(); //converts a string to all lower case
		c = str.charAt(0); //converts a string to a char, at the first index
		
		if (c == 'a' || c == 'e'|| c == 'i'|| c == 'o' || c == 'u') {
			return true;
		}
		return false;
	}
	
	
	/**
	 * Overloaded function that does the same thing as ^^ but takes a string instead of a char
	 * @param a
	 * @return
	 * 
	 * Preconditions:
	 * Postconditions:
	 * 
	 * 
	 */
	public static boolean isVowel(String a) {
		if ("aeiou".indexOf(a) != -1) {
			return true;
		}
		return false;
	}
	
	
	/**
	 * This function creates an array which prints in a spiral shape
	 * @param n
	 * @return
	 * 
	 * Preconditions:
	 * Postconditions:
	 * 
	 */
	public static int[][] genSpiralArray(int n){
		
		if (n < 0) {
			return null;
		}
		
		int z = 1;
		int t = 0;
		int l = 0;
		int r = n-1;
		int b = n-1;
		int[][] a = new int[n][n];
		
		while (z <= n*n) {
			int c1 = l;
			while (c1 <= r) {
				a[t][c1] = z;
				z++;
				c1 = c1 + 1;
			}
			t = t + 1;
			int c2 = t;
			while (c2 <= b) {
				a[c2][r] = z;
				z = z+1;
				c2 = c2 + 1;
			}
			r = r-1;
			int c3 = r;
			while (c3 >= l) {
				a[b][c3] = z;
				z = z+1;
				c3 = c3 - 1;
			}
			b = b-1;
			int c4 = b;
			while (c4 >= t) {
				a[c4][l] = z;
				z = z+1;
				c4 = c4-1;
			}
			l = l+1;
		}
		
		return a;
	}
	
	
	
	
	
	
	/**
	 * This method takes a number of Arrays and turns them into a 2D array
	 * @return
	 * 
	 * 
	 * 
	 */
	public int[][] HLP1NOV201714() {
		
		int[] values = {7, -3, 9, -1, -6, -5, 1};
		int[] rowc = {1, 1, 3, 3, 4, 7}; //Gives you the amount of rows: 6
		int[] col = {0, 2, 4, 2, 1, 4, 5};
		
		//TASK: Write the algorithm that will
		//	   	take these three arrays and create the 
		//	   	resulting 2D Array. When you run this 
		// 	   	it should return the 6 by 6 array given
		//	   	in the question.
		
		int[][] arr = new int[6][6];
		for (int r = 0; r<arr.length; r++) {
			for (int c = 0; c<arr[r].length; c++) {
				
			}
		}
		
		return null;
		
	}
	
	
	/**
	 * This method takes a 2D array of ints and prints it out in column major
	 * @param arr
	 */
	public static void print2DColumnMajor(int [][] arr){
		for (int c = 0; c < arr[0].length; c++) {
			for (int r = 0; r < arr.length; r++) {
				System.out.println(arr[r][c]);
			}
		}
	}
	
	
	/**
	 * This method takes a 2D array of ints and prints it out in row major
	 * @param arr
	 */
	public static void print2DRowMajor(int [][] arr){
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				System.out.println(arr[r][c]);
			}
		}
	}
	
	
	
	/**
	 * This method creates a random 2D array of ints using the Random class.
	 * @param rows
	 * @param columns
	 * @return
	 */
	public static int[][] createRandom2DArray(int rows, int columns){
		int[][] arr = new int[rows][columns];
		Random rand = new Random();
		//code loop
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) {
				arr[r][c] = rand.nextInt(99);
			}
		}
		return arr;
	}
	
	
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean foundElement(int a[], int b) {
		int q = 0;
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == b) {
				q = 1;
				break;
			}
		}
		
		if (q == 1) {
			return true;
		} else {
			return false;
		}
		
		
	}
	
	
	/**
	 *  This method generates a random array of Ints
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 *
	 */
	public static int[] createRandomArray(int a, int b, int c) {
		int[] arr = new int[a];
		Random rand = new Random();
		for (int i = 0; i < a; i++) {
			arr[i] = rand.nextInt(c + 1 - b)+b;
		}
		return arr;
		
	}
	
	
	
	/**
	 * This takes a number and prints it out until it reaches another number
	 * @param n
	 * 
	 * 
	 * 
	 */
	public static void test1_3_6(int n) {
		int k = 1;
		while (k<=n) {
			System.out.println(k);
			k++;
			
			
		}
	}
	
	
	/*
	public static void printMatrix(int r, int c) {
		int[][] mat = new int[r][c]; //create an array with r rows and c columns 
		
		//arrays of ints default to 0
		
		//Indexout of bounds 
		//5 rows indexs are 0 - 4
		//3 columns indexs are 0 - 2
		return 
				
		
		
	}*/
	
	
	
	/**
	 * This function takes an int and checks to see how many times it appears in an array. It then outputs the number of times.
	 * @param a
	 * @return
	 * 
	 * Preconditions: input must be an int.
	 */
	public static int countInstance(int[] a, int b) {
		
		int CNT = 0;
		
		
		for (int i = 0; i < a.length; i++) {
			if (b == a[i]) {
				CNT++;
			}
		}
		
		
		return CNT;
	}
	
	public static int countInstance(String[] a, String b) {
		
		int CNT = 0;
		
		
		for (int i = 0; i < a.length; i++) {
			if (b.equals(b)) {
				CNT++;
			}
		}
		
		
		return CNT;
	}
	
	
	
	/**
	 * 
	 * @param q
	 * 
	 * @postcondition: q is reversed
	 */
	public static void reverseQueue (Queue<String> q) {
		
		Stack<String> s = new Stack<String>();
		//Empty the queue and fill up the stack
		while (!q.isEmpty()) {
			s.push(q.remove());
		}
		//Empty the stack and put it back in the queue
		while (!s.isEmpty()) {
			q.add(s.pop());
		}
	}
	
	
	/**
	 * This Function takes an array of strings and finds the largest value alphabetically. If the array is empty
	 * the function will return null
	 * 					null = Nothing - No point of reference
	 * @param s
	 * @return
	 * 
	 * 
	 * pre - conditions: The array can be any length, but must exist
	 * post - conditions:  The array is left unchanged. 
	 * 
	 */
	public static String findAlphaSmallest(String[] s) {
		
		//BAD
		//Arrays.sort(s);
		//return s[0];
		
		String min = s[0];
		
		for (int i = 0; i < s.length; i++) {
			if (s[i].compareToIgnoreCase(min)<0) {
				min = s[i];
			}
		}
		
		return min;
		
	}
	
	
	
	
//***************************************WORK (Friday October 11, 2019) ****************************************
	
	
	/**
	 * This is an alternate implementation of findArrayDigitSum that treats the digits as a string
	 * 	
	 * @param a
	 * @return
	 * 
	 * pre-conditions: All elements must be 2 digits in length
	 * post-conditions:  "a" is not changed when the function is done
	 * 
	 */
	public static int findArrayDigitSumSTR(int[] a) {
		
		int sum = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			//CASTING - The process of changing type.
			String temp = "" + a[i];
			String n1 = temp.substring(0,1);
			String n2 = "0";
			if (temp.length()>1) {
				n2 = temp.substring(1,2);
			}
			sum = sum + Integer.parseInt(n1) + Integer.parseInt(n2); //ASSIGNMENT STATEMENT
			
		}
		
		return sum;
	}
	
	
	
	
	
	/**
	 * This function takes an array of integers and returns the sum of the digits
	 * @param a
	 * @return
	 * 
	 * pre-conditions: All elements must be 2 digits in length
	 * post-conditions:  "a" is not changed when the function is done
	 * 
	 * 
	 //*/
	public static int findArrayDigitSum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			int n = a[i]; //ASSIGNMENT STATEMENT
			int n1 = n%10;
			int n2 = n/10; //JAVA SPECIFIC INT/INT --> INT DIVISION
			sum = sum + n1 + n2;
		}
		
		return sum;
		
	}
	
	
	
	
	
	
	
	

	
	/**
	 * This code turns base 10 to base 2
	 * @param n
	 * @return
	 * 
	 * 
	 * Preconditions - r must be a valid number
	 * 
	 * 
	 * 
	 */
	public static int base10toBase2(int n) {
		
		String r = "";
		
		while (n>0) {
			int x = 0;
			x = n%2;
			n = n/2;
			r = x + r;
		}
		
		//Changing Type:
		//Changing type is called "casting"
		//In Java (and all languages) there are "shortcuts"
		
		//this scans for any error "e" and if it is detected it returns -1
		try {
			return Integer.parseInt(r);
		} catch (Exception e) {
			return -1;
		}
	}
	
	
	/**
	 * This takes base 10 and turns it into Base N
	 * N is a randomly assigned integer
	 * @param n
	 * @param base
	 * @return
	 * 
	 * 
	 * Preconditions - r must be a  valid number
	 * 
	 * 
	 */
	
	public static int base10toBaseN(int n,int base) {
		String r = "";
		
		
		while (n>0) {
			int x = 0;
			x = n%base;
			n = n/base;
			r = x + r;
		}
		
		
		return Integer.parseInt(r);
	}
	
	
	/**
	 * This method takes a base 2 value and returns the base 10 value
	 * @param n
	 * @return
	 * 
	 * pre-condition: n can only contain 1 and 0 values. 
	 */
	public static int base2toBase10(int n) {
		
		int pwr = 0;
		int r = 0;
		
		while (n > 0) {
			
			int x = n % 10;
			n = n / 10; //INTEGER DIVISION
			
			//Cast Math.pow(2,pwr) to an int
			//Casting is the process of changing type
			//When we cast a double to an int we chop off decimal
			r = r + x * (int)Math.pow(2, pwr);
			
			pwr = pwr + 1;
		
		}
		

		return r;
		
		
	}
	
	
	
	
	
//***************************************WORK (Tuesday September 24, 2019) ****************************************	
	public static void print(String s) {
		System.out.println(s);
	}
	
	/**
	 * This takes two strings a and b and returns a + b
	 * @param a
	 * @param b
	 * @return
	 * 
	 * preconditions - a and b are both valid strings
	 * postconditions - no post conditions
	 * 
	 * 
	 //*/
	public static String addStrings(String a, String b) {
		return a + b;
	}
	
	
	/**
	 * This takes a string and determines if it's length is even or odd
	 * @param a
	 * @return
	 * 
	 * Preconditions - "a" must be a valid string
	 * Postconditions - no post conditions
	 * 
	 //*/
	
	
	public static Boolean isEvenString(String a) {
		if (a.length()%2 == 1) {
			return false;
		} else {
			return true; //this works but it is not the best way to do it
		}
		
		//you can also do it this way
		/* 
		 * public static Boolean isEvenString(String a) {
		 * if (a.length()%2 == 1) {
		 * 		return false;
		 * }
			
			return true; //catch all return
			
		 //*/
	}
	
	
	/**
	 * This takes a string and an int, "a" and "n" and returns a substring of "a" n characters long
	 * @param a
	 * @param n
	 * @return
	 * 
	 * preconditions - a must be a valid string and n must be a valid int greater than 0
	 * 
	 * 
	 */
	
	
	public static String pullN(String a, int n) {
		if (n > a.length()) {
			return a;
		}
		
		return a.substring(0,n);
		
	}
	
	/**
	 * This takes a String with an odd number of letters and returns the middle letters
	 * @param a
	 * @return
	 * 
	 * preconditions - "a" must have an odd amount of letters
	 * 
	 */
	public static String findMiddleOdd(String a) {
		int pp = a.length() - 1;
		return a.substring(1,pp);
	}
	
	
	
	/**
	 * The purpose of this is to find the middle two letters of a string with an even length or the middle letter of a string with an odd length
	 * @param a
	 * @return
	 * 
	 * preconditions - valid strings
	 * 
	 */
	public static String findMiddle(String a) {
		int pk = a.length()/2;
		if (a.length()%2 == 0) {
			return a.substring(pk-1,pk+1);
		}
		
		return a.substring(pk,pk+1); //catch all return
	}
	
	/**
	 * The purpose of this is to find the longer
	 * @param a
	 * @param b
	 * @return
	 * 
	 * Preconditions -  two valid strings
	 * 
	 * 
	 */
	public static String findLong(String a, String b) {
		if (a.length()>b.length()) {
			return a;
		} else if (a.length()<b.length()) {
			return b;
		}
		
		return a + b; //catch all return
		
	}
	
	
	/**
	 * This returns the longer of two strings in front of the shorter of the two
	 * @param a
	 * @param b
	 * @return
	 */
	public static String addStringsSmallLarge(String a, String b) {
		if (a.length()>b.length()) {
			return a + b;
		} else if (a.length()<b.length()) {
			return b + a;
		}
		
		return a + b; //catch all return
		
	}
	
	
	
	/**
	 * This takes a string and swaps the first letter with the last letter and vice-a-versa
	 * @param a
	 * @return
	 */
	public static String swapFirstAndLast(String a) {
		int idk=a.length();
		return a.substring(idk-1) + a.substring(1,idk-1) + a.substring(0,1);
	}
	
	
	
	
	//I NEED HELP WITH THIS ONE
	/**
	 * This takes a string and checks to see if it fits into the beginning of another string
	 * @param a
	 * @param b
	 * @return
	 * 
	 * 
	 * 
	 */
	public static Boolean checkFront(String a, String b) {
		int bo = b.length();
		if (b.equalsIgnoreCase(a.substring(0,bo))) {
			return true;
		}else {
			return false;
		}
		
		/*
		 * Side Note:
		 * The other way to check string is to use compareTo and compareToIgnoreCase
		 * These functions return an integer value.  This means these functions can be used
		 * to assess alphabetical order based on the return. 
		 */
	}
	
	
	
	public static Boolean checkEnd(String a, String b) {
		int bo = b.length();
		if (b.equalsIgnoreCase(a.substring(0,bo))) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
	
//**********************************************CLASS WORK THURSDAY FEBRUARY 6, 2020*****************************************************
	/**
	 * This function preforms a linear search on an Array of ints
	 * @param arr
	 * @param v
	 * @return
	 * 
	 * 
	 * Postcondition: The array remains unchanged 
	 * 
	 */
	public static int linearSearch(int[] arr, int v) {
		
		for (int i = 0; i < arr.length; i++) {
			if (v == arr[i]) {
				return i;
			}
		}
		return -1;

	}
	
	/**
	 * This function performs a a linear search on an Array of Strings
	 * @param arr
	 * @param v
	 * @return
	 * 
	 * Postcondition: The array remains unchanged 
	 * 
	 */
	public static int linearSearch (String[] arr, String v) {
		
		for (int i = 0; i < arr.length; i++) {
			if (v.equals(arr[i])) {
				return i;
			}
		}
		return -1;

	}
	
	
	
//**********************************************CLASS WORK THURSDAY FEBRUARY 12, 2020*****************************************************

	/**
	 * This function performs a selection sort putting an array of Ints into numerical ascending order
	 * @param arr
	 * @return
	 */
	public static int[] selectionSort(int[] arr) {
		
		for (int i = 0; i<arr.length-1;i++) {
			int e = i;
			
			for (int j=0; j <arr.length; j++) {
				
				if (arr[j]<arr[e]) {
					e = j;
				}
			}
			if (e != i) {
				int temp = arr[e];
				arr[e] = arr[i];
				arr[i] = temp;
				
			}
		}
		
		
		return null;
	}




//**********************************************CLASS WORK THURSDAY FEBRUARY 12, 2020*****************************************************


	/**
	 * Takes a single int that sets the size of an array
	 * Takes all integer inputs. Returns the array
	 * @return
	 */
	public static int[] inputIntArray() {
		
		//STEP 1 - Create Scanner
		Scanner s = new Scanner(System.in);
		
		System.out.println("How many elements?");
		int n = s.nextInt(); //this takes the input as the length of the array
		
		int[] result = new int[n];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Input Value:");
			result [i] = s.nextInt();
		}
		
		return result;
		
	}
	
}









