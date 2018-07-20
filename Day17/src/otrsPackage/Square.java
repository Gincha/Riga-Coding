package otrsPackage;

public class Square extends Rectangle {

	public Square(int garums, Units unit, String color) {
		setPlatums(garums);
		setGarums(garums);
		setUnit(unit);
		setColor(color);
		
	}

	
	@Override
	public String toString() {
		
		return "Kvadrats[garums= " + getPlatums() + " unita nosaukums= " + getUnit() + " un krasa=" + getColor() + "]";
	}
	
	
}
