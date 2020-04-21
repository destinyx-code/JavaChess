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
	}
}
