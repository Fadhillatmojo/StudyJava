import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelciusConverterGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField textFieldCelcius;
    private JLabel celciusLabel;
    private JButton convertButton;
    private JLabel fahrenheitLabel;
    private JTextField textFieldFahrenheit;

    // constructor
    public CelciusConverterGUI(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // ambil text yang dimasukkan user dari celciustextfield1
                // convert ke tipe data double
                if (textFieldFahrenheit.getText().isEmpty()) {
                    int masukan = (int)(Double.parseDouble(textFieldCelcius.getText()));
                    double masukanAfterConvert = masukan * 1.8 +32;
                    textFieldFahrenheit.setText(masukanAfterConvert + "");
                } else if (textFieldCelcius.getText().isEmpty()) {
                    int masukan = (int)(Double.parseDouble(textFieldFahrenheit.getText()));
                    double masukanAfterConvert = (masukan - 32) * 0.555;
                    textFieldCelcius.setText(masukanAfterConvert + "");
                }


            }
        });
    }

    public static void main(String[] args) {
        JFrame frameObj = new CelciusConverterGUI("My Celcius Converter");
        frameObj.setVisible(true);
    }
}
