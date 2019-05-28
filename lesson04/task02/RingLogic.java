public class RingLogic {
	
	public static double findArea(double r1, double r2) {
		
		return (CircleLogic.findArea(r1) - CircleLogic.findArea(r2));
	}
}