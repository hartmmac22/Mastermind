import java.util.ArrayList;

public class Mastermind {
	//variables
	//ArrayList
	//2D ArrayList
	
	//char[][] arr = new char[10][8]; //4 secret pins, 4 score location
	//ArrayList<String> test = new ArrayList,String>();
	
	//4 secret pins, 4 score location
	ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
	
	public void builBoard() {
		board.add(new ArrayList<String>());
		board.get(0).add("R");
	}

	public void printBoard() {
		System.out.println("\t Guesses \t Scores");
		System.out.println(board);
	}
}

