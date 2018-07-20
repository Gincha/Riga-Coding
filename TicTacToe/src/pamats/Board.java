package pamats;

public class Board {

	private Character[][] boardArr = new Character[3][3];

	public Board(Character[][] array) {
		this.boardArr = array;

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
}
