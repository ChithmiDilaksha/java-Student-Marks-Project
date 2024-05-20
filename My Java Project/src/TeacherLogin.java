import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherLogin extends JFrame {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, clearButton, backButton;

    TeacherLogin() {
        super("Login Form");

        // Creating and configuring components
        label1 = new JLabel("Teacher Login Form");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 30));
        label1.setBounds(250, 110, 500, 35);

        label2 = new JLabel("User Name:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(200, 190, 375, 40);

        textField2 = new JTextField(15);
        textField2.setBounds(400, 200, 250, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));

        label3 = new JLabel("Password: ");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(200, 250, 375, 30);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(400, 250, 250, 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));

        button1 = new JButton("Login");
        button1.setFont(new Font("Arial", Font.BOLD, 17));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(350, 330, 110, 40);

        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Arial", Font.BOLD, 17));
        clearButton.setForeground(Color.WHITE);
        clearButton.setBackground(Color.BLUE);
        clearButton.setBounds(710, 430, 110, 40);

        backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.BOLD, 17));
        backButton.setForeground(Color.WHITE);
        backButton.setBackground(Color.BLUE);
        backButton.setBounds(50, 430, 110, 40);

        // Adding components to the content pane
        Container contentPane = getContentPane();
        contentPane.setLayout(null); // Using absolute positioning
        contentPane.add(label1);
        contentPane.add(label2);
        contentPane.add(textField2);
        contentPane.add(label3);
        contentPane.add(passwordField3);
        contentPane.add(button1);
        contentPane.add(clearButton);
        contentPane.add(backButton);

        // Adding background image
        ImageIcon backgroundIcon = new ImageIcon("E:/EAD HD/Project/My Java Project/src/Photoes/login.jpg");
        Image backgroundImage = backgroundIcon.getImage().getScaledInstance(900, 500, Image.SCALE_SMOOTH);
        JLabel backgroundLabel = new JLabel(new ImageIcon(backgroundImage));
        backgroundLabel.setBounds(0, 0, 900, 500);
        contentPane.add(backgroundLabel);

        // Adding ActionListener for buttons
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                TeacherHome TeacherHomePage = new TeacherHome();
                TeacherHomePage.setVisible(true);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear text fields
                textField2.setText("");
                passwordField3.setText("");
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Navigate to HomePage
                dispose(); // Close the current window
                // Open the HomePage window
                new HomePage().setVisible(true);
            }
        });

        // Configuring frame properties
        setSize(900, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TeacherLogin());
    }
}
