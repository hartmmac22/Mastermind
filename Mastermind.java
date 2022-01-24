import java.util.ArrayList;
import java.util.Scanner;

public class Mastermind {
	
	ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
	Scanner keyboard = new Scanner(System.in);
	
	
	public void guessBoard() {
		//secret code = ABCD
		System.out.print("Guess Digit 1: ");
		String digit1 = keyboard.nextLine();
		System.out.print("\nGuess Digit 2: ");
		String digit2 = keyboard.nextLine();
		System.out.print("\nGuess Digit 3: ");
		String digit3 = keyboard.nextLine();
		System.out.print("\nGuess Digit 4: ");
		String digit4 = keyboard.nextLine();
		board.get(0).set(0, digit1);
		board.get(0).set(1, digit2);
		board.get(0).set(2, digit3);
		board.get(0).set(3, digit4);
		
		String a = "2";
		String b = "1";
		//checks right letter wrong place guesses
		if( board.get(0).get(0).equals("A") || board.get(0).get(0).equals("B") || board.get(0).get(0).equals("C") || board.get(0).get(0).equals("D")) {
			board.get(1).set(2, ("\n\t\t " + b)); 
		}
		if( board.get(0).get(1).equals("A") || board.get(0).get(1).equals("B") || board.get(0).get(1).equals("C") || board.get(0).get(1).equals("D")) {
			board.get(1).set(3, b); 
		}
		if( board.get(0).get(2).equals("A") || board.get(0).get(2).equals("B") || board.get(0).get(2).equals("C") || board.get(0).get(2).equals("D")) {
			board.get(1).set(1, b); 
		}
		if( board.get(0).get(3).equals("A") || board.get(0).get(3).equals("B") || board.get(0).get(3).equals("C") || board.get(0).get(3).equals("D")) {
			board.get(1).set(0, b); 
		}
		//checks correct guesses
		if( board.get(0).get(0).equals("A")) {
			board.get(1).set(2, ("\n\t\t " + a)); 
		}
	
		if( board.get(0).get(1).equals("B")) {
			board.get(1).set(3, a); 
		}
	
		if( board.get(0).get(2).equals("C")) {
			board.get(1).set(1, a); 
		}
	
		if( board.get(0).get(3).equals("D")) {
			board.get(1).set(0, a); 
		}
		
		
		
	}
	
	public void buildBoard() {
		//prints the formatting for the orginal board of all zeros
		for( int g = 0; g < 20; g+= 2) {
			board.add(new ArrayList<String>());
			for (int i = 0; i < 4; i++) {
				board.get(g).add(" ");
			}
		
			board.add(new ArrayList<String>());
			for (int i = 1; i < 4; i++) {
				board.get(g+1).add("0");
				if (i == 2) {
					board.get(g+1).add("\n\t\t 0");
				}
			}	
		}
	
	}
	
	
	public void printBoard() {
		System.out.println("\nGuesses         Scores");
		//prints each guess
		for (int h = 0; h < 20; h += 2) {
			System.out.print(board.get(h));
			System.out.println("\t" + board.get(h + 1));
		}
	}
}

