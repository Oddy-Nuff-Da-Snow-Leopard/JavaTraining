public class Task01 {
	
	public static void main(String[] args) {
	
		double a = 2.1;
		double b = 3.2;
		double c = 4.4;
		
		boolean isSame = NumbersChecker.isSame(a, b, c);
		boolean isDifferent = NumbersChecker.isDifferent(a, b, c);
		
		Printer.print("Are the numbers " + a + ", " + b + " and " + c 
			+ " the same? " + isSame + "\n");
			
		Printer.print("Are the numbers " + a + ", " + b + " and " + c 
			+ " different? " + isDifferent + "\n");
	}
}
		