import java.util.ArrayList;
import java.util.Scanner;

public class Mastermind {
	
	ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
	Scanner keyboard = new Scanner(System.in);
	
	
	public void guessBoard() {
		for (int h = 0; h < 20; h+=2) {
		//secret code = ABCD
			System.out.print("Guess Digit 1: ");
			String digit1 = keyboard.nextLine();
			System.out.print("\nGuess Digit 2: ");
			String digit2 = keyboard.nextLine();
			System.out.print("\nGuess Digit 3: ");
			String digit3 = keyboard.nextLine();
			System.out.print("\nGuess Digit 4: ");
			String digit4 = keyboard.nextLine();
			board.get(h).set(0, digit1);
			board.get(h).set(1, digit2);
			board.get(h).set(2, digit3);
			board.get(h).set(3, digit4);
		
			String a = "2";
			String b = "1";
			//checks right letter wrong place guesses
			if( board.get(h).get(0).equals("A") || board.get(h).get(0).equals("B") || board.get(h).get(0).equals("C") || board.get(h).get(0).equals("D")) {
				board.get(h+1).set(2, ("\n\t\t " + b)); 
			}
			if( board.get(h).get(1).equals("A") || board.get(h).get(1).equals("B") || board.get(h).get(1).equals("C") || board.get(h).get(1).equals("D")) {
				board.get(h+1).set(3, b); 
			}
			if( board.get(h).get(2).equals("A") || board.get(h).get(2).equals("B") || board.get(h).get(2).equals("C") || board.get(h).get(2).equals("D")) {
				board.get(h+1).set(1, b); 
			}
			if( board.get(h).get(3).equals("A") || board.get(h).get(3).equals("B") || board.get(h).get(3).equals("C") || board.get(h).get(3).equals("D")) {
				board.get(h+1).set(0, b); 
			}
			//checks correct guesses
			if( board.get(h).get(0).equals("A")) {
				board.get(h+1).set(2, ("\n\t\t " + a)); 
			}
	
			if( board.get(h).get(1).equals("B")) {
				board.get(h+1).set(3, a); 
			}
	
			if( board.get(h).get(2).equals("C")) {
				board.get(h+1).set(1, a); 
			}
	
			if( board.get(h).get(3).equals("D")) {
				board.get(h+1).set(0, a); 
			}
			System.out.println("\nGuesses         Scores");
			//prints each guess
			for (int p = 0; p < 20; p += 2) {
				System.out.print(board.get(p));
				System.out.println("\t" + board.get(p + 1));
			}
		}	//close loop that cycles through guesses
	}// closes guessBoard()
	
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
}
