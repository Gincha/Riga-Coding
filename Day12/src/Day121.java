
public class Day121 {

	public static void main(String[] args) {
		
		System.out.println("-------");
		
		String test = "abcdef";
		test = test.concat("ghijk");	//piekabina klat originalajam stringam
		
		String test2 = test.concat("ghijk").toUpperCase().concat("!!!");//piekabina tekstu, parveido uz lielajiem burtiem  un piekabina !!!
		System.out.println("test string:" +test);		//izvada tekstu
		System.out.println("test2 string: " +test2);
		
		System.out.println("abc".toUpperCase());
		
		System.out.println("index of d: " + test.indexOf("d")); // sameklet kura pozicija ir d burts
		
		String test3 = "abc def ghi lll zzz tttt rrr";
		
		String toCut = "zzz";
		int index = test3.indexOf(toCut);
		System.out.println("index: " + index);
		String result = test3.substring(index, index +toCut.length() );	//cik pieskaita = garums cik grib izgriezt
		
		//String part1 = test3.substring(0, index);
	//	String part2 = test3.substring(index + toCut.length(), test.length());
				String resultInv = test3.substring(0, index) + test3.substring(index + toCut.length()); //saliek kopa abas dalas pirms tam
				
		System.out.println("cut example: " +result);
		System.out.println("cut example inv: " +resultInv); //ar index atrod un iznem viena vieta
	
		System.out.println("Cut example int(with replace): " +test3.replace(" zzz", "---")); //ar replace atrod un aizstaj visas vietas
				
		String userInput ="    Kristaps    ".replace(" ", ""); //iznem ara atstarpes
		String userInput2 ="    Kristaps Junior    ".trim(); //iznem ara atstarpes un lai butu drosi ka parada tikai vardu
		System.out.println("User input fixed: '" +userInput + "'"); //ieliek pedinas
		
		String password = "    12 34    ".trim(); 
		if (password.length() <=4) {
			System.out.println("Bad password! (" + password.length() + ")");
		}else {
			System.out.println("Good password! '" +password + "'");
		}
		
		String badString = "1234567890000kkkk0000((((GGgaaazzzz7777";
		System.out.println("badString: " +badString.replaceAll("[a-z, 0-9]", "-")); //aizstaj 5 ar stripinu. [a-z] aizstaj visus burtus
																	//[a-z,0-9] aizstaj mazos burtus un ciparus no 0 lidz 9.
		
		String regex = "[a-z]";
		System.out.println("badString matches: " + badString.matches(regex));
	}

}

