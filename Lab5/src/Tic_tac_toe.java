import java.util.Scanner;

public class Tic_tac_toe {

	static char[][] table = new char[3][3];
	static int input;
	static int inputRecord[]=new int[9];
	static int count = 0;

	static Scanner scan = new Scanner(System.in);
	final static char playerone = 'x';
	final static char playertwo = 'o';
	static char curplayer;
	

	public static void main(String[] args) {

		startGame();
		printBoard();
		System.out.println(	"\nEnter your move between 1-9 (1 for 1 row 1 coloumn) (2 for 1 row 2 coloumn)\nplayer 1 is x, player 2 is o");
		for(int x = 0; x < 9; x++) { // checks which player made the move
			if(x%2 == 0) {
				curplayer = playerone;
			}
			else {
				curplayer = playertwo;
			}
			enterMove();
			printBoard();
			if(checkWinner()) {
				System.out.println("\nThe winner is: " + curplayer+".");
				break;
			}
		}
		System.out.println("\nOk good bye!");

	}
	
	public static void startGame() {
		
		for(int rows = 0; rows < table.length; rows++) {
			for(int col = 0; col < table[rows].length; col++) {
				table[rows][col]=' ';
			}
		}
	}
	public static void enterMove() { //enter a move checks; and marks the appropriate box
		System.out.println("\nEnter your move, player " + curplayer + ": ");
		input = scan.nextInt();		
		while(input<1||input>9) {
			System.out.println("Invelid input, Enter a number between 1-9: ");
			input = scan.nextInt();
		}
		checkEnterTwice();
		inputRecord[count]=input;
		
		switch (input) {
		case 1: table[0][0]= curplayer;
			break;
		case 2: table[0][1]= curplayer;
			break;
		case 3: table[0][2]= curplayer;
			break;
		case 4: table[1][0]= curplayer;
			break;
		case 5: table[1][1]= curplayer;
			break;
		case 6: table[1][2]= curplayer;
			break;
		case 7: table[2][0]= curplayer;
			break;
		case 8: table[2][1]= curplayer;
			break;
		case 9: table[2][2]= curplayer;
		}
		count++;
	}
	
	public static void printBoard() { //Prints the board
		for(int rows = 0; rows < table.length; rows++) {
			for(int col = 0; col < table[rows].length; col++) {
				System.out.print(table[rows][col]);
				if(col<2) {
					System.out.print("|");
				}
			}
			if(rows < 2) {
				System.out.print("\n------\n");
			}
		}
	}
	
	public static void checkEnterTwice() {//Checks if the players are trying to marked an already marked box again
		for(int x = 0; x<inputRecord.length; x++) {
			while(inputRecord[x]==input) {
				System.out.println("\nThe box has already been marked, Please choose another box: ");
				input = scan.nextInt();
			}
		}
		inputRecord[count]= input;
	}
	
	public static boolean checkWinner() { // I know this is not very efficient
		return ((table[0][0]==curplayer)&&(table[0][1]==curplayer)&&(table[0][2]==curplayer)||//check 1st row
				(table[1][0]==curplayer)&&(table[1][1]==curplayer)&&(table[1][2]==curplayer)||//check 2nd row
				(table[2][0]==curplayer)&&(table[2][1]==curplayer)&&(table[2][2]==curplayer)||//check 3rd row
				(table[0][0]==curplayer)&&(table[1][0]==curplayer)&&(table[2][0]==curplayer)||//check 1st col
				(table[0][1]==curplayer)&&(table[1][1]==curplayer)&&(table[2][1]==curplayer)||//check 2nd col
				(table[0][2]==curplayer)&&(table[1][2]==curplayer)&&(table[2][2]==curplayer)||//check 3rd col
				(table[0][0]==curplayer)&&(table[1][1]==curplayer)&&(table[2][2]==curplayer)||//check diagonally
				(table[0][2]==curplayer)&&(table[1][1]==curplayer)&&(table[2][0]==curplayer));//check other diagonal
		}
}
//Just checking
