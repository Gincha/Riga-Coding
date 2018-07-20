package otrsPackage;

import paka.UnitUtils;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle forma = new Rectangle();
		
		forma.setColor("oranzs");
		System.out.println("Shape formas krasa = " + forma.getColor());


		
		Square kvadrats = new Square(10, Units.Centimeters, "balts");
		
		double kvadratsResult = kvadrats.area();
		System.out.println("Kvadrata krasa = " + kvadrats.getColor());
		kvadrats.setColor("melns");
		System.out.println("Kvadrata laukums: " +kvadratsResult);
		System.out.println("Kvadrata perimetrs: " +kvadrats.perimeter());
		System.out.println("Kvadrata toString: " +kvadrats.toString());
//		System.out.println("Kvadrata krasa = " + kvadrats.getColor());
		
		
//		Rectangle taisnsturis1 = new Rectangle(5, 4);
//		Rectangle taisnsturis2 = new Rectangle(3, 8);
//		Rectangle taisnsturis3 = new Rectangle(6);
//		testRectangle(taisnsturis1);
		
		Rectangle taisnsturis1 = new Rectangle(15, 20, Units.Centimeters, "");
		
		Units targetUnit = Units.Centimeters;
		
		double result = UnitUtils.convertPerimeter(taisnsturis1.perimeter(), Units.Centimeters, Units.Meters);
		double result2 = UnitUtils.convertArea(taisnsturis1.area(), Units.Centimeters, Units.Meters);
		
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