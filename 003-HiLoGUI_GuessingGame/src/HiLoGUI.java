import javax.swing.*;

public class HiLoGUI extends JFrame {

    private JTextField txtGuess;
    private JButton guessButton;
    private JLabel lblOutput;
    private int theNumber;

    public void checkGuess() {
        String guessText = txtGuess.getText();
        String message = "";
        int guess = Integer.parseInt(guessText);

        if (guess < theNumber)
            message = guess + " is too low. Try again.";
        else if (guess > theNumber)
            message = guess + " is too high. Try Again.";
        else
            message = guess + " is correct. You win!";
        
        // Show the message to the user, using the lblOutput GUI label
        lblOutput.setText(message);
    }

    public static void main(String[] args) {
        // TODO
    }
}