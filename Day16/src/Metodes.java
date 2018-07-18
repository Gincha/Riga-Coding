import java.util.Scanner;

public class Metodes {

	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		System.out.println(cubeNumber(5));
		
		
		System.out.println(smallestNumber(101, 25, 15));
		
		int[] arajs = {4, 5, 2 , 1, 3, 2, 1, 8};
		
		System.out.println(averageArr(arajs));
	}
	
	private static int cubeNumber(int a) {
		
		return a*a*a;
	}
	
	
	private static int smallestNumber (int a, int b, int c) {
//		if(a>b &&b>c) {
//			return c;
//		}else if(b>c && c>a) {
//			return a;
//		}else if(c>a &&a>b) {
//			return b;
//		}else {
//			return a;
//		}
		
		return Math.min(a, Math.min(b, c));		// ISAKS PIERAKSTS LAI ATRASU MAZAKO SKAITLI
	}

	
	private static double averageArr (int[] data) {
		double average =0;
		double atmina =0;
		for(int i=0; i<data.length; i++) {
			//atmina = atmina+data[i];
			atmina+=data[i];
		}
		average = atmina/data.length;
		return average;
	}

}
