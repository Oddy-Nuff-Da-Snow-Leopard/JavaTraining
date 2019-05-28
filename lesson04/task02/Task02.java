public class Task02 {
	
	public static void main(String[] args) {
		
		double r1 = 15.8;
		double r2 = 9.2;
		
		double ringArea = RingLogic.findArea(r1, r2);
		
		Printer.print("The area of the ring with an outer" 
			+ " radius of" + "\n" + r1 + " and an inner"
			+ " radius of " + r2 + " is equal to " + ringArea + "\n");
	}
}