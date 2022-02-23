import java.util.Random;
import java.util.Scanner;

public class Guessing {
	public static void main(String[] args) {
		Random rand = new Random();
		
		// target is between 1 and 10, inclusive
		// This is the secret number we want the user to guess
		final int target = rand.nextInt(10) + 1;
		System.out.println("Guess a number");
		Scanner userGuess = new Scanner(System.in);
		// TODO: complete the main method
int guessCount = 0;
		int integer  = userGuess.nextInt();
		while(integer != target){

			System.out.print("Guess a number");
			System.out.println();
			if(integer != target){
				System.out.println("guess again");
			}
			guessCount++;
			if(guessCount == 3){
				System.out.println("too many guesses");
				break;
			}
			if(userGuess.nextInt() == target){
				System.out.println("That is correct");
			}
		}

	}
}
