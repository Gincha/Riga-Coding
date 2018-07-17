import java.util.ArrayList;

public class TaskArrayList {

	public static void main(String[] args) {
		String input = "     kAsPAars      uzvards uzvards2  hhhhh kjjj";
		String[] chars = input.split(" ");

		java.util.ArrayList<String> target = new ArrayList<>();
		
		for (String s : chars) {
			if (s.length() != 0) {
				target.add(s);
				System.out.println("part: '" + target.get(target.size()-1) + "'");
			}
		}

		for (int i = 0; i < target.size(); i++) {
			
			String elem = target.get(i);

			if (i == 0) {
				elem = elem.substring(0, 1).toUpperCase()
						+ elem.substring(1, elem.length()).toLowerCase();
			} else {
				elem = elem.toUpperCase();
			}
			
			target.set(i, elem);
		}

		for (String t : target) {
			System.out.println("t: '" + t + "'");
		}
	}

}