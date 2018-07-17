import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Uzdevums18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ievade = sc.nextLine().split(" ");

		// String piemers = "this is lots of fun for every Java programmer";

		sc.close();

		ArrayList<String> arrList = new ArrayList<>(Arrays.asList(ievade));

		System.out.println(arrList);

		ArrayList<String> arrList2 = new ArrayList<>(Arrays.asList());

		String zvaigznes = "****";

		for (int i = 0; i < arrList.size(); i++) {

			String vards = arrList.get(i);

			if (vards.length() == 4) {

				arrList2.add(zvaigznes);
			}
			arrList2.add(vards);
		}

		System.out.println(arrList2);
		
		
//		
//		ArrayList<String> arrList3 = new ArrayList<>(Arrays.asList(ievade));
//
//
//		for (int i = 0; i < arrList.size(); i++) {
//
//			String vards = arrList.get(i);
//
//			if (vards.length() == 4) {
//
//				arrList3.set(i, zvaigznes+", "+vards);
//				
//			}
//			
//		}
//
//		System.out.println(arrList3);
//		
		
		
	}

}
