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

		int randomCipars = 10 + new Random().nextInt(40);
		
		int temp;
		double atmina = 0;
		double [] videjais = new double[ievade];
		int skaititajs = 0;
		double temp1;
		

		int[][] masivs2D = new int[ievade][];
		for (int i = 0; i < ievade; i++) {
			masivs2D[i] = new int[10 + new Random().nextInt(40)]; // uztaisa random 2. dimensiju

		}

		for (int i = 0; i < ievade; i++) {

			for (int j = 0; j < masivs2D[i].length; j++) {

				masivs2D[i][j] = 100 + new Random().nextInt(899); 	// ieliek ieksha random vertibu visur
				// System.out.print(i + " " +j + "; "+masivs2D[i][j] + ", ");

			}

		}

		for (int i = 0; i < masivs2D.length; i++) {				 // saliek katru masivu dilstosa seciba
			for (int j = 0; j < masivs2D[i].length; j++) {
				for (int k = j + 1; k < masivs2D[i].length; k++) {

					if (masivs2D[i][j] < masivs2D[i][k]) {

						temp = masivs2D[i][j];
						masivs2D[i][j] = masivs2D[i][k];
						masivs2D[i][k] = temp;

					}
					

				}
				//System.out.print(masivs2D[i][j] + ", ");
				
			}
			//System.out.println();
		}
	

		for (int i = 0; i < masivs2D.length; i++) {				 	//izrekina videjo katram masivam
			for (int j = 0; j < masivs2D[i].length; j++) {
				 skaititajs++;
					temp = masivs2D[i][j];
					atmina = atmina + temp;
					//System.out.print(atmina + ", ");
				
			}
			videjais[i] = atmina / skaititajs ;
			System.out.print("Masivam Nr. " + i + " videjais ir " + videjais[i]);
			System.out.println();
			atmina=0;
			skaititajs=0;
			
		}

		/*
		int[] videjaisInt =new int[videjais.length];
		
		for (int i=0; i<videjaisInt.length; i++) {
			videjaisInt[i] = (int) videjais[i];
		}

		
		int[][] atminaArr = new int[masivs2D.length][];	
		for (int i=0; i<masivs2D.length; i++) {
			for (int j=0; j<masivs2D[i].length; j++)						//ieliek videjo vertibu ka nulto
			System.arraycopy(masivs2D, 0, atminaArr, 1, masivs2D[i][j]);
		}

		
		for (int i=0; i<atminaArr.length; i++) {		//ieliek videjo vertibu ka nulto
			for (int j=0; j<1; j++){
				videjaisInt[i] = atminaArr[i][j];
			}
		}
		
		
		
		for (int i=0; i<atminaArr.length; i++) {
			for (int j=0; j<atminaArr[i].length; j++){
				System.out.print(atminaArr[i][j] + ", ");
				System.out.println();
			}
		}
		*/
		/*
		

	    for (int i = 0; i < videjaisInt.length; i++)			//sakartot masivus pec videja NESTRADA!!!

		{
			for (int j = i + 1; j < videjaisInt.length; j++)

			{
				if (videjaisInt[i] > videjaisInt[j])

				{
					videjaisInt[i] = masivs2D[i];

					masivs2D[i] = masivs2D[j];
					
					masivs2D[j] = atminaArr;
				}
			}
			
		}


		for(int i=0; i<masivs2D.length; i++) {
			System.out.println(masivs2D[i]);
		}
		/*
		
		for (int i = 0; i < masivs2D.length; i++) {				 	//izrekina videjo katram masivam
			for (int j = 0; j < masivs2D[i].length; j++) {
				 skaititajs++;
					temp = masivs2D[i][j];
					atmina = atmina + temp;
					//System.out.print(atmina + ", ");
				
			}
			videjais[i] = atmina / skaititajs ;
			System.out.print("Masivam Nr. " + i + " videjais ir " + videjais[i]);
			System.out.println();
			atmina=0;
			skaititajs=0;
			
		}
		

		/*
		for (int i = 0; i < ievade; i++) {

			for ( j = 0; j < masivs2D[i].length; j++) {

				System.out.print(masivs2D[i][j] + " ");

			}
			System.out.println();
		}
		*/

	}

}