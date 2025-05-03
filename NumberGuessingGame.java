import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numberTOGuess = random.nextInt(100) + 1; //Random number between 1 to 100.
        int numberOfTries = 0;
        int guess = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number guessing Game!");
        System.out.println("I'm thinking of a number between 1 to 100. Can you guess it?");

        while(!hasGuessedCorrectly)
        {
            System.out.println("Enter your guess number: ");

            //Input validation
            if(!sc.hasNextInt())
            {
                System.out.println("That's not a valid number, Try again.");
                sc.next(); //Discard invaild input
                continue;
            }

            guess = sc.nextInt();
            numberOfTries ++;

            if(guess < 1 || guess > 100)
            {
                System.out.println("Please guess a number between 1 to 100.");
            }
            else if(guess < numberTOGuess)
            {
                System.out.println("Too low! Try again.");
            }
            else if(guess > numberTOGuess)
            {
                System.out.println("Too high! Try again.");
            }
            else
            {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations!, You guessed the number in " + numberOfTries + " tries.");
            }
        }

        sc.close();

    }
}