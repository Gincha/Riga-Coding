package otrsPackage;


public class Rectangle extends Shape {

	private int garums;
	private int platums;
	private Units unit;		//laukus taisa ar mazo burtu
	
	public Rectangle () {
		this(0, 0, Units.Centimeters, "oranzs");			

	}
	

	public Rectangle(int garums, int platums, Units unit, String color) {
		this.garums = garums;		//this attiecas uz konkretam lietam, lai pateiktu, ka tas ir tieshi tas
		this.platums = platums;
		this.unit = unit;
		setColor(color);
	}
	
//	public Rectangle (int garums, Units unit) {
//		this.garums = garums;
//		this.platums = garums;
//		this.unit = unit;
//	}
	
	
	public Units getUnit() {
		return unit;
	}
	
	
	
	public void setUnit(Units unit) {
		this.unit = unit;
	}


	public int getGarums() {		//geteris
		return garums;
	}
	
	public int getPlatums() {
		return platums;
	}
	
	
	public void setGarums(int garums) {
		this.garums = garums;
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
