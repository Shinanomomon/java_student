import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ArithmeticCalculator2 implements ActionListener {
    private JFrame frame;
    private JTextField textField1, textField2;
    private JLabel resultLabel;
    
    public ArithmeticCalculator2() {
        frame = new JFrame("Arithmetic Calculator");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));
        
        JLabel label1 = new JLabel("Number 1: ");
        textField1 = new JTextField(10);
        panel.add(label1);
        panel.add(textField1);
        
        JLabel label2 = new JLabel("Number 2: ");
        textField2 = new JTextField(10);
        panel.add(label2);
        panel.add(textField2);
        
        JButton addButton = new JButton("+");
        addButton.addActionListener(this);
        panel.add(addButton);
        
        JButton subtractButton = new JButton("-");
        subtractButton.addActionListener(this);
        panel.add(subtractButton);
        
        JButton multiplyButton = new JButton("*");
        multiplyButton.addActionListener(this);
        panel.add(multiplyButton);
        
        JButton divideButton = new JButton("/");
        divideButton.addActionListener(this);
        panel.add(divideButton);
        
        resultLabel = new JLabel("Result: ");
        panel.add(resultLabel);
        
        frame.add(panel);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());
        
        if (e.getActionCommand().equals("+")) {
            double result = num1 + num2;
            resultLabel.setText("Result: " + result);
        } else if (e.getActionCommand().equals("-")) {
            double result = num1 - num2;
            resultLabel.setText("Result: " + result);
        } else if (e.getActionCommand().equals("*")) {
            double result = num1 * num2;
            resultLabel.setText("Result: " + result);
        } else if (e.getActionCommand().equals("/")) {
            if (num2 == 0) {
                resultLabel.setText("Result: Error - division by zero");
            } else {
                double result = num1 / num2;
                resultLabel.setText("Result: " + result);
            }
         }
        }
        public static void main(String[] args){
            new ArithmeticCalculator();
        }
    }

