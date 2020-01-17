import java.util.Scanner;



public class MagicSquares {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		



	}


	public static String magicSquares() {


		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		int f = s.nextInt();
		int g = s.nextInt();
		int h = s.nextInt();
		int i = s.nextInt();
		int j = s.nextInt();
		int k = s.nextInt();
		int l = s.nextInt();
		int m = s.nextInt();
		int n = s.nextInt();
		int o = s.nextInt();
		int p = s.nextInt();

		

		int[][] thing = { { a, b, c, d }, { e, f, g, h }, {i, j, k, l}, {m,n,o,p} } ;
		int horr1 = thing[0][0] + thing[0][1] + thing[0][2] + thing[0][3];
		int horr2 = thing[1][0] + thing[1][1] + thing[1][2] + thing[1][3];
		int horr3 = thing[2][0] + thing[2][1] + thing[2][2] + thing[2][3];
		int horr4 = thing[3][0] + thing[3][1] + thing[3][2] + thing[3][3];
		
		int vert1 = thing[0][0] + thing[1][0] + thing[2][0] + thing[3][0];
		int vert2 = thing[0][1] + thing[1][1] + thing[2][1] + thing[3][1];
		int vert3 = thing[0][2] + thing[1][2] + thing[2][2] + thing[3][2];
		int vert4 = thing[0][3] + thing[1][3] + thing[2][3] + thing[3][3];
		
		
		if (horr1 == horr2 && horr1 == horr3 && horr1 == horr4 && vert1 == vert2 && vert1 == vert3 && vert1 == vert4) {
			return "MAGIC!";
			
			
			
		}

		

		

		return "NOT MAGIC";
		
	}
}
		