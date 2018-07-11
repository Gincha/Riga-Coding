import java.util.Scanner;
public class Uzdevums4 {

	public static void main(String[] args) {
		System.out.println("Ievadi pirmo teksta gabalu");
		Scanner scanner = new Scanner(System.in);
		String ievade1 = scanner.nextLine();
		System.out.println("Ievadi pirmo teksta gabalu");
		String ievade2 = scanner.nextLine();
		
		scanner.close();
		int garums1 = ievade1.length();
		int garums2 = ievade2.length();
		
		if (garums1<garums2) {
			System.out.println(ievade1+ievade2+ievade1);
		}else {
			System.out.println(ievade2+ievade1+ievade2);
		}
		

	}

}
