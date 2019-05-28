public class DigitsSequenceChecker {
	
	public static boolean isIncreasing(int number) {
		
		int digit4 = number % 10;
		
		number /= 10;
		int digit3 = number % 10;
		
		number /= 10;
		int digit2 = number % 10;
		
		int digit1 = number / 10;
		
		return digit1 < digit2 && digit2 < digit3 && digit3 < digit4;
	}
	
	public static boolean isDecreasing(int number) {
		
		int digit4 = number % 10;
		
		number /= 10;
		int digit3 = number % 10;
		
		number /= 10;
		int digit2 = number % 10;
		
		int digit1 = number / 10;
		
		return digit1 > digit2 && digit2 > digit3 && digit3 > digit4;
	}	
}