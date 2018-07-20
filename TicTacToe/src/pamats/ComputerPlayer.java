package pamats;
import java.util.Random;
import java.util.ArrayList;

public class ComputerPlayer implements Player{

	public ArrayList<Integer> makeMove() {
		ArrayList<Integer> coordinates = new ArrayList<>();
		Board galds = new Board();
		
		boolean gajiens =false;
		
		Random rng = new Random();
		
		do {
		int a = rng.nextInt(3);
		
		int b = rng.nextInt(3);
		
		if(a<0||a>2 || b<0 || b>2) {
//			System.out.println("Nepareizas koordinatas, megini velreiz");
		}else {
			coordinates.add(a);
			coordinates.add(b);
			if (galds.testPosition(a, b)) {
				gajiens = true;
			}else {
				gajiens = false;
			}
		}
		}while(gajiens==true);
		
		return coordinates;
	} 
}
