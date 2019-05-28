public class NumbersChecker {
	
	public static boolean isSame(double a, double b, double c) {
		
		return a == b && b == c;
	}
	
	public static boolean isDifferent(double a, double b, double c) {
		
		return a != b && b != c && a != c;
	}
	
}