public class Task04 {
	
	public static void main(String[] args) {

		int number = 345678;
		
		double arithmeticAvg = DigitsMath.findArithmeticAverage(number);
		double geometricAvg = DigitsMath.findGeometricAverage(number);
		
		Printer.print("Arithmetic average of digits of number "
			+ number + " is " + arithmeticAvg + "\n");
				
		Printer.print("Geometric average of digits of number "
			+ number + " is " + geometricAvg + "\n");
	}
}