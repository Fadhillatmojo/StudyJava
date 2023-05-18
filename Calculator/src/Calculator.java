import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame{
    private JPanel mainPanel;
    private JTextField firstNumber;
    private JLabel firstNumberLabel;
    private JTextField secondNumber;
    private JLabel secondNumberLabel;
    private JButton plusButton;
    private JButton timesButton;
    private JButton divideButton;
    private JPanel buttonPane;
    private JButton minusButton;
    private JLabel resultLabel;

    // constructor
    public Calculator(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!(firstNumber.getText().isBlank() || secondNumber.getText().isBlank()))) {
                    double firstNumberInp = (double) Double.parseDouble(firstNumber.getText());
                    double secondNumberInp = (double) Double.parseDouble(secondNumber.getText());
                    double result = firstNumberInp + secondNumberInp;
                    resultLabel.setText("Result : " + result);
                } else {
                    resultLabel.setText("Result : ");
                }
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!(firstNumber.getText().isBlank() || secondNumber.getText().isBlank()))) {
                    double firstNumberInp = (double) Double.parseDouble(firstNumber.getText());
                    double secondNumberInp = (double) Double.parseDouble(secondNumber.getText());
                    double result = firstNumberInp - secondNumberInp;
                    resultLabel.setText("Result : " + result);
                } else {
                    resultLabel.setText("Result : ");
                }
            }
        });
        timesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!(firstNumber.getText().isBlank() || secondNumber.getText().isBlank()))) {
                    double firstNumberInp = (double) Double.parseDouble(firstNumber.getText());
                    double secondNumberInp = (double) Double.parseDouble(secondNumber.getText());
                    double result = firstNumberInp * secondNumberInp;
                    resultLabel.setText("Result : " + result);
                } else {
                    resultLabel.setText("Result : ");
                }
            }
        });
        divideButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((!(firstNumber.getText().isBlank() || secondNumber.getText().isBlank()))) {
                    double firstNumberInp = (double) Double.parseDouble(firstNumber.getText());
                    double secondNumberInp = (double) Double.parseDouble(secondNumber.getText());
                    double result = firstNumberInp / secondNumberInp;
                    resultLabel.setText("Result : " + result);
                } else {
                    resultLabel.setText("Result : ");
                }
            }
        });
    }

    // main
    public static void main(String[] args) {
        JFrame frameObj = new Calculator("My Calculator");
        frameObj.setVisible(true);
    }

}
