public class RectangleTest {

	public static void main(String[] args) {


		
//		Rectangle taisnsturis1 = new Rectangle(5, 4);
//		Rectangle taisnsturis2 = new Rectangle(3, 8);
//		Rectangle taisnsturis3 = new Rectangle(6);
//		testRectangle(taisnsturis1);
		
		Rectangle taisnsturis1 = new Rectangle(15, 20, Units.Meter);
		
		Units targetUnit = Units.Centimeters;
		
		double result = UnitUtils.convertPerimeter(taisnsturis1.perimeter(), Units.Centimeters, Units.Meter);
		double result2 = UnitUtils.convertArea(taisnsturis1.area(), Units.Centimeters, Units.Millimeters);
		
		System.out.println("Perimetrs converted from " + targetUnit + " : " + result);
		System.out.println("Laukums converted from " + targetUnit + " -> " + result2);
		
	}
	
	

	public static void testRectangle(Rectangle taisnsturis) {
		System.out.println("Vai taisnsturis ir kvadrats? " + taisnsturis.isSquare());
		System.out.println("Laukums ir: " + taisnsturis.area());
		System.out.println("Perimetrs ir: " + taisnsturis.perimeter());
		System.out.println("To Strings: " + taisnsturis.toString());
	}
}