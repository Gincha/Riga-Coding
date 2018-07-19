
public class Rectangle {

	private int garums;
	private int platums;
	
	public Rectangle () {
		this(0,0);			//nokluseta konstruktora izsauc konstruktoru ar svarigakajiem parametriem
//		garums =0;			//ja izsauc tad izsauc pirmo
//		platums=0;
	}

	public Rectangle(int garums, int platums) {
		this.garums = garums;		//this attiecas uz konkretam lietam, lai pateiktu, ka tas ir tieshi tas
		this.platums = platums;
	}
	
	public Rectangle (int garums) {
		this.garums = garums;
		this.platums = garums;
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
		
		if(garums==platums) {
			return true;
		}else {
			return false;
		}
		
//		isaks pieraksts
//		return garums==platums;
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
	
	

		

		
		
//	public class Animal {
//
//		private static String message = "My name is: ";
//
//		private String name;
//
//		public Animal(String name) {
//			this.name = name;
//		}
//		
//		public void sayMyName() {
//			 System.out.println(message + name);
//		}
//
//		@Override
//		public String toString() {
//			return "Animal [name=" + name + "]";
//		}
//
//	}




	

	
}
