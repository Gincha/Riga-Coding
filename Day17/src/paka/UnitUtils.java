package paka;

import otrsPackage.Units;

public class UnitUtils {

	private static final double millToCentimeter = 10;
	private static final double centimeterToMeter = 100;
	private static final double millToMeter = millToCentimeter * centimeterToMeter;
	
	private static final double millToCentimeterArea = 100;
	private static final double centimeterToMeterArea = 10000;
	private static final double millToMeterArea = millToCentimeterArea * centimeterToMeterArea;
	
	private UnitUtils() {
		
	}
	
	public static double convertPerimeter(int a, Units noKura, Units uzKuru) {
		
		double result;
		
		switch (noKura) {
		
		case Millimeters: 
			if (uzKuru == Units.Centimeters) {
				result = a/millToCentimeter;
				return result;
			}else if(uzKuru == Units.Meters) {
				result = a/millToMeter;
				return result;
			}
		case Centimeters:
			if (uzKuru == Units.Millimeters) {
				result = a*millToCentimeter;
				return result;
			}else if(uzKuru == Units.Meters) {
				result = a/centimeterToMeter;
				return result;
			}
		case Meters:
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
				result = a/millToCentimeterArea;
				return result;
			}else if(uzKuru == Units.Meters) {
				result = a/millToMeterArea;
				return result;
			}
		case Centimeters:
			if (uzKuru == Units.Millimeters) {
				result = a*millToCentimeterArea;
				return result;
			}else if(uzKuru == Units.Meters) {
				result = a/centimeterToMeterArea;
				return result;
			}
		case Meters:
			if(uzKuru==Units.Centimeters){
				result = a/centimeterToMeterArea;
				return result;
			}else if(uzKuru == Units.Millimeters) {
				result = a/millToMeterArea;
				return result;
			}
			default:
				return a;
		}
}
}