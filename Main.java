import java.util.Scanner;
public class Main {

	static Scanner sc = new Scanner(System.in);

	static int[][] moves = { {-2, +1},
			       {-1, +2},
			       {+1, +2},
			       {+2, +1},
			       {+2, -1},
			       {+1, -2},
			       {-1, -2},
			       {-2, -1} };
	public static void main(String[] args) {

		System.out.println("Welcome to the "
			+ "Knight Move calculator. \n");
		do {
			showKnightMoves();
		}
		while (getYorN("Do it again?"));
	}
	public static void showKnightMoves() {
		int[][] board = new int[8][8];

		String kSquare;
		Pos kPos;

		do {
			System.out.print("Enter knight's position: ");
			kSquare = sc.nextLine();
			kPos = convertSquareToPos(kSquare);
		}
		while (kPos == null);
	}
}
