package pamats;

public class Board {

	private Character[][] boardArr = new Character[3][3];

	
	
	public Board(Character[][] array) {
		this.boardArr = array;
	}

	public Board() {
		
	}

	public Character[][] getBoardArr() {
		return boardArr;
	}

	public void setBoardArr(Character koIevadit, int a, int b) {
		this.boardArr[a][b] = koIevadit;
	}

	public void printBoard() {
		
		for (int i = 0; i < boardArr.length; i++) {
			for (int j = 0; j < boardArr[i].length; j++) {
				
				if (boardArr[i][j] == null) {
					boardArr[i][j] = (' ');
				}

				if (j == this.boardArr[i].length - 1) {
					System.out.print("|" + this.boardArr[i][j] + "|");
				} else {
					System.out.print("|" + this.boardArr[i][j]);
				}
			}
			System.out.println();
		}
	}
	
	public boolean testPosition(int a, int b) {
		
		if(boardArr[a][b] == ' ') {
			return true;
		}else {
			return false;
		}
	}
	
	public void testWinner() {
		
		for (int i = 0; i < boardArr.length; i++) {

				
				if (boardArr[i][0] == 'X' && boardArr[i][1] == 'X' && boardArr[i][2] == 'X') {
					System.out.println("Player X wins!!");
					break;
					
				
				}else if (boardArr[0][i] == 'X' && boardArr[1][i] == 'X' && boardArr[2][i] == 'X') {
					System.out.println("Player X wins!!");
					break;
					
				}else if (boardArr[0][0] == 'X' && boardArr[1][1] == 'X' && boardArr[2][2] == 'X') {
					System.out.println("Player X wins!!");
					break;
				}else if (boardArr[0][2] == 'X' && boardArr[1][i] == 'X' && boardArr[2][0] == 'X') {
					System.out.println("Player X wins!!");
					break;
				}

				
				if (boardArr[i][0] == 'O' && boardArr[i][1] == 'O' && boardArr[i][2] == 'O') {
					System.out.println("Player O wins!!");
					break;
					
				
				}else if (boardArr[0][i] == 'O' && boardArr[1][i] == 'O' && boardArr[2][i] == 'O') {
					System.out.println("Player O wins!!");
					break;
					
				}else if (boardArr[0][0] == 'O' && boardArr[1][1] == 'O' && boardArr[2][2] == 'O') {
					System.out.println("Player O wins!!");
					break;
				}else if (boardArr[0][2] == 'O' && boardArr[1][i] == 'O' && boardArr[2][0] == 'O') {
					System.out.println("Player O wins!!");
					break;
				}
		}
	}
	
	public void testEven() {
		int skaititajs =0;
		for (int i = 0; i < boardArr.length; i++) {
			for (int j = 0; j < boardArr[i].length; j++) {
				
				if(!(boardArr[i][j].equals(' '))) {
					skaititajs++;
					
				}else {
					
				}
			}
		}
		System.out.println(skaititajs);
		if(skaititajs == 9) {
			System.out.println("Visi laucini aiznemti - Neizskirts!");
		}
	}
	
	public void newGame() {

			for (int i = 0; i < boardArr.length; i++) {
				for (int j = 0; j < boardArr[i].length; j++) {
					
					boardArr[i][j] = ' ';

					if (j == this.boardArr[i].length - 1) {
						System.out.print("|" + this.boardArr[i][j] + "|");
					} else {
						System.out.print("|" + this.boardArr[i][j]);
					}
				}
				System.out.println();
			}
		
	}
		
}
