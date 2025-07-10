import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_10 extends JFrame implements ActionListener {
    JTextField display;
    double num1 = 0, num2 = 0;
    String operator = "";

    public Calculator_10() {
        // Frame setup
        setTitle("Calculator");
        setSize(250, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display setup
        display = new JTextField("0");
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        add(display, BorderLayout.NORTH);

        // Buttons setup
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 5, 5));
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "C", "=", "+"
        };

        for (String text : buttons) {
            JButton btn = new JButton(text);
            btn.setFont(new Font("Arial", Font.BOLD, 20));
            btn.addActionListener(this);
            panel.add(btn);
        }

        add(panel, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9]")) {
            if (display.getText().equals("0") || operator.equals("=")) {
                display.setText(cmd);
                operator = "";
            } else {
                display.setText(display.getText() + cmd);
            }
        } else if (cmd.matches("[+\\-*/]")) {
            num1 = Double.parseDouble(display.getText());
            operator = cmd;
            display.setText("0");
        } else if (cmd.equals("=")) {
            num2 = Double.parseDouble(display.getText());
            double result = switch (operator) {
                case "+" -> num1 + num2;
                case "-" -> num1 - num2;
                case "*" -> num1 * num2;
                case "/" -> (num2 == 0 ? 0 : num1 / num2);
                default -> 0;
            };
            display.setText(String.valueOf(result));
            operator = "=";
        } else if (cmd.equals("C")) {
            display.setText("0");
            num1 = num2 = 0;
            operator = "";
        }
    }

    public static void main(String[] args) {
        new Calculator_10();
    }
}
