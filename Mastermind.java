import java.util.ArrayList;
import java.util.Scanner;

public class Mastermind {
	
	ArrayList<ArrayList<String>> board = new ArrayList<ArrayList<String>>();
	Scanner keyboard = new Scanner(System.in);
	
	// variables
	int d = 1;
	int gameWin = 0;
	int guesses = 0;
	String c1;
	String c2;
	String c3;
	String c4;
	
	//Prints rules in the begining
	public void rules() {
		System.out.println("\nRules: ");
		System.out.println("- Color Choices: R, Y, O, G, B, P, W");
		System.out.println("- No Repeats");
		System.out.println("- 0 = Wrong, 1 = Right Colour & Wrong Place, 2 = Right Colour & Right Place");
	}
	
	
	//prints the formatting for the orginal board of all zeros
	public void buildBoard() {
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
	}// closes builBoard()
	
	
	//creates the 4 digit "secret code"
	public void makeGuess() {
		int z = (int)(Math.random()*(7));
		String[] arr  = { "R", "Y", "O", "G", "B", "P", "W"};
		c1 = arr[z];
		z = (int)(Math.random()*(7));
		c2 = arr[z];
		
		while (c1.equals(c2)) {
			z = (int)(Math.random()*(7));
			c2 = arr[z];
		}
		
		z = (int)(Math.random()*(7));
		c3 = arr[z];
		 
		while (c1.equals(c3) || c2.equals(c3)) {
			z = (int)(Math.random()*(7));
			c3 = arr[z];
		}
		
		z = (int)(Math.random()*(7));
		c4 = arr[z];
		
		while (c1.equals(c4) || c2.equals(c4) || c3.equals(c4)) {
			z = (int)(Math.random()*(7));
			c4 = arr[z];
		}
		
		//TURN THIS ON TO HAVE THE SECRET CODE PRINT
		System.out.println(c1 + c2 + c3 + c4);
	}
	
	
	//takes in the guesses and checks whether they are right
	public void guessBoard() {
		for (int h = 0; h < 20; h+=2) {
			guesses = guesses + 1;
			System.out.println("Guess " + guesses);
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
			gameWin = 0;
			//checks right letter wrong place guesses
			if( board.get(h).get(0).equals(c1) || board.get(h).get(0).equals(c2) || board.get(h).get(0).equals(c3) || board.get(h).get(0).equals(c4)) {
				board.get(h+1).set(2, ("\n\t\t " + b)); 
			}
			if( board.get(h).get(1).equals(c1) || board.get(h).get(1).equals(c2) || board.get(h).get(1).equals(c3) || board.get(h).get(1).equals(c4)) {
				board.get(h+1).set(3, b); 
			}
			if( board.get(h).get(2).equals(c1) || board.get(h).get(2).equals(c2) || board.get(h).get(2).equals(c3) || board.get(h).get(2).equals(c4)) {
				board.get(h+1).set(1, b); 
			}
			if( board.get(h).get(3).equals(c1) || board.get(h).get(3).equals(c2) || board.get(h).get(3).equals(c3) || board.get(h).get(3).equals(c4)) {
				board.get(h+1).set(0, b); 
			}
			//checks correct guesses
			if( board.get(h).get(0).equals(c1)) {
				board.get(h+1).set(2, ("\n\t\t " + a));
				gameWin = gameWin + 1; 
			}
	
			if( board.get(h).get(1).equals(c2)) {
				board.get(h+1).set(3, a); 
				gameWin = gameWin + 1;
			}
	
			if( board.get(h).get(2).equals(c3)) {
				board.get(h+1).set(1, a); 
				gameWin = gameWin + 1;
			}
	
			if( board.get(h).get(3).equals(c4)) {
				board.get(h+1).set(0, a); 
				gameWin = gameWin + 1;
			}
			
			
			//prints board
			System.out.println("\nGuesses         Scores");
			//prints each guess
			for (int p = 0; p < d; p += 2) {
				System.out.print(board.get(p));
				System.out.println("\t" + board.get(p + 1));
				//d++;
			}
			
			d+=2;//makes sure the printing loop only prints the board for the amount of guesses they've made 
			
			//checks if they guessed all 4 digits of the secret code correctly
			if ( gameWin == 4) {
				h = 20;
			}		
		}
		
	}// closes guessBoard()
	
	public void gameEnd() {
		if (guesses == 10 && gameWin != 4) {
			System.out.println("Sorry you've run out of guesses.  The answer was " + c1 + c2 + c3 + c4);
		}
		else {
			System.out.println("\nCongrats!! You've won the game!");
		}
	}
}
