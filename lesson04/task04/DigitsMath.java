public class DigitsMath {

	private static final int NUMBER_OF_DIGITS = 6;

	public static double findArithmeticAverage(int number) {
	
		int digit6 = number % 10;
		
		number /= 10;
		int digit5 = number % 10;
		
		number /= 10;
		int digit4 = number % 10;
		
		number /= 10;
		int digit3 = number % 10;
		
		number /= 10;
		int digit2 = number % 10;
		
		int digit1 = number /= 10;
		
		double sumOfDigits = digit1 + digit2 + digit3 +
			digit4 + digit5 + digit6;
		
		return sumOfDigits / NUMBER_OF_DIGITS;
	}
	
	public static double findGeometricAverage(int number) {
	
		int digit6 = number % 10;
		
		number /= 10;
		int digit5 = number % 10;
		
		number /= 10;
		int digit4 = number % 10;
		
		number /= 10;
		int digit3 = number % 10;
		
		number /= 10;
		int digit2 = number % 10;
		
		int digit1 = number /= 10;
		
		double compositionOfDigits = digit1 * digit2 *
			digit3 * digit4 * digit5 * digit6;
		
		return Math.pow(compositionOfDigits, 1./NUMBER_OF_DIGITS);
	}
}