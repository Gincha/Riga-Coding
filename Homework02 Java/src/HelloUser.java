import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		System.out.println("Ievadi vardu un uzvardu ar atstarpi");
		Scanner scanner = new Scanner(System.in);
		String vardsUzvards = scanner.nextLine().trim();

		scanner.close();

		String vards = "";
		String uzvards = "";
		int index = vardsUzvards.indexOf(" ");

		if (index == -1) {
			System.out.println("Nepareiza ievade");
			vards = vardsUzvards;
		} else {
			vards = vardsUzvards.substring(0, index)
					.trim();
			uzvards = vardsUzvards.substring(index, vardsUzvards.length())
					.trim();
		}

		// vards = vardsUzvards.substring(0, index).trim();
		// uzvards = vardsUzvards.substring(index, vardsUzvards.length() ).trim();

		int index2 = uzvards.indexOf(" ");
		String uzvardsOtrs = "";
		String uzvards2 = "";
		if (index2 > 0) {

			uzvardsOtrs = uzvards.substring(index2, uzvards.length())
					.trim();
			uzvards2 = uzvardsOtrs.toUpperCase();

			String vardsCut1 = vards.substring(0, 1);
			vardsCut1 = vardsCut1.toUpperCase();
			String vardsCut2 = vards.substring(1, vards.length());
			vardsCut2 = vardsCut2.toLowerCase();

			vards = vardsCut1 + vardsCut2;

			String uzvards1 = uzvards.substring(0, index2)
					.toUpperCase()
					.trim();
			uzvardsOtrs = uzvards.substring(index2, uzvards.length())
					.trim();
			uzvards2 = uzvardsOtrs.toUpperCase();

			// System.out.println("index ir " +index);
			System.out.println("'" + vards + "'");
			System.out.println("'" + uzvards1 + " " + uzvards2 + "'");

		} else {
			String vardsCut1 = vards.substring(0, 1);
			vardsCut1 = vardsCut1.toUpperCase();
			String vardsCut2 = vards.substring(1, vards.length());
			vardsCut2 = vardsCut2.toLowerCase();

			vards = vardsCut1 + vardsCut2;

			String uzvards1 = uzvards.toUpperCase();

			//System.out.println("index ir " + index);
			System.out.println("'" + vards + "'");
			System.out.println("'" + uzvards1 + "'");
		}

	}
}
