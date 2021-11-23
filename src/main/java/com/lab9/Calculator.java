import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;


public class Calculator {
    public static void main(String[] args) {
        new Division();
    }
}


class Division extends JFrame implements ActionListener {
    private JTextField t1;
    private JTextField t2;
    private JLabel label;
    private JButton button;

    public Division() {
        // Basic Level (mark 5 || 6)
        this.t1 = new JTextField(15);
        this.t2 = new JTextField(15);
        this.label = new JLabel("Result: ");
        this.button = new JButton("Divide");

        this.add(this.t1);
        this.add(this.t2);
        this.add(this.label);
        this.add(this.button);

        this.button.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.setVisible(true);
        this.setSize(1000, 75);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Medium Level (mark 7 || 8)
        try {
            double x1 = Double.parseDouble(this.t1.getText());
            double x2 = Double.parseDouble(this.t2.getText());
            double result = x1 / x2;

            // Advanced Level (mark 9 || 10)
            if(x2 == 13.0) {
                throw new UnluckyException();
            }

            this.label.setText(result + "");
        } catch(Exception exception) {
            this.label.setText(exception.toString());
        }
    }
}

// Advanced Level (mark 9 || 10)
class UnluckyException extends Exception {
    public UnluckyException() {
        super("Unlucky Exception, divisor equal to 13");
    }
}
