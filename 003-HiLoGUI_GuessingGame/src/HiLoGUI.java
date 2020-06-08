import javax.swing.*;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HiLoGUI extends JFrame {

    private JTextField txtGuess;
    private JButton guessButton;
    private JLabel lblOutput;
    private JLabel guessText;
    private JLabel gameTitle;
    private int theNumber;

    private int windowWIDTH = 450;
    private int windowHEIGHT = 300;

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

        gameTitle.setHorizontalAlignment(SwingConstants.CENTER);
        gameTitle.setBounds(10, 10, 414, 30);
        getContentPane().add(gameTitle);

        guessText.setBounds(80, 89, 414, 30);
        getContentPane().add(guessText);

        txtGuess.setBounds(292, 95, 43, 20);
        getContentPane().add(txtGuess);
        txtGuess.setColumns(10);

        guessButton.addActionListener(new ActionListener() {
            // @Override
            public void actionPerformed(ActionEvent e) {
                checkGuess();
            }
        });
        guessButton.setBounds(172, 149, 89, 23);
        getContentPane().add(guessButton);

        lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblOutput);
    }

    public static void main(String[] args) {
        HiLoGUI theGame = new HiLoGUI();
        theGame.newGame();
        theGame.setSize(new Dimension(450, 300));
        theGame.setVisible(true);
    }
}