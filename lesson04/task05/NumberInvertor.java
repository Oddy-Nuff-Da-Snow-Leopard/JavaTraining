public class NumberInvertor {
	
	private static final int TEN = 10;
	
	private static final int DEGREE1 = 1;
	private static final int DEGREE2 = 2;
	private static final int DEGREE3 = 3;
	private static final int DEGREE4 = 4;
	private static final int DEGREE5 = 5;
	private static final int DEGREE6 = 6;
	
	public static int invert(int number) {
	
		int digit7 = number % TEN;
		
		number /= TEN;
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
		
		
		digit7 *= (int)Math.pow(TEN, DEGREE6);
		digit6 *= (int)Math.pow(TEN, DEGREE5);
		digit5 *= (int)Math.pow(TEN, DEGREE4);
		digit4 *= (int)Math.pow(TEN, DEGREE3);
		digit3 *= (int)Math.pow(TEN, DEGREE2);
		digit2 *= (int)Math.pow(TEN, DEGREE1);
		
		return digit7 + digit6 + digit5 + digit4 + digit3
			+ digit2 + digit1;
	}
}