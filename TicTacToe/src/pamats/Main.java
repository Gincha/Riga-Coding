package pamats;

import spelesFaili.Game;

public class Main { 

	public static void main(String[] args) {

		Game spele = new Game();

		String input;
		String ievade;

		do {

			System.out.println("Spelesim pret datoru vai pret citu speletaju?");
			System.out.println("D - pret datoru");
			System.out.println("M - pret citu speletaju");
			System.out.println("X - Iziet");
			
			input = spele.scanner();
			ievade = input.toUpperCase();

			switch (ievade) {
			case "D":
				spele.launchGameSinglePlayer();
				break;
				
			case "M":
				spele.launchGameMultiPlayer();
				break;
				
			case "X":
				System.out.println("Beidzam!");
				break;
				
			default:
				System.out.println("Nepareiza ievade!");
			}

		} while (!ievade.equals("X"));
	}
}
