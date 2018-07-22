package spelesFaili;

import java.util.ArrayList;
import java.util.Scanner;

import speletaji.ComputerPlayer;
import speletaji.HumanPlayer;

public class Game extends Board {
	GameStatus gameStat;

	HumanPlayer player1 = new HumanPlayer();
	ComputerPlayer playerComp = new ComputerPlayer();


	private int rezultats1 = 0;
	private int rezultats2 = 0;
	private int skaititajs = 0;

	public Game() {

	}
	

	public void launchGameSinglePlayer() {

		newGame(); // notira galdu
		printBoard(); // parada galdu
		gamePlayerVsComp(); // palaiz speli
		result(); // ieraksta un parada rezultatu

		String iev;
		String ievade;
		do {

			System.out.println("Vai spelet velreiz? Y (Ja) /N (Ne)");
			iev = scanner();
			ievade = iev.toUpperCase();

			switch (ievade) {
			case "Y":
				newGame(); // notira galdu
				printBoard(); // parada galdu
				gamePlayerVsComp(); // palaiz speli
				result(); // ieraksta un parada rezultatu
				continue;
			case "N":
				System.out.println("Izejam no single player versijas");
				break;
			default:
				System.out.println("Nepareiza ievade!");
				break;

			}
		} while (!ievade.equals("N"));
		rezultats1 = 0;
		rezultats2 = 0;
	}
	
	

	public void launchGameMultiPlayer() {

		newGame(); // notira galdu
		printBoard(); // parada galdu
		gamePlayerVsPlayer(); // palaiz speli
		result(); // ieraksta un parada rezultatu
		String iev;
		String ievade;
		do {

			System.out.println("Vai spelet velreiz? Y (Ja) /N (Ne)");
			iev = scanner();
			ievade = iev.toUpperCase();

			switch (ievade) {
			case "Y":
				newGame(); // notira galdu
				printBoard(); // parada galdu
				gamePlayerVsPlayer(); // palaiz speli
				result(); // ieraksta un parada rezultatu
				continue;
			case "N":
				System.out.println("Izejam no multiplayer versijas");
				break;
			default:
				System.out.println("Nepareiza ievade!");
				break;

			}
		} while (!ievade.equals("N"));
		rezultats1 = 0;
		rezultats2 = 0;
	}

	
	
	public void gamePlayerVsComp() {

		gameStat = GameStatus.Spele_aktiva;

		skaititajs++;
		if (skaititajs % 2 != 0) { // Sak "X" speletajs

			do {
				// if(skaititajs>=3) {
				// galds.playerSymbolChange();
				// }

				boolean posTrue = false;
				do {
					ArrayList<Integer> gajiensPlr = player1.makeMove(); // pirmais speletajs izdara gajienu
					int a = gajiensPlr.get(0);
					int b = gajiensPlr.get(1);

					if (testPosition(a, b)) {
						setBoardArr('X', a, b);
						posTrue = false;

					} else {
						System.out.println("Vieta ir aiznemta, megini velreiz");
						posTrue = true;
					}

				} while (posTrue); // strada kamer neieraksta gajienu

				printBoard(); // gajiens ierakstits -> parada galda stavokli

				if (gameStatusCheck(skaititajs) == true) {
					break; // ja ir uzvaretajs vai neizskirts apstadina speli

				}

				posTrue = false;

				do {

					ArrayList<Integer> gajiensComp = playerComp.makeMove(); // dators izdara gajienu
					int c = gajiensComp.get(0);
					int d = gajiensComp.get(1);

					if (testPosition(c, d)) {
						setBoardArr('O', c, d);
						posTrue = false;

					} else {
						gajiensComp.clear();
						posTrue = true;
					}
				} while (posTrue); // strada kamer neieraksta gajienu

				System.out.println("Board after computer`s move: ");

				printBoard(); // gajiens ierakstits -> parada galda stavokli

				if (gameStatusCheck(skaititajs) == true) {
					break; // ja ir uzvaretajs vai neizskirts apstadina speli
				}

			} while (!gameStat.equals(GameStatus.Uzvarejis_1_speletajs)
					|| !gameStat.equals(GameStatus.Uzvarejis_2_speletajs) || !gameStat.equals(GameStatus.Neizskirts));

		} else { // sak "O" speletajs (player 2)
			do {
				boolean posTrue = false;
				do {

					ArrayList<Integer> gajiensComp = playerComp.makeMove(); // otru reizi pirmais sak dators
					int c = gajiensComp.get(0);
					int d = gajiensComp.get(1);

					if (testPosition(c, d)) {
						setBoardArr('O', c, d);
						posTrue = false;

					} else {
						gajiensComp.clear();
						posTrue = true;
					}
				} while (posTrue); // strada kamer neieraksta gajienu

				System.out.println("Board after computer`s move: ");

				printBoard(); // gajiens ierakstits ->parada galda stavokli

				if (gameStatusCheck(skaititajs) == true) {
					break; // ja ir uzvaretajs apstadina speli
				}
				
				posTrue = false;

				do {
					ArrayList<Integer> gajiensPlr = player1.makeMove(); // speletaja gajiens
					int a = gajiensPlr.get(0);
					int b = gajiensPlr.get(1);

					if (testPosition(a, b)) {
						setBoardArr('X', a, b);
						posTrue = false;
					} else {
						System.out.println("Vieta ir aiznemta, megini velreiz");
						posTrue = true;
					}

				} while (posTrue); // strada kamer neieraksta gajienu

				printBoard(); // parada galda stavokli

				if (gameStatusCheck(skaititajs) == true) {
					break; // ja ir uzvaretajs/neizskirts aptur speli, parada speles statusu
				}

			} while (!gameStat.equals(GameStatus.Uzvarejis_1_speletajs)
					|| !gameStat.equals(GameStatus.Uzvarejis_2_speletajs) || !gameStat.equals(GameStatus.Neizskirts));
		}
	}
	
	

