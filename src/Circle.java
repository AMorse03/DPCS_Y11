
public class Circle {
	
	//ATTRIBUTES AND FIELDS
	private double rad;
	private int x;
	private int y;
	private final double PI = Math.PI;
	
	
	//CONSTRUCTORS
	public Circle () {}
	public Circle(int r) {rad = r;}
	public Circle (int r, int x, int y) {
		rad = r;
		this.x = x;
		this.y = y;
	}

	
	
	//BEHAVIOURS
	
	
	
	public void changeRad(double scale, boolean multiply) {
		if (multiply == true) {
			rad = rad * scale;
		} else {
			rad = rad / scale;
		}
	}
	public double getCircumference() {return 2*PI*rad;}
	public double getArea() {return PI*rad*rad;}
	
	
		//Getters
	public double getRad() {return rad;}
	public int getX() {return x;}
	public int getY() {return y;}
	
		//Setters
	public void setRad(double r) {
		if (r >= 0) {
			rad = r;
		}
	}
	public void setX(int a) {x = a;}
	public void setY(int b) {y = b;}
	
	
	
}