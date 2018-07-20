package pamats;

public class Main {

	public static void main(String[] args) {
		
		Character[][] galdsArr = new Character[3][3];
		Board galds = new Board(galdsArr);
		
		galds.printBoard();
		galds.setBoardArr('X', 0,0);

		
		System.out.println("------------------");
		galds.printBoard();
		
		galds.setBoardArr('O', 2,2);

		galds.setBoardArr('X', 1, 0);
		
		System.out.println("Pozicija 1.1: " +galds.testPosition(1, 1) + " un pozicija 0.1: " +galds.testPosition(0, 1));
		
		System.out.println("------------------");
		galds.printBoard();
		
		System.out.println("----------");
		

		galds.setBoardArr('X', 2, 0);
		galds.printBoard();
		
		HumanPlayer player = new HumanPlayer();

	System.out.println(player.makeMove());
		

	galds.testEven();
	
	galds.newGame();

	ComputerPlayer compPlayer = new ComputerPlayer();
	System.out.println(compPlayer.makeMove());
	}

}
