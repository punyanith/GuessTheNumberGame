import java.util.Scanner;
import java.util.Random;

class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String play = "yes";

        // print welcome message & intro
        System.out.println( " ");
        System.out.println("Welcome to the random number guessing game");
        System.out.println(" ");
        System.out.println( " The random number will range from 0 to 250");
        System.out.println( " ");
        System.out.println( " Lets start guessing!");
        System.out.println( " ");

        // while loop to determine if we are going to play the game again
        while(play.equals("yes"))
        {
            Random rand = new Random();
            int randNum = rand.nextInt(250);
            int guess = -1;
            int tries = 0;
            
            // while loop to check if the game is over
            while(guess != randNum)
            {
                System.out.print(" Guess a number between 1 and 250: ");
                guess = reader.nextInt();

                // count the number that the user guessed each time, +1
                tries++;

                if(guess == randNum)
                {
                    System.out.println( " ");
                    System.out.println( " Congrats! You guessed the number.");

                    System.out.println( " ");

                    // the message also print out the number of guessed the user made before the correct guess
                    System.out.print(" It only takes you " + tries + " guesses!");

                    System.out.println( " ");

                    // yes will continue the while loop, while no will end it
                    System.out.print( " Would you like to play again? Yes or No: ");
                    play = reader.next().toLowerCase();
                }

                // the system compare the user input to the target number
                else if(guess > randNum)
                {
                    System.out.println( " ");
                    System.out.print(" Your guess is too high, try again.");
                }
                else
                {
                    System.out.println( " ");
                    System.out.print(" Your guess is too low, try again.");
                }
            }
        }

        {
            // Outside of the while loop
            System.out.println( " ");
            System.out.println( " Thank you for playing, good bye!");
        }

    reader.close();
            
    }
    
}