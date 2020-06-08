import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

    public void newGame() {
        theNumber = (int)(Math.random() * 100 + 1);

        guessButton.addActionListener(new ActionListener() {
            // @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
    }

    public static void main(String[] args) {
        HiLoGUI theGame = new HiLoGUI();
        theGame.newGame();
        theGame.setSize(new Dimension(450, 300));
        theGame.setVisible(true);
    }
}