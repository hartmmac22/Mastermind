# Mastermind

From Wikipedia: Mastermind or Master Mind is a code-breaking game for two players. The modern game with pegs was invented in 1970 by Mordecai Meirowitz, an Israeli postmaster and telecommunications expert.[1][2] It resembles an earlier pencil and paper game called Bulls and Cows that may date back a century or more.

# Red, Yellow, Orange, Green, Blue, Purple, White
# Scoring Black, White

Mastermind.  (Main.java class if using Repl.it but ok)
*Make a game class
**gives rules at beginning (could be a method call printRules() )
**Scanner class - input user prompts, etc
***would make calls to methods to guess position
***return for this? int[#cPcL][#cPwL]
**Instructions - capture instructions (for text file and UI)\
**?PvP = play1 choses secret code (swap places at keyboard)
***play2 - takes turn guessing
**?PvC	= play1 - computer randomizes colors and location of pins				
***play2 - takes turn guessing
		
*Make a board Class
**Pins - Encoding colors - do we use ints or chars?
**[R, G, Y, O]   [R, B, Y, G]  [2][1]
**[R, G, Y, O]   [R, O, Y, G]  [2][2]   
**int - translate btwn colors
**chars - individual letter

|  | PROS| CONS |
|Ints|-simple to code | -translate back and forth |
|   |		     |-might be confusing to player|
|chars| -less confusion for player | -a bit more code to learn |	 

*Arrays - 1-2D array for player guesses
	**1-1D array for the secret code




For this project I coded a game of Mastermind.  I began the project simply trying to get the format of my board, where it print a 4 digit line then a 2x2 box.  This formatting took a while to get down but after I figured it out I move onto the guessing part of the game.  I worked on creating a method that would take in user input for the four digit code and place in correctly into the board.  After I finished that I worked on a checking that against the four digit code "ABCD".  Once the checking function was finished I moved onto checking it against a randomly created 4 digit code.  After that the basic game was finished and I moved onto fine tuning details.  I simplified some of my code by creating more for loops; I made it so that the board only prints the amount of guesses you have made and not the entire board eberytime; I added a play again function; I added rules; I then fine tuned the printing meachnisms to make evrything look pretty.

Rules: 
1. 10 trys to guess a 4 digit code
2. No Repeat letters
3. 0 = Wrong Letter, Wrong Place
4. 1 = Right Letter, Wrong Place
5. 2 = Right Letter, Right Place

The hardest part of this project was definetly printing the correct format for the board and making sure everything I wanted to input into the board made it to the right place.  The other parts of the lab, such as generating the random code or checking the guesses, were not as hard to code.  The part that took me a while was after all the basic functions were done, was simplifying my code and shorten it while still keeping its function in tact.  I don't always use loops the first time around and rather op for just copy and pasting things over and over again, so after I know something works I then go back to make it a loop.  Overall, it was a fun but challenging project.



