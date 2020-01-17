
public class ContestPractice {

	public static void main(String[] args) {
		//Advice 1: GET OUT OF THE MAIN!
		
		System.out.println(questions());
		
		
	}
	
	public static String questions() {
		//Advice 2: Don't take inputs until you are done.
		String input = "SHINS";
		//String input = "NOISE";
		//String input = "HAIR";
		
		for (int i = 0; i < input.length(); i++ ) {
			
			char temp = input.charAt(i);
			
			if (temp != 'O' && temp !='I' && temp !='S' && temp != 'H' && temp !='Z' && temp !='X' && temp != 'N' ) {
				
				
				return "NO";
			
			
			}
		}
		return "YES";
	}
}
		
		
