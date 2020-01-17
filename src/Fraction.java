/**
 * @author andrew.morse
 *A class is a "blueprint" an object is an instance of
 *The blueprint to build a bike is the class, a bike is the object
 *
 *
 */

public class Fraction {
	
	
	/*Attributes/Fields
	 	*Suggestion - Never use the same variable name that a field is in your class
	//*/
	
	private int num;
	private int den;
	private static int fractionCount = 0;
	
	
	//Constructors
		//IF NO CONSTRUCTOR IS WRITEEN A DEFULT CONSTRUCTOR
		//ECISTS - TAKES NO PARAMETERS SETS
		//	NUMERIC = 0
		//	BOOLEANS = FALSE
		//	REFERENCE TYPES = NULL
		
		
		//CONSTRUCTORS ARE SPECIAL INSTANCE METHODS THAT ARE ONLY
		//CALLED ONCE AT TIME OF CONSTRUCTION
		//	A CONSTRUCTOR DOES NOT INDICATE A RETURN TYPE
		//	A CONSTRUCTOR MUST BE PUBLIC
		//	A CONSTRUCTOR IS ALWAYS NAMED USING CLASS NAME
		//	IF YOU WRITE A CUSTOM CONSTRUCTOR THE DEFAULT ONE GOES AWAY
	
	
	/**
	 * THIS IS THE DEFAULT CONSTRUCTOR FOR A FRACTION
	 * If the constructor is passed no parameters it defaults to being "1/2"
	 */
	public Fraction () {
		num = 1;
		den = 2;
		fractionCount = fractionCount + 1;
	}
	/**
	 * THIS IS AN OVERLOADED CONSTRUCTOR FOR A FRACTION
	 * IT TAKES TWO PARAMETERS ('n' and 'd') WHICH REPRESENT THE NUMERATOR AND DENOMERATOR
	 * @param n
	 * @param d
	 * 
	 * IT CHECKS TO MAKE SURE THAT THE 'DEN' ISN'T 0
	 * 		IF 'd = 0' IT IS THEN DEFAULTED TO 1
	 * 
	 */
	public Fraction (int n, int d) {
		num = n;
		if (d != 0) {
			den = d;
		} else {
			den = 1;
		}
		fractionCount = fractionCount + 1;
	}
	
	
	
	//Behaviors
	
	public static Fraction createNewFraction(Fraction f1, Fraction f2) {
		Fraction fNew = new Fraction();
		fNew.num = f1.num * f2.num;
		fNew.den = f1.den * f2.den;
		
		return fNew;
	}
	
	/**
	 * THIS IS THE GETTER FOR 'Num' and 'Den'
	 * 		IT ALLOWS YOU TO ACCESS THE PRIVATE INT
	 * @return
	 */
		//ACCESSOR (GET) METHODS
	public int getNum() {return num;}
	public int getDen() {return den;}
	public static int getFractionCount() {return fractionCount;}
	
	/**
	 * THESE ARE THE SETTERS FOR THE 'Num' and 'Den' WHICH ALLOW YOU TO CHANGE THE PRIVATE INTS 
	 * (GIVEN THAT THEY ARE WITHIN THE SET RESTRICTIONS)
	 * @param n
	 */
		//MUTATOR (SET) METHODS
	public void setNum(int n) {
		num = n;
	}
	public void setDen(int d) {
		if (d!= 0) {
		den = d;
		}
	}
	
	
	
	
	
	/**
	 * THIS REDUCES A FRACTION TO ITS LOWEST FORM
	 */
	public void reduce() {
		
		int gcf = 1;
		
		for (int i = 2; i < Math.min(this.num, this.den); i++) {
			if (this.num%i == 0 && this.den%i == 0) {
				gcf = i;
			}//end if
		}//end for
		
		this.num = this.num/gcf;
		this.den = this.den/gcf;
		
		
	}//end reduce
	
	/**
	 * THIS GETS AND RETURNS THE PERCENTAGE OF THE FRACTION
	 * @return
	 */
	public double getPercentage() {
		double dec = 1.0*num/den;
		double percent = dec*100;
		return percent;
	}//end getPercentage
	
	/**
	 * THIS GETS AND RETURNS THE DECIMAL OF THE FRACTION
	 * @return
	 */
	public double getDecimal(){
		double dec = 1.0*num/den;
		return dec;
	}//end getDecimal
	
	/**
	 * THIS ADDS TWO FRACTIONS TOGETHER
	 * @param f
	 */
	public void addFraction(Fraction f) {
		
		num = num * f.den + f.num * den;
		den = den * f.den;
		int lowest = num;
		
		if(den < lowest) {
			lowest = den;
		}

		for (int i = 2; i <= lowest; i++) {
			if(num % i == 0 && den % i == 0 ) {
				num = num/i;

				den = den/i;					
				// this is included in case a number can be

				// divided to "i" multiple times 
				i = i - 1;
			}
		}
	}
	
	
	/**
	 * THIS MULTIPLIES TWO  FRACTIONS TOGETHER
	 * @param f
	 */
	public void multiplyFraction(Fraction f) {
		num = num * f.num;
		den = den * f.den;			
		
	}
	
} //end class
