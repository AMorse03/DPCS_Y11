import java.util.Scanner;

public class RandomNumberGuess {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner s = new Scanner(System.in);
		int num = (int)(Math.random()*100); //creates random number
		
		System.out.println(num);
		System.out.println("What is your guess?");
		int guess = s.nextInt();
		
		
		
		
		if (guess == num ) {
			System.out.println("YEAH");
		} else {
			System.out.println("You Suck");
		}
		
		
		
		
	}

}
