import java.util.Scanner;

public class PrimeGenerator {
	
		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int ievade;

			System.out.println("Ievadi cik pirmskaitlus uzgeneret no 1 - 100: ");
			ievade = scanner.nextInt();

			scanner.close();

			if (ievade < 0 || ievade > 100) {

				System.out.println("Nepareiza ievade");

			} else if (ievade == 0) {

				System.out.println("Ievaditais skaitlis ir 0");
			} else {

				int i = 0;
				int num = 0;
				int skaititajs2 = 0;
				String pirmskaitli = "1 ";

				String[] pirmskaitliMasivs = new String[100];

				while (skaititajs2 != ievade) {

					i++;
					int skaititajs = 0;

					for (num = i; num >= 1; num--) {

						if (i % num == 0) {
							skaititajs = skaititajs + 1;
						}
					}

					if (skaititajs == 2) {
						skaititajs2++;
						pirmskaitli = pirmskaitli + i + " ";
					}
				}

				pirmskaitliMasivs = pirmskaitli.split(" ");

				for (int j = 0; j < (ievade); j++) {

					if (j == (ievade - 1)) {

						System.out.print(pirmskaitliMasivs[j]);

					} else {
						System.out.print(pirmskaitliMasivs[j] + ", ");
					}
				}
				System.out.println();

			}

			

		}

	}
