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
		//guess 1
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
		
		//guess 2
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
		
		//guess 3
		board.add(new ArrayList<String>());
		for (int i = 0; i < 4; i++) {
			board.get(4).add(" ");
		}
		
		board.add(new ArrayList<String>());
		for (int i = 1; i < 4; i++) {
			board.get(5).add("0");
			if (i == 2) {
				board.get(5).add("\n\t\t 0");
			}
		}
		
		//guess 4
		board.add(new ArrayList<String>());
		for (int i = 0; i < 4; i++) {
			board.get(6).add(" ");
		}
		
		board.add(new ArrayList<String>());
		for (int i = 1; i < 4; i++) {
			board.get(7).add("0");
			if (i == 2) {
				board.get(7).add("\n\t\t 0");
			}
		}
		
		//guess 5
		board.add(new ArrayList<String>());
		for (int i = 0; i < 4; i++) {
			board.get(8).add(" ");
		}
		
		board.add(new ArrayList<String>());
		for (int i = 1; i < 4; i++) {
			board.get(9).add("0");
			if (i == 2) {
				board.get(9).add("\n\t\t 0");
			}
		}
		
		//guess 6
		board.add(new ArrayList<String>());
		for (int i = 0; i < 4; i++) {
			board.get(10).add(" ");
		}
		
		board.add(new ArrayList<String>());
		for (int i = 1; i < 4; i++) {
			board.get(11).add("0");
			if (i == 2) {
				board.get(11).add("\n\t\t 0");
			}
		}
		
		//guess 7
		board.add(new ArrayList<String>());
		for (int i = 0; i < 4; i++) {
			board.get(12).add(" ");
		}
		
		board.add(new ArrayList<String>());
		for (int i = 1; i < 4; i++) {
			board.get(13).add("0");
			if (i == 2) {
				board.get(13).add("\n\t\t 0");
			}
		}
		
		//guess 8
		board.add(new ArrayList<String>());
		for (int i = 0; i < 4; i++) {
			board.get(14).add(" ");
		}
		
		board.add(new ArrayList<String>());
		for (int i = 1; i < 4; i++) {
			board.get(15).add("0");
			if (i == 2) {
				board.get(15).add("\n\t\t 0");
			}
		}
		
		//guess 9
		board.add(new ArrayList<String>());
		for (int i = 0; i < 4; i++) {
			board.get(16).add(" ");
		}
		
		board.add(new ArrayList<String>());
		for (int i = 1; i < 4; i++) {
			board.get(17).add("0");
			if (i == 2) {
				board.get(17).add("\n\t\t 0");
			}
		}
		
		//guess 10
		board.add(new ArrayList<String>());
		for (int i = 0; i < 4; i++) {
			board.get(18).add(" ");
		}
		
		board.add(new ArrayList<String>());
		for (int i = 1; i < 4; i++) {
			board.get(19).add("0");
			if (i == 2) {
				board.get(19).add("\n\t\t 0");
			}
		}
	}
	
	
	public void printBoard() {
		System.out.println("\nGuesses         Scores");
		//guess 1
		System.out.print(board.get(0));
		System.out.println("\t" + board.get(1));
		//guess 2
		System.out.print(board.get(2));
		System.out.println("\t" + board.get(3));
		//guess 3
		System.out.print(board.get(4));
		System.out.println("\t" + board.get(5));
		//guess 4
		System.out.print(board.get(6));
		System.out.println("\t" + board.get(7));
		//guess 5
		System.out.print(board.get(8));
		System.out.println("\t" + board.get(9));
		//guess 6
		System.out.print(board.get(10));
		System.out.println("\t" + board.get(11));
		//guess 7
		System.out.print(board.get(12));
		System.out.println("\t" + board.get(13));
		//guess 8
		System.out.print(board.get(14));
		System.out.println("\t" + board.get(15));
		//guess 9
		System.out.print(board.get(16));
		System.out.println("\t" + board.get(17));
		//guess 10
		System.out.print(board.get(18));
		System.out.println("\t" + board.get(19));
	}
}
