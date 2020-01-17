import java.util.ArrayList;

public class ListDemo {

	
	public static boolean isVowel(char c) {
		
		
		if (c == 'a' || c == 'A'|| c == 'e'|| c == 'E' || c == 'i'|| c == 'I' || c == 'o' || c == 'O'|| c == 'u' || c == 'U') {
			return true;
		}
		
		return false;
	}
	
	public static boolean isVowel(String a) {
		
		
		if ("aeiou".indexOf(a) != -1) {
			return true;
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		
		//Reference type = object type (Constructing the ArrayList)
		ArrayList<Integer> list = new ArrayList<Integer>();
					 //list = {}
		list.add(1); //list = {1}
		//System.out.println(list);
		list.add(2); //list = {1,2}
		//System.out.println(list);
		list.add(3); //list = {1,2,3}
		//System.out.println(list);
		list.remove(1); //removes at the index (in this case would be index 1) -- list = {1, 3} 
		//System.out.println(list);
		
		//Question: How do I remove the number 3? How do I do it with one line of code assuming I don't know the index
		
		list.remove(new Integer(3));
		//System.out.println(list);
		
		list.add(2);
		//System.out.println(list);
		list.add(3);
		//System.out.println(list);
		list.add(1,9);
		//System.out.println(list);
		list.set(2, 12);
		//System.out.println(list);
		list.trimToSize();
		//Gets rid of unused stuff to optimize the ArrayList
		list.add(9);
		//System.out.println
		list.add(list.indexOf(12));
		//System.out.println(list);
		list.add(2);
		//System.out.println(list);
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
		System.out.println(list2);
		
		for (int i = list2.size()-1; i >= 0; i--) {
			if(isVowel(list2.get(i))) {
				
				vowels = vowels + list2.remove(i);
				
				//list.remove(i);
				
			}//end if
			
		}//end for
		
		System.out.println(list2);

	}

}
