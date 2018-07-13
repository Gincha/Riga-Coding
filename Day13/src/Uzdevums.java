import java.util.Scanner;
public class Uzdevums {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ievadi int skaitli");
		int ievade = scanner.nextInt();
		
		scanner.close();
		/*
		if (ievade <0) {
			for (int i =ievade; i<0; i++){
				System.out.print("" +ievade + ". ->" + i);
				
			} 
			
		}else {
		for (int i=0; i<=ievade; i++) {
			System.out.println("Tavs skaitlis ir " + ievade + ". -> " +i);
		}

	}
		*/
		
//		if(ievade>0) {
//		System.out.print("" + ievade + " -> ");
//		for (int i=0; i<=ievade; i++) {
//			System.out.print("" + i + (i == ievade ? "!" : ", "));
//			}
//		}else {
//			System.out.print("" +ievade + " -> ");
//			for (int i=ievade; i<=0; i++){
//				System.out.print("" + i + (i==0 ? "!" : ", "));
//			}
//		}
		/*
		int from;
		int to;
		if (ievade>0) {
			from = 0;
			to = ievade;
		}else {
			from = ievade;
			to = 0;
		}
		
		System.out.print("" + ievade + " -> ");
		for (int i = from; i<= to; i++) {
			System.out.print("" +i +(i==ievade ? "!" : ", ")); // lai stradatu ar negativiem skaitliem -> i==to
		}
		*/
		int from = ievade>0 ? 0 : ievade;		//veids ka to pasu uzrakstit isak
		int to = ievade> 0 ? ievade : 0;
		
		System.out.print("" + ievade + " -> ");
		for (int i = from; i<= to; i++) {
			System.out.print("" +i +(i==to ? "" : ", "));
	}
		
		
	}

}

