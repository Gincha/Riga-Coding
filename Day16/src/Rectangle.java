
public class Rectangle {

	int garums;
	int platums;
	
	public boolean isSquare() {
		
		if(garums==platums) {
			return true;
		}else {
			return false;
		}
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
	
	
	public Rectangle () {
		
	}
		public Rectangle(int a, int b) {
			this.garums = a;
			this.platums = b;
		}
		
		public Rectangle (int a) {
			if (isSquare()) {
				this.garums=a;
			}
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
