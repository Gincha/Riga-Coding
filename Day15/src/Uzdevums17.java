import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Uzdevums17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] ievade = sc.nextLine().split(" ");	

		sc.close();
		
		ArrayList<String> arrList = new ArrayList<>(Arrays.asList(ievade));
		
		for (int i=0; i<arrList.size(); i++) {
			String vards = arrList.get(i);
			String Lielais = vards.toUpperCase();
			arrList.set(i, Lielais);
		}
		System.out.println(arrList);
	}

}
