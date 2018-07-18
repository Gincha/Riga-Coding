
public class RectangleTest {

	public static void main(String[] args) {

		System.out.println("Pirmais:");
		taisnsturis1(5, 4);
		System.out.println("Otrais:");
		taisnsturis2(3, 8);
		System.out.println("Tresais");
		taisnsturis3(6, 6);
		
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
	
	private static void taisnsturis3(int a, int b) {
		Rectangle taisnsturis = new Rectangle(a, b);
		
		System.out.println("Vai taisnsturis ir kvadrats? " + taisnsturis.isSquare());
		System.out.println("Laukums ir: " + taisnsturis.area());
		System.out.println("Perimetrs ir: " + taisnsturis.perimeter());
		System.out.println("To Strings: " + taisnsturis.toString());
	}

}
