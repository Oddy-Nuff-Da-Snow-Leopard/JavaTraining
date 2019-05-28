public class Task03 {
	
	public static void main(String[] args) {
		
		int number1 = 1479;
		int number2 = 9541;
		
		boolean isIncr = DigitsSequenceChecker.isIncreasing(number1);
		boolean isDesc = DigitsSequenceChecker.isDecreasing(number2);
		
		Printer.print("Are the digits of number " + number1
				+ " form an increasing sequence? " + isIncr + "\n");
				
		Printer.print("Are the digits of number " + number2
				+ " form a decreasing sequence? " + isDesc + "\n");
	}
}