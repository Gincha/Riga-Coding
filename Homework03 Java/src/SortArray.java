import java.util.Scanner;
	import java.util.Random;
public class SortArray {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);

			System.out.println("Ievadi masiva lielumu no 20 lidz 40");
			int ievade = scanner.nextInt();

			scanner.close();
			
			int[] masivs = new int[0];
			int temp;
			
			if (ievade < 20 || ievade > 40) {
				System.out.println("Nepareiza ievade");
			} else {
				masivs = new int[ievade];
			}

			System.out.print("Skaitli ir: ");
			for (int i = 0; i < masivs.length; i++) {
				
				masivs[i] = 10 + new Random().nextInt(90);
				
				if (i == masivs.length - 1) {
					System.out.println(masivs[i] + "!");
					
				} else {
					
					System.out.print(masivs[i] + ", ");
				}
			}

			
			for (int i = 0; i < masivs.length; i++)

			{
				for (int j = i + 1; j < masivs.length; j++)

				{
					if (masivs[i] > masivs[j])

					{
						temp = masivs[i];

						masivs[i] = masivs[j];

						masivs[j] = temp;
					}
				}
				
			}

			System.out.print("Augosa seciba: ");
			
			for (int i = 0; i < masivs.length; i++) {
				
				if (i == masivs.length - 1) {
					System.out.print(masivs[i] + "!");
					
				} else {
					
					System.out.print(masivs[i] + ", ");
				}
			}

		}

	}
