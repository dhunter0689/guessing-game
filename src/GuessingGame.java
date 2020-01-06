import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int numGuess = rand.nextInt(11 - 0);
		int numberChances = 0;
		Scanner input = new Scanner(System.in);
		int guess;
		boolean win = false;

		while (win == false)

		{

			System.out.println("Guess a number from 1 - 10.");
			guess = input.nextInt();
			numberChances++;

			if (guess == numGuess) {
				win = true;

			} else if (guess < numGuess) {
				System.out.println("Your guess is too low.");

			} else if (guess > numGuess) {
				System.out.println("Your guess is too high.");
			} else if (guess == -1) {
				System.exit(0);
			}
			else if (guess == 0) {
				System.out.println("Try again, in order to play, guess a number between 1 - 10.");
			}else  {
					System.exit(0);
			}
		}

		{
			System.out.println("You won the game!");
			System.out.println("The number was " + numGuess);
			System.out.println("It took " + numberChances + "tries.");

		}

		input.close();
	}
	
}
