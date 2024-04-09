import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prog9 extends JFrame implements KeyListener {
    private JTextField textField;
    private JLabel label;
    private String inputNumber;

    public prog9() {
        setTitle("Reverse Number App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null); // Center the frame

        // Create a panel to hold the components
        JPanel panel = new JPanel(new FlowLayout());

        // Create a text field
        textField = new JTextField(20);
        textField.addKeyListener(this);
        panel.add(textField);

        // Create a label to display the reversed number
        label = new JLabel();
        panel.add(label);

        // Add the panel to the frame
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        // If the "J" key is pressed
        if (e.getKeyCode() == KeyEvent.VK_J) {
            inputNumber = textField.getText();
            String reversedNumber = reverseNumber(inputNumber);
            label.setText("Reversed Number: " + reversedNumber);
        }
    }

    public void keyReleased(KeyEvent e) {
        // Not needed for this example
    }

    public void keyTyped(KeyEvent e) {
        // Not needed for this example
    }

    private String reverseNumber(String number) {
        StringBuilder reversedNumber = new StringBuilder();
        for (int i = number.length() - 1; i >= 0; i--) {
            reversedNumber.append(number.charAt(i));
        }
        return reversedNumber.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new prog9();
            }
        });
    }
}