	public void gamePlayerVsPlayer() {

		gameStat = GameStatus.Spele_aktiva;

		skaititajs++;
		if (skaititajs % 2 != 0) { // Sak "X" speletajs

			do {

				boolean posTrue = false;
				do {
					System.out.print("Player 1 (X) - ");
					ArrayList<Integer> gajiensPlr1 = player1.makeMove(); // pirmais speletajs izdara gajienu
					int a = gajiensPlr1.get(0);
					int b = gajiensPlr1.get(1);

					if (testPosition(a, b)) {
						setBoardArr('X', a, b);
						posTrue = false;

					} else {
						System.out.println("Vieta ir aiznemta, megini velreiz");
						posTrue = true;
					}

				} while (posTrue); // strada kamer neieraksta gajienu

				printBoard(); // gajiens ierakstits -> parada galda stavokli

				if (gameStatusCheck(skaititajs) == true) {
					break; // ja ir uzvaretajs vai neizskirts apstadina speli

				}
				posTrue = false;

				do {
					System.out.print("Player 2 (O) - ");
					ArrayList<Integer> gajiensPlr2 = player1.makeMove(); // pirmais speletajs izdara gajienu
					int a = gajiensPlr2.get(0);
					int b = gajiensPlr2.get(1);

					if (testPosition(a, b)) {
						setBoardArr('O', a, b);
						posTrue = false;

					} else {
						System.out.println("Vieta ir aiznemta, megini velreiz");
						posTrue = true;
					}

				} while (posTrue); // strada kamer neieraksta gajienu
//				System.out.println("Board after computer`s move: ");
				printBoard(); // gajiens ierakstits -> parada galda stavokli

				if (gameStatusCheck(skaititajs) == true) {
					break; // ja ir uzvaretajs vai neizskirts apstadina speli
				}

			} while (!gameStat.equals(GameStatus.Uzvarejis_1_speletajs)
					|| !gameStat.equals(GameStatus.Uzvarejis_2_speletajs) || !gameStat.equals(GameStatus.Neizskirts));

			
		} else { // sak "O" speletajs (player 2)
			
			do {
				boolean posTrue = false;
				do {
					System.out.print("Player 2 (O) -  ");
					ArrayList<Integer> gajiensPlr2 = player1.makeMove(); // pirmais speletajs izdara gajienu
					int a = gajiensPlr2.get(0);
					int b = gajiensPlr2.get(1);

					if (testPosition(a, b)) {
						setBoardArr('O', a, b);
						posTrue = false;

					} else {
						System.out.println("Vieta ir aiznemta, megini velreiz");
						posTrue = true;
					}
				} while (posTrue); // strada kamer neieraksta gajienu

				printBoard(); // gajiens ierakstits ->parada galda stavokli

				if (gameStatusCheck(skaititajs) == true) {
					break; // ja ir uzvaretajs apstadina speli
				}

				posTrue = false;

				do {
					System.out.print("Player 1 (X) -  ");
					ArrayList<Integer> gajiensPlr1 = player1.makeMove(); // speletaja gajiens
					int a = gajiensPlr1.get(0);
					int b = gajiensPlr1.get(1);

					if (testPosition(a, b)) {
						setBoardArr('X', a, b);
						posTrue = false;
						
					} else {
						System.out.println("Vieta ir aiznemta, megini velreiz");
						posTrue = true;
					}

				} while (posTrue); // strada kamer neieraksta gajienu

				printBoard(); // parada galda stavokli

				if (gameStatusCheck(skaititajs) == true) {
					break; // ja ir uzvaretajs/neizskirts aptur speli, parada speles statusu
				}

			} while (!gameStat.equals(GameStatus.Uzvarejis_1_speletajs)
					|| !gameStat.equals(GameStatus.Uzvarejis_2_speletajs) || !gameStat.equals(GameStatus.Neizskirts));
		}
	}
	
	

	public boolean gameStatusCheck(int skaititajs) {

		boolean result = false;

		if (testWinnerP1()) {
			gameStat = GameStatus.Uzvarejis_1_speletajs;
			System.out.println("GameStatus: " + gameStat);
			result = true;
		} else if (testWinnerP2()) {
			gameStat = GameStatus.Uzvarejis_2_speletajs;
			System.out.println("GameStatus: " + gameStat);
			result = true;
		} else if (testEven()) {
			gameStat = GameStatus.Neizskirts;
			System.out.println("GameStatus: " + gameStat);
			result = true;
		}
		return result;
	}
	
	

	public void result() {

		if (gameStat == GameStatus.Uzvarejis_1_speletajs) {
			rezultats1 = rezultats1 + 1;
		} else if (gameStat == GameStatus.Uzvarejis_2_speletajs) {
			rezultats2 = rezultats2 + 1;
		}
		System.out.println("Player 1: " + rezultats1 + " points");
		System.out.println("Player 2: " + rezultats2 + " points");
	}

	
	public String scanner() {

		Scanner scanner = new Scanner(System.in);
		String ievade = scanner.nextLine();
		// scanner.close();
		return ievade;
	}

}