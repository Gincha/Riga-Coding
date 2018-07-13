import java.util.Scanner;

public class Uzdevums2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ievadi pirmo skaitli");
		int ievade1 = scanner.nextInt();

		System.out.println("Ievadi otro skaitli");
		int ievade2 = scanner.nextInt();
		scanner.close();

		int atmina = 0;
		if (ievade1 > ievade2) {
			atmina = ievade2;
			ievade2 = ievade1;
			ievade1 = atmina;
		}
		
		for (int i = ievade1; i <= ievade2; i++) {
			if (i % 2 == 0 && i % 3 == 0 && i % 5 != 0) {
				System.out.print(i + ", ");
			}

		}
		
		// otrs variants ka uzrakstit
		
//		int from = ievade1>ievade2 ? ievade2 : ievade1;
//		int to = ievade1 > ievade2 ? ievade1 : ievade2;
//		
//		String result = "";
//		for (int i=from; i<=to; i++) { 
//			if (i %2 ==0 && i%3==0&& i%5!=0) {
//				result = result + i + ", ";
//			}
//		}
//		result = result.substring(0, result.length() -2);
//		System.out.print("" +from +", " +to + " -> " +result); //result ieliek pedinas lai redzetu cik daudz jagriez
	}
}
