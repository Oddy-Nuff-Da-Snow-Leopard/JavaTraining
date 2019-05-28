public class DigitsMath {
	
	private static final int TEN = 10;

	private static final int NUMBER_OF_DIGITS = 6;
	
	private static final double DEGREE = 1. / NUMBER_OF_DIGITS;

	public static double findArithmeticAverage(int number) {
	
		int digit6 = number % TEN;
		
		number /= TEN;
		int digit5 = number % TEN;
		
		number /= TEN;
		int digit4 = number % TEN;
		
		number /= TEN;
		int digit3 = number % TEN;
		
		number /= TEN;
		int digit2 = number % TEN;
		
		int digit1 = number / TEN;
		
		double sumOfDigits = digit1 + digit2 + digit3
			+ digit4 + digit5 + digit6;
		
		return sumOfDigits / NUMBER_OF_DIGITS;
	}
	
	public static double findGeometricAverage(int number) {
	
		int digit6 = number % TEN;
		
		number /= TEN;
		int digit5 = number % TEN;
		
		number /= TEN;
		int digit4 = number % TEN;
		
		number /= TEN;
		int digit3 = number % TEN;
		
		number /= TEN;
		int digit2 = number % TEN;
		
		int digit1 = number / TEN;
		
		double compositionOfDigits = digit1 * digit2 * digit3
			* digit4 * digit5 * digit6;
		
		return Math.pow(compositionOfDigits, DEGREE);
	}
}