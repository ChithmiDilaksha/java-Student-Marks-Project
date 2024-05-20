import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {
    private JButton teacherButton;
    private JButton adminButton;
    private JButton studentButton;

    public HomePage() {
        setTitle("Student Marks Display System");
        setSize(1200, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(200, 220, 255)); // Set background color of JFrame

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add margin around the form

        // Header Panel
        JPanel headerPanel = new JPanel(new BorderLayout());
        JLabel headerLabel = new JLabel("ABC College", SwingConstants.LEFT);
        headerLabel.setFont(new Font(headerLabel.getFont().getName(), Font.PLAIN, 25));
        headerPanel.add(headerLabel, BorderLayout.WEST);
        headerPanel.setBackground(new Color(200, 220, 255)); // Light blue color for header background

        // Button Panel in the header
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        teacherButton = new JButton("Teacher");
        adminButton = new JButton("Admin");
        studentButton = new JButton("Student");

        teacherButton.setBackground(Color.GREEN);
        adminButton.setBackground(Color.ORANGE);
        studentButton.setBackground(Color.YELLOW);

        teacherButton.setPreferredSize(new Dimension(100, 40));
        adminButton.setPreferredSize(new Dimension(100, 40));
        studentButton.setPreferredSize(new Dimension(100, 40));

        buttonPanel.add(teacherButton);
        buttonPanel.add(adminButton);
        buttonPanel.add(studentButton);

        headerPanel.add(buttonPanel, BorderLayout.EAST);

        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // Footer Panel
        JPanel footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel footerLabel = new JLabel("Welcome to ABC College Student Marks Display System");
        footerPanel.add(footerLabel);
        footerPanel.setBackground(new Color(200, 220, 255)); // Light blue color for footer background

        mainPanel.add(footerPanel, BorderLayout.SOUTH);

        // Content Panel
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0)); // Add an empty border to shift the photo to the right

        // Load and resize the image
        ImageIcon originalIcon = new ImageIcon("E:/EAD HD/Project/My Java Project/src/Photoes/home.png");
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        JLabel imageLabel = new JLabel(resizedIcon);
        contentPanel.add(imageLabel, BorderLayout.EAST);

        // Add label with text "Student Marks Display System" to the west
        JLabel textLabel = new JLabel("<html><b>Student Marks</b><br><b>Display System</b></html>", SwingConstants.CENTER);
        textLabel.setFont(new Font(textLabel.getFont().getName(), Font.PLAIN, 70));
        contentPanel.add(textLabel, BorderLayout.WEST);


        mainPanel.add(contentPanel, BorderLayout.CENTER);

        // Action Listeners
        teacherButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open TeacherLogin.java class page
                setVisible(false);
                TeacherLogin teacherLoginPage = new TeacherLogin();
                teacherLoginPage.setVisible(true);
            }
        });


        adminButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                AdminLogin AdminLoginPage = new AdminLogin();
                AdminLoginPage.setVisible(true);
            }
        });

        studentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                StudentLogin StudentLoginPage = new StudentLogin();
                StudentLoginPage.setVisible(true);

            }
        });

        add(mainPanel);
        setVisible(true);
    }



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new HomePage();
            }
        });
    }
}
