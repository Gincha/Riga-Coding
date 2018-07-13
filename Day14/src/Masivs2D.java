import java.util.Random;
import java.util.Scanner;

public class Masivs2D {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = 1 + new Random().nextInt(10);

		String ievade;
		int minejums;
		int skaititajs = 0;

		System.out.println("Uzmini skaitli");
		do {
			skaititajs++;

			System.out.println("Minejums Nr. " + skaititajs + ". Uzmini skaitli no 1 lidz 10");
			ievade = scanner.nextLine();
			minejums = Integer.parseInt(ievade);

			if (minejums == number) {
				System.out.println("Pareizi, skaitlis bija " + number);
				break;
			} else {

				// if (minejums>number) {
				// message = "Lielaks";
				// }else {
				// message = "mazaks";
				// }
				System.out.println( "Minejums ir " + (minejums > number ? "lielaks" : "mazaks"));  //isak pierakta if metodi
			}

		} while (skaititajs != 10);

	}

}
