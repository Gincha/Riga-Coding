import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Random;

public class Uzdevums18 {

	public static void main(String[] args) {

		uzdevums31();

		// 25uzdevumam;
		// ArrayList<Integer> liste = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		//
		// System.out.println(uzdevums25(liste));
	}

	private static void uzdevums18() {
		ArrayList<Integer> pirmaListe = new ArrayList<>();
		ArrayList<Integer> otraListe = new ArrayList<>();
		int skaitlis;

		Random rng = new Random();
		int randomSkaitlis = 1 + rng.nextInt(11);

		System.out.print("Pirma liste: ");
		for (int i = 0; i < randomSkaitlis; i++) {
			int listesRandoms = rng.nextInt(150);
			pirmaListe.add(i, listesRandoms);
		}
		System.out.print(pirmaListe);

		System.out.println();
		System.out.print("Otra liste: ");

		int randomSkaitlis2 = 1 + rng.nextInt(15);
		for (int i = 0; i < randomSkaitlis2; i++) {

			int listesRandoms = rng.nextInt(50);
			otraListe.add(i, listesRandoms);

		}
		System.out.print(otraListe);
		System.out.println();

		pirmaListe.addAll(otraListe);

		System.out.println("Abas listes kopa: " + pirmaListe);

		for (int i = 0; i < pirmaListe.size(); i++) {

			skaitlis = pirmaListe.get(i);
			skaitlis = skaitlis * skaitlis * skaitlis;

			pirmaListe.set(i, skaitlis);

		}

		System.out.println("Kubi: " + pirmaListe);

	}

	private static void uzdevums20() {

		ArrayList<Integer> liste1 = new ArrayList<>(Arrays.asList(1, 5, 4, 2, 3, 1, 5, 2, 3, 1));
		ArrayList<Integer> liste2 = new ArrayList<>();
		System.out.println("Pirma liste: " + liste1);
		for (int i = 0; i < liste1.size(); i++) {
			int vertiba = liste1.get(i);
			if (!(liste2.contains(vertiba))) {
				liste2.add(vertiba);
			}
		}
		System.out.println("Otra liste: " + liste2);
	}

	private static void uzdevums21() {

		Scanner sc = new Scanner(System.in);
		ArrayList<String> arajliste = new ArrayList<>();
		arajliste.add("ABC");
		arajliste.add("CDE");
		arajliste.add("EFG");
		arajliste.add("CDE");
		arajliste.add("ANC");

		System.out.println(arajliste);

		System.out.println("Ievadi stringu");
		String ievade = sc.nextLine();

		sc.close();

		for (int i = 0; i < arajliste.size(); i++) {
			String vards = arajliste.get(i);

			if (arajliste.contains(ievade)) {
				arajliste.remove(ievade);
			}
		}
		System.out.println("Jauna arajliste: " + arajliste);
		;
	}

	private static void uzdevums24() {

		System.out.println("Ievade paroli");
		Scanner sc = new Scanner(System.in);
		String parole = sc.next();

		int garums = parole.length();

		boolean irCipari = false;
		boolean atbilst = false;

		for (int i = 0; i < garums; i++) {
			Character char1 = parole.charAt(i);
			if (char1.isDigit(1) || char1.isDigit(2) || char1.isDigit(3) || char1.isDigit(4) || char1.isDigit(5)
					|| char1.isDigit(6) || char1.isDigit(7) || char1.isDigit(8) || char1.isDigit(9)
					|| char1.isDigit(0)) {
				irCipari = true;
			}
		}

		if (garums >= 10 && parole.matches("^[a-zA-Z0-9]+$")) {
			atbilst = true;
		}

		if (atbilst && !irCipari) {
			System.out.println("Parole " + parole + " ir deriga");
		} else {
			System.out.println("Parole " + parole + " nav deriga");
		}

	}

	private static String uzdevums25(ArrayList<Integer> a) {
		String result = "Not increasing, not decreasing";
		boolean augoss = false;
		boolean dilstoss = false;
		int counter = 0;
		int counter1 = 0;

		for (int i = 0; i < a.size() - 1; i++) {

			if (a.get(i) < a.get(i + 1)) {
				counter++;
				if (counter == a.size() - 1) {
					result = "Increasing";
				}
				continue;
			} else if (a.get(i) > a.get(i + 1)) {

				counter1++;
				if (counter1 == a.size() - 1) {
					result = "Decreasing";
				}
				continue;
			}
		}

		return result;
	}
	

	public static void uzdevums31() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ieraksti vardu");
		String ievade = sc.nextLine();
		sc.close();

		Map<String, Integer> punktuPaka = new HashMap<>();
		punktuPaka.put("A", 1);
		punktuPaka.put("E", 1);
		punktuPaka.put("I", 1);
		punktuPaka.put("O", 1);
		punktuPaka.put("L", 1);
		punktuPaka.put("N", 1);
		punktuPaka.put("R", 1);
		punktuPaka.put("S", 1);
		punktuPaka.put("T", 1);
		punktuPaka.put("D", 2);
		punktuPaka.put("G", 2);
		punktuPaka.put("B", 3);
		punktuPaka.put("C", 3);
		punktuPaka.put("M", 3);
		punktuPaka.put("P", 3);
		punktuPaka.put("F", 4);
		punktuPaka.put("H", 4);
		punktuPaka.put("V", 4);
		punktuPaka.put("W", 4);
		punktuPaka.put("Y", 4);
		punktuPaka.put("K", 5);
		punktuPaka.put("J", 8);
		punktuPaka.put("X", 8);
		punktuPaka.put("Q", 10);
		punktuPaka.put("Z", 10);

		int garums = ievade.length();

		String ievadeLiels = ievade.toUpperCase();

		ArrayList<String> arajListe = new ArrayList<String>();

		for (int i = 0; i < garums; i++) {
			if (punktuPaka.containsKey(ievadeLiels.substring(i, i + 1))) {
				arajListe.add(ievadeLiels.substring(i, i + 1));
			}

		}

		int summa = 0;
		for (int i = 0; i < arajListe.size(); i++) {
			summa = summa + punktuPaka.get(arajListe.get(i));
		}

		System.out.println(ievade + " -> " + summa);

	}

}
