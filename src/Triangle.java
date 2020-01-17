
public class Triangle {
	
	
	//ATTRIBUTES
	
	private int aLength;
	private int bLength;
	private int bottomLength;
	private int x;
	private int y;
	
	
	//CONSTRUCTORS
	public Triangle() {}
	public Triangle(int a, int b, int bot) {
		aLength = a;
		bLength = b;
		bottomLength = bot;
	}
	public Triangle(int a, int b, int bot, int x, int y) {
		aLength = a;
		bLength = b;
		bottomLength = bot;
		this.x = x;
		this.y = y;
	}
	
	//BEHAVIOURS
	
	public int getALength() {return aLength;}
	public int getBLength() {return bLength;}
	public int getBottomLength() {return bottomLength;}
	public int getX() {return x;}
	public int getY() {return y;}
	
	public void setALength(int a) {
		if (a > 0) {
			aLength = a;
		}
	}
	
	public void setBLength(int b) {
		if (b > 0) {
			bLength = b;
		}
	}
	
	public void setBottomLength(int bot) {
		if (bot > 0) {
			bottomLength = bot;
		}
	}
	
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	
	public int getPerimeter(){
		return aLength + bLength + bottomLength;
	}
	
	
	
	
}
