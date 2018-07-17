import java.util.Scanner;
import java.util.Random;

public class SortArray2D {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ievadi cik masivus generet (10-20)");
		int ievade = scanner.nextInt();

		scanner.close();

		if (ievade < 10 || ievade > 20) {
			System.out.println("Nepareiza ievade");
		}
		int temp;
		double atmina = 0;
		double[] videjais = new double[ievade];
		int skaititajs = 0;
		double[] tempAv = new double[videjais.length];

		int[][] masivs2D = new int[ievade][];
		for (int i = 0; i < ievade; i++) {
			masivs2D[i] = new int[10 + new Random().nextInt(41)]; // uztaisa random 2. dimensiju

		}

		for (int i = 0; i < ievade; i++) {

			for (int j = 0; j < masivs2D[i].length; j++) {

				masivs2D[i][j] = 100 + new Random().nextInt(899); // ieliek ieksha random vertibu visur
				// System.out.print(i + " " +j + "; "+masivs2D[i][j] + ", ");

			}

		}

		for (int i = 0; i < masivs2D.length; i++) { // saliek katru masivu dilstosa seciba
			for (int j = 0; j < masivs2D[i].length; j++) {
				for (int k = j + 1; k < masivs2D[i].length; k++) {

					if (masivs2D[i][j] < masivs2D[i][k]) {

						temp = masivs2D[i][j];
						masivs2D[i][j] = masivs2D[i][k];
						masivs2D[i][k] = temp;

					}

				}
				// System.out.print(masivs2D[i][j] + ", ");

			}
			// System.out.println();
		}

		for (int i = 0; i < masivs2D.length; i++) { // izrekina videjo katram masivam
			for (int j = 0; j < masivs2D[i].length; j++) {
				skaititajs++;
				temp = masivs2D[i][j];
				atmina = atmina + temp;
				// System.out.print(atmina + ", ");

			}
			videjais[i] = atmina / skaititajs;
			// System.out.print("Masivam Nr. " + i + " videjais ir " + videjais[i]);
			// System.out.println();
			atmina = 0;
			skaititajs = 0;

		}

		for (int i = 0; i < videjais.length; i++)

		{
			for (int j = i + 1; j < videjais.length; j++)

			{
				if (videjais[i] > videjais[j])

				{
					tempAv[i] = videjais[i];

					videjais[i] = videjais[j];

					videjais[j] = tempAv[i];

					int[] tempArr = masivs2D[i];
					masivs2D[i] = masivs2D[j];
					masivs2D[j] = tempArr;

				}
			}

		}

		System.out.println("Lielaka videja vertiba ir masivam Nr. " + (masivs2D.length - 1) + " -> "
				+ videjais[masivs2D.length - 1]);

		int lielakaisAv = (masivs2D.length - 1);

		System.out.print("Visas verttibas: ");

		for (int j = 0; j < masivs2D[masivs2D.length - 1].length; j++) {

			if (j == (masivs2D[masivs2D.length - 1].length - 1)) {
				System.out.print(masivs2D[lielakaisAv][j] + " ");

			} else {

				System.out.print(masivs2D[lielakaisAv][j] + ", ");
			}
		}

	}

}
