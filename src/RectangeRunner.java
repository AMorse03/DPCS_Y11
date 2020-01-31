
public class RectangeRunner {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10,5);
		Rectangle r2 = new Rectangle(4,4);
		Rectangle r3 = new Rectangle(r1);
		Rectangle r4 = new Rectangle(25,31); 
		
		System.out.println(Rectangle.getRectangleCount());
		
		Rectangle r5 = Rectangle.copyLarger(r4, r1);
		
		
		//THIS AUTOMATICALLY CALLS toString - BUILT IN JAVA RULE
		System.out.println(r5);
		//EQUALLY AS VALID
		System.out.println(r5.toString());
		
		System.out.println(Rectangle.getRectangleCount());
		
		
		
	}

}
