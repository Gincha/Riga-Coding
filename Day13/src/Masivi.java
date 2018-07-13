
public class Masivi {

	public static void main(String[] args) {
		int[] ints = new int[5];
		int[] array = { 10};
		System.out.println("i[0]: " +ints[0]);
		ints[0] = 200;
		System.out.println("i[0]: " +ints[0]);
		
		int [] emptyInts = new int[100];
		for (int i=0; i<emptyInts.length; i++) {
			System.out.print(emptyInts[i] + ", ");
		}
		
			//lai izvaditu visus elementus jaizmanto cikls
		
		String[] strings = {"aaa", "bbb"};
		for (String s : strings){			//isaka sintakse for ciklam
			System.out.println(s + ", ");
		}
//			for(int i =0; i<strings.length; i++) {		//gara sintakse
//				String s= strings[i];
//				System.out.println("i: " + i + "=" +s+ ", ");
			
			String input = "a, t, y, u, i, o, oo, yy, wwwq, ";	//sadalit stringu pa chariem. strada ar vienkarsiem komatiem.
			String[] chars = input.split(",");			// atstarpes paliks. ja negrib atstarpes tad jatrimo
			for (String s : chars) {
				System.out.println("part: '" +s  +"'");
			}
			
			String input1 = "   kaspars uzvards1   uzvards3";	
			String[] chars1 = input1.split(" ");	
			int parts =0;
			
			String[] target = new String[1];
			
			for (String s : chars1) {
				if (s.length()!=0 ) {
					parts++;
					target[0] = s;				//masiva var ielikt atrasto elemetnu
					System.out.println("part: '" +s + "'");		//ja masivs par isu lai ieliktu masiva var izmantot array copy
				}
		}
			System.out.println("parts: " +parts);	
		

	}
}


