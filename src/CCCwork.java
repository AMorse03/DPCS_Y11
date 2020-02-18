import java.util.Arrays;
import java.util.Comparator;


public class CCCwork {

	public static void main(String[] args) {
		//int test = (int) (Math.floor(Math.random()*1000000001));
		System.out.println(question());
		
	}
	
	
	static int randomWithRange(int min, int max) {
		   int range = (max - min) + 1;     
		   return (int)(Math.random() * range) + min;
		}
	
	
	public static int question() {
		double x = Math.random()*10000;
		int y = (int) (x);
		int[] input = new int[y];
		int[] input2 = new int[y];
		
		for (int i = 0; i<input.length; i++) {
			input[i] = randomWithRange(0,1000000000);
		}
		
		
		
		for (int i = 0; i<input2.length; i++) {
			input2[i] = randomWithRange(-1000000000,1000000000);
			
		}
		 
		
		
		int div = input[0]- input[1];
		int num = input2[0] - input2[1];
		int temp = num/div;
		int temp2 = 0;
		
		for (int i = 0; i<y; i++) {
			div = input[i]- input[i+1];
			num = input2[i] - input2[i+1];
			if (num/div > temp) {
				temp = num/div;
			}
			
		}
		
		if (temp<0) {
			temp = temp * -1;
		}
		
		
		
		
		return temp;
	}

}
