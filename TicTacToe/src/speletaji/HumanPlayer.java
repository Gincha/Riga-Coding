package speletaji;

import spelesFaili.Board;
import spelesFaili.Game;
import speletaji.Player;

import java.util.ArrayList;

public class HumanPlayer implements Player {

	Board galds = new Board();

	@Override
	public ArrayList<Integer> makeMove() {

		ArrayList<Integer> coordinates = new ArrayList<>();
		boolean gajiens = false;

		Game spele = new Game();

		System.out.println("Izdari gajienu");

		while (!gajiens) {

			System.out.println("Ievadi a koordinati: ");
			String c = spele.scanner();
			
			System.out.println("Ievadi b koordinati: ");
			String d = spele.scanner();

			String regex = "[0-9]+";

			if (c.matches(regex) && d.matches(regex)) {
				int a = Integer.parseInt(c);
				int b = Integer.parseInt(d);

				if (a >= 0 && a <= 2 && b >= 0 && b <= 2) {
					coordinates.add(a);
					coordinates.add(b);
					gajiens = true;

				} else {
					System.out.println("Nepareiza ievade, megini velreiz!");
				}
			} else {
				System.out.println("Nepareiza ievade, ievadi tikai ciparus!");
			}
		}
		return coordinates;
	}
}