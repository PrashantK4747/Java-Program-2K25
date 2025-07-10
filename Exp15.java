import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Exp15 {
    private static Connection connect() throws SQLException {
        // Oracle DB connection
        String url = "jdbc:oracle:thin:@localhost:1521:xe"; // adjust if needed
        String username = "yourUsername"; // your DB username
        String password = "yourPassword"; // your DB password
        return DriverManager.getConnection(url, username, password);
    }

    public static void main(String[] args) {
        // Frame setup
        JFrame frame = new JFrame("Login Form");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Components
        JLabel userLabel = new JLabel("Username:");
        JTextField userField = new JTextField(15);

        JLabel passLabel = new JLabel("Password:");
        JPasswordField passField = new JPasswordField(15);

        JButton loginButton = new JButton("Login");
        JLabel messageLabel = new JLabel();

        // Add components to frame
        frame.add(userLabel);
        frame.add(userField);
        frame.add(passLabel);
        frame.add(passField);
        frame.add(loginButton);
        frame.add(messageLabel);

        // Action listener
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try (Connection con = connect()) {
                    String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, userField.getText());
                    ps.setString(2, new String(passField.getPassword()));
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {
                        messageLabel.setText("Login successful!");
                    } else {
                        messageLabel.setText("Invalid credentials.");
                    }
                } catch (Exception ex) {
                    messageLabel.setText("Error: " + ex.getMessage());
                }
            }
        });

        // Show frame
        frame.setVisible(true);
    }
}

