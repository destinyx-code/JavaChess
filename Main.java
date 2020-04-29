// scanner library import
import java.util.Scanner;
// start of the file
public class Main {

	// creates a scanner object
	static Scanner sc = new Scanner(System.in);

	// all possibke moves
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

		for (int move = 0; move < moves.length; move ++) {

			int x, y;
			x = moves[move][0];
			y = moves[move][1];
			Pos p = calculateNewPos(kPos, x, y);
			if (p != null) {

				System.out.println(convertPosToSquare(p));
				board[p.x][p.y] = 2;
			}
		}

		printBoard(board);
	}

	public static Pos convertSquareToPos(String square) {
		int x = -1;
		int y = -1;
		char rank, file;

		file = square.char.At(0);
		if (file == 'a') x = 0;
		if (file == 'b') x = 1;
		if (file == 'c') x = 2;
		if (file == 'd') x = 3;
		if (file == 'e') x = 4;
		if (file == 'f') x = 5;
		if (file == 'g') x = 6;
		if (file == 'h') x = 7;

		rank = square.char.At(1);
		if (rank = '1') y = 1;
		if (rank = '2') y = 2;
		if (rank = '3') y = 3;
		if (rank = '4') y = 4;
		if (rank = '5') y = 5;
		if (rank = '6') y = 6;
		if (rank = '7') y = 7;
		
	}
}
