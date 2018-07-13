import java.util.Scanner;

public class Day13 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi i: ");
		int i = scanner.nextInt();
		scanner.close();

		do {
			System.out.println("i: " + i);
			i = i + 3;
			
		} while (i < 15);
		
		
		int z = 0;
		while(true) {
			System.out.println("true"); //	apzinati rakstits muzigais cikls
			z++;
			if (z == 10) { 
				break;
			}
		}
		
		//palielina par 1 bet izraksta kodu kad skaitlis ir para skaitlis
		for (int oddI =0; oddI<10; oddI++) {
			if(oddI %2 ==0) { 	//parbauda vai var izdalit bez atlikuma
				continue;	// ja atlikums ir 0 tad lec no sakuma un nem nakamo ciparu ja netiek lidz continue tad neiet talak
			}				// contunue saka ka turpinam ciklu  nevis ejam talak (ka break)
			System.out.println("oddI: " +oddI);
		}
	}

}
