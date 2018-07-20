package pamats;

public class Main {

	public static void main(String[] args) {
		Character[][] galdsArr = new Character[3][3];
		Board galds = new Board(galdsArr);
		
		galds.printBoard();
		galds.setBoardArr('X', 0,0);
		galds.setBoardArr('O', 0,2);
		galds.setBoardArr('O', 1, 1);
		galds.setBoardArr('O', 2,0);
		galds.setBoardArr('X', 2,1);
		galds.setBoardArr('X', 2, 2);
		
		System.out.println(galds.testPosition(1, 1) + " un " +galds.testPosition(0, 1));
		
		System.out.println("------------------");
		galds.printBoard();
		
		System.out.println("----------");
		
		galds.setBoardArr('O', 0, 1);
		
		galds.printBoard();
		

	}

}
