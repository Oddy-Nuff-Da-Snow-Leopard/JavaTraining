public class DigitsSequenceChecker {
	
	private static final int TEN = 10;
	
	public static boolean isIncreasing(int number) {
		
		int digit4 = number % TEN;
		
		number /= TEN;
		int digit3 = number % TEN;
		
		number /= TEN;
		int digit2 = number % TEN;
		
		int digit1 = number / TEN;
		
		return digit1 < digit2 && digit2 < digit3 && digit3 < digit4;
	}
	
	public static boolean isDecreasing(int number) {
		
		int digit4 = number % TEN;
		
		number /= TEN;
		int digit3 = number % TEN;
		
		number /= TEN;
		int digit2 = number % TEN;
		
		int digit1 = number / TEN;
		
		return digit1 > digit2 && digit2 > digit3 && digit3 > digit4;
	}	
}