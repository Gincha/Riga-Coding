
public class Rectangle {

	private int garums;
	private int platums;
	private Units unit;		//laukus taisa ar mazo burtu
	
	public Rectangle () {
		this(0, Units.Centimeters);			

	}
	

	public Rectangle(int garums, int platums, Units unit) {
		this.garums = garums;		//this attiecas uz konkretam lietam, lai pateiktu, ka tas ir tieshi tas
		this.platums = platums;
		this.unit = unit;
	}
	
	public Rectangle (int garums, Units unit) {
		this.garums = garums;
		this.platums = garums;
		this.unit = unit;
	}
	
	
	public Units getUnit() {
		return unit;
	}
	
	
	
	public int getHeight() {		//geteris
		return garums;
	}
	
	public int getPlatums() {
		return platums;
	}
	
	
	public void setPlatums(int platums) {	//seteris
		this.platums = platums;
	}
	
	
	
	public boolean isSquare() {
		return garums==platums;
	}
	
	public  int area() {
		return garums*platums;
	}
	
	
	public  int perimeter() {
		return garums*2+platums*2;
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [garums=" + garums + ", platums=" + platums + "]";
	}
}
