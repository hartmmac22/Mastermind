import java.util.ArrayList;

public class Mastermind {
	
	ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
	
	public void buildBoard() {
		board.add(new ArrayList<String>());
		for (int i = 0; i < 4; i++) {
			board.get(0).add(" ");
		}
		
		board.add(new ArrayList<String>());
		for (int i = 1; i < 4; i++) {
			board.get(1).add("0");
			if (i == 2) {
				board.get(1).add("\n\t\t 0");
			}
		}
		
		board.add(new ArrayList<String>());
		for (int i = 0; i < 4; i++) {
			board.get(2).add(" ");
		}
		
		board.add(new ArrayList<String>());
		for (int i = 1; i < 4; i++) {
			board.get(3).add("0");
			if (i == 2) {
				board.get(3).add("\n\t\t 0");
			}
		}
	}
	
	
	public void guessBoard() {
		
		board.get(0).set(0, "A");
		board.get(0).set(1, "B");
		board.get(0).set(2, "C");
		board.get(0).set(3, "D");
	}
	
	
	public void printBoard() {
		System.out.println("Guesses         Scores");
		System.out.print(board.get(0));
		System.out.println("\t" + board.get(1));
		System.out.print(board.get(2));
		System.out.println("\t" + board.get(3));
	}
}


