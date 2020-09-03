public class Main{
	public static void main(String[] args) {

		rationalNumbers a = new rationalNumbers(1, 2);
		rationalNumbers b = new rationalNumbers(3, 4);

	    System.out.println(a + " + " + b + " = " + a.add(b));
	    System.out.println(a + " - " + b + " = " + a.sub(b));
	    System.out.println(a + " * " + b + " = " + a.mul(b));
	    System.out.println(a + " / " + b + " = " + a.div(b));
	  }
}

class rationalNumbers {
	private int numer;
	private int denom;
	private int remainder;
	
	
	public rationalNumbers(int numer, int denom) {
		this.numer = numer / gcd(numer, denom);
	    this.denom = denom / gcd(numer, denom);
	}
	
	public rationalNumbers add(rationalNumbers o) {
		return new rationalNumbers((numer*o.denom) + (o.numer*denom), denom * o.denom);
	}
	
	public rationalNumbers sub(rationalNumbers o) {
		return new rationalNumbers((numer*o.denom) - (o.numer*denom), denom * o.denom);
	}
	
	public rationalNumbers mul(rationalNumbers o) {
		return new rationalNumbers(numer*o.numer , denom * o.denom);
	}
	
	public rationalNumbers div(rationalNumbers o) {
		return new rationalNumbers(numer*o.denom , denom * o.numer);
	}
	
	public int gcd(int numerator, int denominator) {
		while (denominator != 0) {
			remainder = numerator % denominator;
			numerator = denominator;
			denominator = remainder;
		}
        return (numerator);
	}
	
	public String toString() {
		return "(" + numer + " / " + denom + ")";
	}

	
}