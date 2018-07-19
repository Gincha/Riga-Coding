
public class UnitUtils {

	private static final double millToCentimeter = 10;
	private static final double centimeterToMeter = 100;
	private static final double millToMeter = millToCentimeter * centimeterToMeter;
	
	private UnitUtils() {
		
	}
	
	public static double convertPerimeter(int a, Units noKura, Units uzKuru) {
		
		double result;
		
		switch (noKura) {
		
		case Millimeters: 
			if (uzKuru == Units.Centimeters) {
				result = a/millToCentimeter;
				return result;
			}else if(uzKuru == Units.Meter) {
				result = a/millToMeter;
				return result;
			}
		case Centimeters:
			if (uzKuru == Units.Millimeters) {
				result = a*millToCentimeter;
				return result;
			}else if(uzKuru == Units.Meter) {
				result = a/centimeterToMeter;
				return result;
			}
		case Meter:
			if(uzKuru==Units.Centimeters){
				result = a/centimeterToMeter;
				return result;
			}else if(uzKuru == Units.Millimeters) {
				result = a/millToMeter;
				return result;
			}
			default:
				return a;
		}

	}
	
	public static double convertArea (int a, Units noKura, Units uzKuru) {
		double result;
		
		switch (noKura) {
		case Millimeters: 
			if (uzKuru == Units.Centimeters) {
				result = a/millToCentimeter;
				return result;
			}else if(uzKuru == Units.Meter) {
				result = a/millToMeter;
				return result;
			}
		case Centimeters:
			if (uzKuru == Units.Millimeters) {
				result = a*millToCentimeter;
				return result;
			}else if(uzKuru == Units.Meter) {
				result = a/centimeterToMeter;
				return result;
			}
		case Meter:
			if(uzKuru==Units.Centimeters){
				result = a/centimeterToMeter;
				return result;
			}else if(uzKuru == Units.Millimeters) {
				result = a/millToMeter;
				return result;
			}
			default:
				return a;
		}
}
}