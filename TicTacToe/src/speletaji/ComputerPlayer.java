package speletaji;

import java.util.Random;

import spelesFaili.Board;

import java.util.ArrayList;

public class ComputerPlayer implements Player{

	ArrayList<Integer> coordinates = new ArrayList<>();
	Board galds = new Board();

	public ArrayList<Integer> makeMove() {

		Random rng = new Random();
		int a = rng.nextInt(3);

		int b = rng.nextInt(3);

		coordinates.add(a);
		coordinates.add(b);

		return coordinates;
	}


//		if (firstMove()) {
//		coordinates.add(1);
//		coordinates.add(1);
//		return coordinates;
//	
//	}else {
//		Random rng = new Random();
//		int a = rng.nextInt(3);
//
//		int b = rng.nextInt(3);
//
//			coordinates.add(a);
//			coordinates.add(b);
//	}
//	if(kompis()) {
//		kompis1();;
//	}else {
//		Random rng = new Random();
//		int a = rng.nextInt(3);
//
//		int b = rng.nextInt(3);
//
//		coordinates.add(a);
//		coordinates.add(b);;
//	}
	
	
	
	public boolean firstMove() {
		boolean isEmpty = false;
		int skaititajs =0;
		for (int i = 0; i <= 2; i++) {
			for (int j = 0; j <= 2; j++) {

				if (galds.testPosition(i, j)) {
					skaititajs++;
				}else {
					return isEmpty;
				}
			}
		}
		if (skaititajs == 9) {
			isEmpty = true;
		}
		return isEmpty;
	}
	
	public boolean checkforWin() {
		boolean canWin = false;
		for (int i=0; i<3; i++) {
			galds.getBoardArr()[i][0].equals(' '); 
			
		}
		return canWin;
	}
	
	public ArrayList<Integer> kompis1() {
		for (int i = 0; i < 3; i++) {

			if (galds.getBoardArr()[i][0] == 'X' && galds.getBoardArr()[i][1] == 'X') {
				coordinates.add(i);
				coordinates.add(2);
				return coordinates;
			}else if(galds.getBoardArr()[i][1] == 'X' && galds.getBoardArr()[i][2] == 'X') {
				coordinates.add(i);
				coordinates.add(0);
				return coordinates;
			}else if (galds.getBoardArr()[i][0] == 'X' && galds.getBoardArr()[i][2] == 'X') {
				coordinates.add(i);
				coordinates.add(1);
				return coordinates;
			}else if (galds.getBoardArr()[0][i] == 'X' && galds.getBoardArr()[1][i] == 'X') {
				coordinates.add(2);
				coordinates.add(i);
				return coordinates;
			}else if(galds.getBoardArr()[2][i] == 'X' && galds.getBoardArr()[0][i] == 'X') {
				coordinates.add(1);
				coordinates.add(i);
				return coordinates;
			}else if (galds.getBoardArr()[1][i] == 'X' && galds.getBoardArr()[2][i] == 'X') {
				coordinates.add(0);
				coordinates.add(i);
				return coordinates;
			}else if (galds.getBoardArr()[0][0] == 'X' && galds.getBoardArr()[1][1] == 'X') {
				coordinates.add(2);
				coordinates.add(2);
				return coordinates;
			}else if(galds.getBoardArr()[2][2] == 'X' && galds.getBoardArr()[0][0] == 'X') {
				coordinates.add(1);
				coordinates.add(1);
				return coordinates;
			}else if (galds.getBoardArr()[1][1] == 'X' && galds.getBoardArr()[2][2] == 'X') {
				coordinates.add(0);
				coordinates.add(0);
				return coordinates;
			}else if (galds.getBoardArr()[0][2] == 'X' && galds.getBoardArr()[1][1] == 'X') {
				coordinates.add(2);
				coordinates.add(0);
				return coordinates;
			}else if(galds.getBoardArr()[0][2] == 'X' && galds.getBoardArr()[2][0] == 'X') {
				coordinates.add(1);
				coordinates.add(1);
				return coordinates;
			}else if (galds.getBoardArr()[2][0] == 'X' && galds.getBoardArr()[1][1] == 'X') {
				coordinates.add(0);
				coordinates.add(2);
				return coordinates;
			}
				
			}
		Random rng = new Random();
		int a = rng.nextInt(3);

		int b = rng.nextInt(3);

			coordinates.add(a);
			coordinates.add(b);
			return coordinates;
		}
	
		
	
	
	public boolean kompis() {
		boolean haveWin = false;
		for (int i = 0; i < 3; i++) {

			if (galds.getBoardArr()[i][0] == 'X' && galds.getBoardArr()[i][1] == 'X') {
				coordinates.add(i);
				coordinates.add(2);
				haveWin = true;
				return haveWin;
			}else if(galds.getBoardArr()[i][1] == 'X' && galds.getBoardArr()[i][2] == 'X') {
				coordinates.add(i);
				coordinates.add(0);
				haveWin = true;
				return haveWin;
			}else if (galds.getBoardArr()[i][0] == 'X' && galds.getBoardArr()[i][2] == 'X') {
				coordinates.add(i);
				coordinates.add(1);
				haveWin = true;
				return haveWin;
			}else if (galds.getBoardArr()[0][i] == 'X' && galds.getBoardArr()[1][i] == 'X') {
				coordinates.add(2);
				coordinates.add(i);
				haveWin = true;
				return haveWin;
			}else if(galds.getBoardArr()[2][i] == 'X' && galds.getBoardArr()[0][i] == 'X') {
				coordinates.add(1);
				coordinates.add(i);
				haveWin = true;
				return haveWin;
			}else if (galds.getBoardArr()[1][i] == 'X' && galds.getBoardArr()[2][i] == 'X') {
				coordinates.add(0);
				coordinates.add(i);
				haveWin = true;
				return haveWin;
			}else if (galds.getBoardArr()[0][0] == 'X' && galds.getBoardArr()[1][1] == 'X') {
				coordinates.add(2);
				coordinates.add(2);
				haveWin = true;
				return haveWin;
			}else if(galds.getBoardArr()[2][2] == 'X' && galds.getBoardArr()[0][0] == 'X') {
				coordinates.add(1);
				coordinates.add(1);
				haveWin = true;
				return haveWin;
			}else if (galds.getBoardArr()[1][1] == 'X' && galds.getBoardArr()[2][2] == 'X') {
				coordinates.add(0);
				coordinates.add(0);
				haveWin = true;
				return haveWin;
			}else if (galds.getBoardArr()[0][2] == 'X' && galds.getBoardArr()[1][1] == 'X') {
				coordinates.add(2);
				coordinates.add(0);
				haveWin = true;
				return haveWin;
			}else if(galds.getBoardArr()[0][2] == 'X' && galds.getBoardArr()[2][0] == 'X') {
				coordinates.add(1);
				coordinates.add(1);
				haveWin = true;
				return haveWin;
			}else if (galds.getBoardArr()[2][0] == 'X' && galds.getBoardArr()[1][1] == 'X') {
				coordinates.add(0);
				coordinates.add(2);
				haveWin = true;
				return haveWin;
			}
		}
		return haveWin;
	}
	
	
}

