import java.util.Scanner;
import javax.swing.JFrame;

public class HiLoGUI extends JFrame {
    public static void main(String[] args) {
        // Create a Scanner object that pulls input from the keyboard (System.in)
        Scanner scan = new Scanner(System.in);
        String playAgain = "";

        do {
            // Create a random number for the user to guess
            int theNumber = (int)(Math.random() * 100 + 1);
            // System.out.println(theNumber);
            int guess = 0;
            int numberOfTries = 0;

            while (guess != theNumber) {
                // Prompt the user to enter a guess and save it
                System.out.print("Guess a number between 1 and 100: ");
                guess = scan.nextInt();
                if (guess < theNumber) {
                    numberOfTries++;
                    System.out.println(guess + " is too low. Try again.");
                }
                else if (guess > theNumber) {
                    numberOfTries++;
                    System.out.println(guess + " is too high. Try again");
                }
                else {
                    numberOfTries++;
                    System.out.println(guess + " is correct. You win!");
                    System.out.print("It only took you " + numberOfTries + " numberOfTries! Good work!");
                }

            } // End of while loop for guessing
            System.out.print("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing! Goodbye.");
        scan.close();
    }
}