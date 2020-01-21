
public class Rectangle {
	
	//FIELDS
	
	private double side1;
	private double side2;
	
	/*
	 * Static Fields:
	 * 		- Static fields are shared by all instances
	 * 		- Change a static field once and this is reflected for all instances
	 * 		- This has memory benefits specifically when there are lots of objects
	 * 		- A static field is a great way to keep track of the number of instances of a class
	 * 
	 */
	
	private static int rectCount;
	
	
	
	//CONSTRUCTORS
	
	public Rectangle() {}
	public Rectangle(double a, double b) {side1 = a; side2 = b; rectCount = rectCount + 1;}
	public Rectangle(Rectangle other) { this.side1 = other.side1; this.side2 = other.side2; rectCount = rectCount + 1;}
	
	
	
	//BEHAVIOURS
	
	public double getSide1() {return side1;}
	public double getSide2() {return side2;}
	public double getArea() {return side1 * side2;}
	
	/*
	 * Static/Class Methods:
	 * 		- Static methods CANNOT ACCESS instance fields
	 * 		- Static methods do not need an instance to be called
	 * 		- Static methods are typically called with the name of the class
	 * 		- Since the static fields of all instances is the same static methods call access static fields
	 * 		- GENERAL RULE: if a method only uses static fields make the method static
	 * 
	 * 
	 //*/
	
	public static int getRectangleCount() {return rectCount;}
	
	
	public void setSide1(double a) {if (a>0) {side1 = a;}}
	public void setSide2(double b) {if (b>0) {side2 = b;}}
	
	
	/**
	 * This method takes two Rectangle objects as a parameter and returns
	 * a new copy of the larger rectangle. Larger is defined as the rectangle
	 * with the greater area. If both rectangles have the same area then either 
	 * rectangle can be copied
	 * 
	 * @param o1
	 * @param o2
	 * @return
	 */
	public static Rectangle copyLarger(Rectangle o1, Rectangle o2){
		
		Rectangle temp; 
		
		if (o1.getArea()>o2.getArea()) {
			temp = new Rectangle(o1);
		} else {
			temp = new Rectangle(o2);
		}
		
		
		return temp;
		
	}
	
	
	public String toString() {
		String result = "Side 1: " + side1;
		result = result + "\nSide 2: " + side2;
		result = result + "\nArea: " + this.getArea();
		
		return result;
	}
	
	
}
