public class Task05 {
	
	public static void main(String[] args) {
		
		int number = 1234567;
		
		int invertion = NumberInvertor.invert(number);
		
		Printer.print("Invertion of number " + number
				+ " - " + invertion);
	}
}