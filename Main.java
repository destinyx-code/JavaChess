/* Chess! 
by Ryder Stanley
written in java */

// scanner library import
import java.util.Scanner;
// start of the file
public class Main {

	// creates a scanner object
	static Scanner sc = new Scanner(System.in);

	// all possible moves
	static int[][] moves = { {-2, +1},
			       {-1, +2},
			       {+1, +2},
			       {+2, +1},
			       {+2, -1},
			       {+1, -2},
			       {-1, -2},
			       {-2, -1} };

	// the start of the executable code
	public static void main(String[] args) {

		// prints the opening title
		System.out.println("Welcome to the "
			+ "Knight Move calculator. \n");

		// shows the knights moves while an action has been chosen
		do {
			showKnightMoves();
		}
		while (getYorN("Do it again?"));
	}

	// the value of the show knight moves function
	public static void showKnightMoves() {
		int[][] board = new int[8][8];

		// declares a square variable
		String kSquare;

		// declares a position variable
		Pos kPos;

		// prints to ask for the knights positon
		do {
					System.out.print("Enter knight's position: ");
			// if an input has been entered it generates a new line to show the grid
			kSquare = sc.nextLine();

			// if an input has been entered it generates a converter and converts the grid to a position
			kPos = convertSquareToPos(kSquare);
		}

		// while the position does not exist it enters an anti game loop
		while (kPos == null);
		board[kPos.x][kPos.y] = 1;
		System.out.println("\nThe knight is at square "
			+ convertPosToSquare(kPos));
		System.out.println(
			"From here the knight can move to: ");

		// enters a for loop that moves whatever position the user entered into possible positions
		for (int move = 0; move < moves.length; move ++) {

			// declares the x and y integers
			int x, y;

			// x moves the move 0
			x = moves[move][0];
			// y moves the move 1
			y = moves[move][1];

			// creates a user position function which is equal to kPos, x, and y
			Pos p = calculateNewPos(kPos, x, y);

			// if the position is nan it gives the error loop
			if (p != null) {

				System.out.println(convertPosToSquare(p));
				board[p.x][p.y] = 2;
			}
		}

		// displays the board
		printBoard(board);
	}

	// the value of the cqtp function
	public static Pos convertSquareToPos(String square) {
		// x goes down by one when the cqtp loop begins
		int x = -1;
		// y goes down by one when the cqtp loop begins
		int y = -1;

		// creates a char of the rank and file
		char rank, file;

		// creates the file square char
		file = square.At(0);

		// a is 0, b is 1, c is 2... so on
		if (file == 'a') x = 0;
		if (file == 'b') x = 1;
		if (file == 'c') x = 2;
		if (file == 'd') x = 3;
		if (file == 'e') x = 4;
		if (file == 'f') x = 5;
		if (file == 'g') x = 6;
		if (file == 'h') x = 7;

		// creates the rank square char
		rank = square.At(1);

		// the rank is 1, y is 1, the rank is 2, the y is 2, so on
		if (rank = '1') y = 1;
		if (rank = '2') y = 2;
		if (rank = '3') y = 3;
		if (rank = '4') y = 4;
		if (rank = '5') y = 5;
		if (rank = '6') y = 6;
		if (rank = '7') y = 7;
		if (rank = "8") y = 8;

		// if x and y are less thaan we allow it outputs null
		if (x == -1 || y == -1) {
			return null;
		}
		// otherwise it enters a new position
		else {
			return new Pos(x, y);
		}
		
	// here we declare the value of the cpts function
		public static String convertPosToSquare(Pos p) {

		// the file starts blank
		String file = "";

		// we use the same ranking loop but with x positions
		if (p.x == 0) file = "a";
		if (p.x == 1) file = "b";
		if (p.x == 2) file = "c";	
		if (p.x == 3) file = "d";
		if (p.x == 4) file = "e";
		if (p.x == 5) file = "f";
		if (p.x == 6) file = "g";
		if (p.x == 7) file = "h";

		// it returns the file
		return file + (p.y + 1);
		}

	// we create a new loop
	public static Pos calculateNewPos(Pos p, int x, int y) {

		// rules out all the illegal positons
		if (p.x + x < 0)
			return null;
		if (p.x + x > 7)
			return null;
		if (p.y + y < 0)
			return null;
		if (p.y + y > 7)
			return null;
	return new Pos(p.x + x, p.y + y);
		}
	
	// the value of the printboard function
	public static void printBoard(int[][] b) {
		
		// enters a calculation loop for the users move
		for (int y =7; y >= 0; y--) {
			
			// adds upon previous calculation loop
			for (int x = 0; x < 8; x++) {
				
				// displays the result of the loop
				if (b[x][y] == 1)
					System.out.println(" X ");
				else if (b[x][y] == 2)
					System.out.println(" ? ");
				else {
					System.out.println(" - ");
				}
			}

			// prints the display
			System.out.println();
		}
	
	}
	// the value of the getYorN function
	public static boolean getYorN(String prompt) {
		
		// enters a basic game loop
		while(true) {
			String answer;
			System.out.println("\n" + prompt + " (Y or N) ");
			answer = sc.nextLine();
			
			if (answer.equalsIgnoreCase("Y"))
				return true;
			else if (answer.equalsIgnoreCase("N"))
				return false;
		}
	}	
	

	// final location display
	class Pos {
		public int x;
		public int y;
	
	public Pos(int x, int y) {
		this.x = x;
		this.y = y;
		}
	}	
	}	
