import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ToolsRunner {
	//THIS CLASS IS THE RUNNER FOR MY TOOLS CLASS
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//***Commonly Used Variables***
		int x = 0;
		int y = 0;
		int z = 0;
		int n = 0;
		
		
		$AANM.print("Andrew");
		
		
		//Test code addStrings
		System.out.println($AANM.addStrings("Pual"," Name"));
		
		
		//Test code isEvenstring
		System.out.println($AANM.isEvenString("even"));
		
		//Test code pullN
		System.out.println($AANM.pullN("Plymouth", 6));
		
		
		//Test code findMiddleOdd
		System.out.println($AANM.findMiddleOdd("Hello"));
		
		//Test code findMiddle
		System.out.println($AANM.findMiddle("Plymouth"));
		System.out.println($AANM.findMiddle("Ode"));
		System.out.println($AANM.findMiddle("shucks"));
		System.out.println($AANM.findMiddle("Hiplo"));
		
		//Test code findLonger
		System.out.println($AANM.findLong("butts", "hi"));
		
		
		//Test code addStringSmallLarge
		System.out.println($AANM.addStringsSmallLarge("hi", "bye"));
		System.out.println($AANM.addStringsSmallLarge("WHAT????", "YOU NEVER?"));
		System.out.println($AANM.addStringsSmallLarge("hi", "hi"));
		
		//Test code swapFirstAndLast
		System.out.println($AANM.swapFirstAndLast("string"));
		
		//Test code checkFront
		System.out.println($AANM.checkFront("oddly","odd"));
		
		
		
		
//***************************************WORK (Monday September 30, 2019) ***************************************
		System.out.println($AANM.base10toBase2(400));
		
		System.out.println($AANM.base10toBaseN(723, 16));
		
		System.out.println($AANM.base2toBase10(100100));

		
		
//***************************************WORK (Thursday October 10, 2019) ***************************************
		int[] sample = {598, 21, 92, 88};
		System.out.println($AANM.findArrayDigitSum(sample));
		

		
		
//***************************************WORK (Friday October 11, 2019) ***************************************
		
		System.out.println($AANM.findArrayDigitSumSTR(sample));
		

		
//***************************************WORK () ***************************************

		Queue<String> q1 = new LinkedList<>();
		q1.add("one");//
		q1.add("two");
		q1.add("three");
		System.out.println(q1);
		$AANM.reverseQueue(q1);
		System.out.println(q1);
		
		
		int[] arr = {7,7,7,7,8,6};
		System.out.println($AANM.countInstance(arr, 7));
		

		
//***************************************WORK (Thursday November 14, 2019) ***************************************
		$AANM.test1_3_6(3);
		//printMatrix(2,3);
	
	
//***************************************WORK (Monday November 18, 2019) ***************************************

		int[] result = $AANM.createRandomArray(4, 2, 16);
		System.out.println(Arrays.toString(result));
		
		System.out.println($AANM.foundElement(result, 16));
	

	
//***************************************WORK (Tuesday November 19, 2019) ***************************************
		int[][] result1 = $AANM.createRandom2DArray(2,2);
		//System.out.println(Arrays.toString(result1[0]));
		
		$AANM.print2DRowMajor(result1);
		$AANM.print2DColumnMajor(result1);
	
	
//***************************************WORK (Friday November 22, 2019) ***************************************

	
//***************************************WORK (Tuesday November 26, 2019) ***************************************

		int[][] spiral = $AANM.genSpiralArray(5);
		for (int r = 0; r<spiral.length; r++) {
			for (int c = 0; c<spiral[r].length; c++) {
				System.out.print(spiral[r][c] + " ");
			}
			System.out.println("");
		}
	
//***************************************WORK (Thursday November 27, 2019) ***************************************
		//Reference type = object type (Constructing the ArrayList)
		ArrayList<Integer> list = new ArrayList<Integer>();
						//list = {}
		list.add(1); //list = {1}
		list.add(2); //list = {1,2}
		list.add(3); //list = {1,2,3}
		list.remove(1); //removes at the index (in this case would be index 1) -- list = {1, 3} 				
		//Question: How do I remove the number 3? How do I do it with one line of code assuming I don't know the index
				
		list.remove(new Integer(3));				
		list.add(2);
		list.add(3);
		list.add(1,9);
		list.set(2, 12);
		list.trimToSize();
		//Gets rid of unused stuff to optimize the ArrayList
		list.add(9);
		list.add(list.indexOf(12));
		list.add(2);
		list.remove(new Integer(9)); //Removes the first instance of the number - (in this case it will remove the first nine)
		System.out.println(list);
		int sum = 0;
				
				
				
		for (int i = list.size()-1; i >= 0; i--) {
			if (list.get(i) == 2) {
				sum = sum + list.remove(i);
				//list.remove(i);
			}
		}
						
		System.out.print(list);
		System.out.println(" - " + sum);
				
				
		ArrayList<Character> list2 = new ArrayList<Character>();
				
				
		String vowels = "";
				//ArrayList is populated with random characters
		list2.add('a');
		list2.add('b');
		list2.add('w');
		list2.add('y');
		list2.add('u');
		list2.add('o');
		list2.add('p');
		list2.add('i');
		list2.add('q');
		//System.out.println(list2);
				
		for (int i = list2.size()-1; i >= 0; i--) {
			if($AANM.isVowel(list2.get(i))) {
						
				vowels = vowels + list2.remove(i);
				//list.remove(i);
						
			}//end if		
		}//end for		
		System.out.println(list2);
	
	}//END MAIN
	
}
