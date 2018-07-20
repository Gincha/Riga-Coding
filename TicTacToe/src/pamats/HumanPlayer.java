package pamats;

import java.util.Scanner;
import java.util.ArrayList;

public class HumanPlayer implements Player {

	@Override
	public ArrayList<Integer> makeMove() {
		
		ArrayList<Integer> coordinates = new ArrayList<>();
		boolean gajiens =false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Izdari gajienu");
		while(!gajiens) {
			
			System.out.println("Ievadi a koordinati: ");
		int a = scanner.nextInt();
		System.out.println("Ievadi b koordinati: ");
		int b = scanner.nextInt();
			
		if(a<0||a>2 || b<0 || b>2) {
			System.out.println("Nepareizas koordinatas, megini velreiz");
		}else {
			coordinates.add(a);
			coordinates.add(b);
			gajiens = true;
			scanner.close();
		}
		
		}
		return coordinates;
		
	}
}
