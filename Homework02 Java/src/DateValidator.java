import java.util.Scanner;
import java.util.Calendar;

public class DateValidator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ievadiet datumu");
		int datums = scanner.nextInt();

		System.out.println("Ievadiet menesi");
		int menesisIn = scanner.nextInt();

		System.out.println("Ievadiet gadu");
		int gads = scanner.nextInt();

		scanner.close();
		
		if(datums<1 || datums >31 || menesisIn<1 || menesisIn >12) {
			System.out.println("Ievade nav pareiza!!");
		}
		
		String[] menesuKede;
		menesuKede = new String[12];

		menesuKede[0] = "Janvaris";
		menesuKede[1] = "Februaris";
		menesuKede[2] = "Marts";
		menesuKede[3] = "Aprilis";
		menesuKede[4] = "Maijs";
		menesuKede[5] = "Junijs";
		menesuKede[6] = "Julijs";
		menesuKede[7] = "Augusts";
		menesuKede[8] = "Septembris";
		menesuKede[9] = "Oktobris";
		menesuKede[10] = "Novembris";
		menesuKede[11] = "Decembris";

		if (menesisIn == 4 || menesisIn == 6 || menesisIn == 9 || menesisIn == 11 && datums == 31) {
			System.out.println(
					"Uzmanibu " + menesuKede[menesisIn - 1] + " un " + datums + ". datums nav deriga kombinacija!");
		} else if (menesisIn == 2 && datums > 28) {
			System.out.println(
					"Uzmanibu " + menesuKede[menesisIn - 1] + " un datums " + datums + " nav deriga kombinacija!");
		} else {
			System.out.println(datums + ". " + menesuKede[menesisIn - 1]);
		}

	}

}
