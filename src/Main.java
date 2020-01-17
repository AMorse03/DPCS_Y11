import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(tournamentSelection());
		
		
		
		
		
		
	}

	
	public static int tournamentSelection() {
		Scanner s = new Scanner(System.in);
		String[] games = {s.next(), s.next(), s.next(), s.next(), s.next(), s.next(), };
		int wincount = 0;
		
		for (int i = 0; i < games.length; i++) {
			if (games[i].equals("W")) {
				wincount++;
			}
		}
		
		if (wincount > 4) {
			return 3;
		} else if (wincount == 3 || wincount == 4) {
			return 2;
		} else if (wincount == 2 || wincount == 1) {
			return 1;
		} else if (wincount == 0){
			return -1;
		}
		
		return 0;
		
	}
	
	
	
	
	
}
