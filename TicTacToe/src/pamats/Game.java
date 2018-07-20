package pamats;

import java.util.ArrayList;

public class Game {
	GameStatus gameStat;
	
	public Game() {
		
		gameStat=GameStatus.Spele_aktiva;
		
		HumanPlayer player1 = new HumanPlayer();
		ComputerPlayer playerComp = new ComputerPlayer();
		Board galds = new Board();
		
		galds.newGame();
		
//		do {
		ArrayList <Integer> gajiensKord = player1.makeMove();
		int a = gajiensKord.get(0);
		int b = gajiensKord.get(1);
		
		galds.setBoardArr('X', a, b);
		
		playerComp.makeMove();
		
		int c = gajiensKord.get(0);
		int d = gajiensKord.get(1);
		
		galds.setBoardArr('O', c , d);
		
//		}while();
		
	}
	
//	public enum gameStatus() {
//	
//		
//		return 
//	}
}
