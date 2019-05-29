public class Task01 {
	
	public static void main(String[] args) {
	
		double a = 2.1;
		double b = 3.2;
		double c = 4.4;
		
		boolean isEquals = NumbersChecker.isEquals(a, b, c);
		
		Printer.print("Are the numbers " + a + ", " + b + " and " + c 
			+ " equals? " + isEquals + "\n");
		
		
		a = 1;
		b = 1;
		c = 1;
		
		isEquals = NumbersChecker.isEquals(a, b, c);
		
		Printer.print("Are the numbers " + a + ", " + b + " and " + c 
			+ " equals? " + isEquals + "\n");
			
	}
}
		