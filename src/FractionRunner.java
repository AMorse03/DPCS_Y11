
public class FractionRunner {

	public static void main(String[] args) {
		//Fraction f1; //Reference Type - Defaults to NULL
		//f1 = new Fraction(); //Object Type - Calls the constructor
		Fraction f1 = new Fraction();//you can also do this in one line
		System.out.println(Fraction.getFractionCount());
		Fraction f2 = new Fraction();
		System.out.println(Fraction.getFractionCount());
		Fraction f3 = new Fraction(34,1000);
		System.out.println(Fraction.getFractionCount());
		Fraction f4 = new Fraction(75,100);
		System.out.println(Fraction.getFractionCount());
		Fraction f5 = Fraction.createNewFraction(f1, f2);
		System.out.println(Fraction.getFractionCount());
		Fraction f6 = Fraction.createNewFraction(f3, f2);
		System.out.println(Fraction.getFractionCount());
		
		System.out.print("\n");
		
		f1.setNum(145);
		f1.setDen(200);
		
		System.out.println(f1.getNum()+"/"+f1.getDen());
		f1.reduce();
		System.out.println(f1.getNum()+"/"+f1.getDen());
		
		System.out.print("\n");
		
		System.out.println(f1.getDecimal());
		System.out.println(f1.getPercentage());	
		
		System.out.print("\n");
		
		f3.addFraction(f2);
		f4.multiplyFraction(f2);
		
		System.out.println(f3.getNum()+"/"+f3.getDen());
		System.out.println(f4.getNum()+"/"+f4.getDen());
		
		System.out.println(f5.getNum()+"/"+f5.getDen());
		
		
		
		
		
		
		
		
		
		
	}

}
