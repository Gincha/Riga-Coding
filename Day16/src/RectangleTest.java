
public class RectangleTest {

	public static void main(String[] args) {

//		Rectangle taisnsturis1 = new Rectangle();
//		taisnsturis1.setPlatums(100);
//		
//		testRectangle(taisnsturis1);
		
		System.out.println("Pirmais:");
		taisnsturis1(5, 4);
		
		System.out.println("Otrais:");
		taisnsturis2(3, 8);
		
		System.out.println("Tresais");
		taisnsturis3(6);
		
		
		
//		Isaks variants !!
		
//		Rectangle taisnsturis1 = new Rectangle(5, 4);
//		Rectangle taisnsturis2 = new Rectangle(3, 8);
//		Rectangle taisnsturis3 = new Rectangle(6);
//		testRectangle(taisnsturis1);
	}
	private static void taisnsturis1(int a, int b) {
		Rectangle taisnsturis = new Rectangle(a, b);
		System.out.println("Vai taisnsturis ir kvadrats? " + taisnsturis.isSquare());
		System.out.println("Laukums ir: " + taisnsturis.area());
		System.out.println("Perimetrs ir: " + taisnsturis.perimeter());
		System.out.println("To Strings: " + taisnsturis.toString());
	}
	
	private static void taisnsturis2(int a, int b) {
		Rectangle taisnsturis = new Rectangle(a, b);
		
		System.out.println("Vai taisnsturis ir kvadrats? " + taisnsturis.isSquare());
		System.out.println("Laukums ir: " + taisnsturis.area());
		System.out.println("Perimetrs ir: " + taisnsturis.perimeter());
		System.out.println("To Strings: " + taisnsturis.toString());
	}
	
	private static void taisnsturis3(int a) {
		Rectangle taisnsturis = new Rectangle(a);
		
		System.out.println("Vai taisnsturis ir kvadrats? " + taisnsturis.isSquare());
		System.out.println("Laukums ir: " + taisnsturis.area());
		System.out.println("Perimetrs ir: " + taisnsturis.perimeter());
		System.out.println("To Strings: " + taisnsturis.toString());
	}
	
	
	

	public static void testRectangle(Rectangle taisnsturis) {
		System.out.println("Vai taisnsturis ir kvadrats? " + taisnsturis.isSquare());
		System.out.println("Laukums ir: " + taisnsturis.area());
		System.out.println("Perimetrs ir: " + taisnsturis.perimeter());
		System.out.println("To Strings: " + taisnsturis.toString());
	}
}
