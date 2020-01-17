import java.util.Arrays;

public class TempToolWork {

	
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
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}

}
