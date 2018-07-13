import java.util.Scanner;

public class Uzdevums7 {

	public static void main(String[] args) {
		System.out.println("Ievadi burtu");
		Scanner scanner = new Scanner(System.in);
		String ievade = scanner.nextLine();

		scanner.close();

		String[] patskanis = { "a", "ā", "e", "ē", "i", "ī", "u", "ū", "o" };
		String[] lidzskanis = { "b", "c", "č", "d", "f", "g", "ģ", "h", "j", "k", "ķ", "l", "ļ", "m", "n", "ņ", "p",
				"r", "s", "š", "t", "v", "z", "ž" };
		String[] divskanis = { "ai", "au", "ie", "ei", "eu", "ui", "iu", "o", "oi", "ou" };
/*
		boolean result = false;

		if (ievade.equalsIgnoreCase("o")) {
			System.out.println("Burts " + ievade + " ir patskanis un divskanis");
		} else {

			for (int i = 0; i < patskanis.length; i++) {
				if (ievade.equalsIgnoreCase(patskanis[i])) {
					result = true;
					System.out.println("Burts " + ievade + " ir " + "patskanis");
				}
			}

			for (int i = 0; i < lidzskanis.length; i++) {
				if (ievade.equalsIgnoreCase(lidzskanis[i])) {
					result = true;
					System.out.println("Burts " + ievade + " ir " + "lidzskanis");
				}
			}

			for (int i = 0; i < divskanis.length; i++) {
				if (ievade.equalsIgnoreCase(divskanis[i])) {
					result = true;
					System.out.println("Burts " + ievade + " ir " + "divskanis");
				}
			}

		}else (!result) {
			System.out.println("nepareiza ievade");
		}
		*/
		if (ievade.length() !=1) {
			System.out.println("Nepareiza ievade");
		}
		boolean isD = ievade.equalsIgnoreCase("o");
		boolean isL = false;
		boolean isP = false;
		
		for (int i=0; i<patskanis.length; i++) {
			if(patskanis[i].equalsIgnoreCase(ievade)) {
				isP =true;
				break;
			}
		}
		
		for (int i=0; i<lidzskanis.length; i++) {
			if(lidzskanis[i].equalsIgnoreCase(ievade)) {
				isL =true;
				break;
			}
		}
		
		for (int i=0; i<divskanis.length; i++) {
			if(divskanis[i].equalsIgnoreCase(ievade)) {
				isD =true;
				break;
			}
		}
		
		if (isD) {
			System.out.println("ir divskanis");
		}else if (isL) {
			System.out.println("ir lidzskanis");
		}else if(isP) {
			System.out.println("ir patskanis");
		}else {
			System.out.println("Nepareiza ievade");
		}

	}

}
