import java.util.Scanner;
public class Majasdarbs {

	public static void main(String[] args) {
		System.out.println("Ievadi vardu un uzvardu ar atstarpi");
		Scanner scanner = new Scanner(System.in);
		String vardsUzvards = scanner.nextLine().replaceAll("[\\.$|,|;|'=_+)(*&^%#@!~`<>{}-]", "  ").replace("  ", " ").trim();

		scanner.close();
		
		String vards1 = "";
		String vards2 = "";
		String vardsPilns = "";

		String[] varduKede = vardsUzvards.split(" ");
		
		vards1 = varduKede[0].substring(0, 1).trim().toUpperCase();
		vards2 = varduKede[0].substring(1,  varduKede[0].length()).toLowerCase().trim();
		vardsPilns = vards1+vards2;
		
		System.out.print(vardsPilns);
		for(int i=1; i<varduKede.length; i++) {
			varduKede[i] =varduKede[i].toUpperCase();
			System.out.print(" " + varduKede[i]);


	}

}
}
