import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminHome extends JFrame {
    public AdminHome() {
        super("Admin Dashboard");

        // Create title panel
        JPanel titlePanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel("Admin Dashboard", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30)); // Increased font size
        titlePanel.add(titleLabel, BorderLayout.CENTER);

        // Create back button and add ActionListener
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.BOLD, 14));
        backButton.setBackground(Color.WHITE);
        backButton.setForeground(Color.BLACK);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Navigate to HomePage.java
                dispose(); // Close the current window
                new HomePage(); // Open the HomePage window
            }
        });
        titlePanel.add(backButton, BorderLayout.EAST); // Align back button to the right side

        // Create main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2, 3, 20, 20)); // 2 rows, 3 columns, horizontal and vertical gap of 20

        // Create and add buttons for each category with margin
        mainPanel.add(createCategoryPanel("Admins", Color.RED, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current window
                new AdminDashboard(); // Open the AdminDashboard window
            }
        }));
        mainPanel.add(createCategoryPanel("Grades", Color.BLUE, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current window
                new GradesDashboard(); // Open the GradesDashboard window
            }
        }));
        mainPanel.add(createCategoryPanel("Students", Color.GREEN, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current window
                new StudentDashboard(); // Open the StudentDashboard window
            }
        }));
        mainPanel.add(createCategoryPanel("Teachers", Color.YELLOW, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current window
                new TeacherDashboard(); // Open the TeacherDashboard window
            }
        }));
        mainPanel.add(createCategoryPanel("Subjects", Color.ORANGE, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose(); // Close the current window
                new SubjectDashboard(); // Open the SubjectDashboard window
            }
        }));
        mainPanel.add(new JPanel()); // Empty panel to fill the last position

        // Add title panel and main panel to frame
        add(titlePanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        // Configure frame
        setSize(1200, 750); // Adjusted size
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    // Method to create a panel for a category button with margin
    private JPanel createCategoryPanel(String categoryName, Color color, ActionListener listener) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Set margin
        JButton button = new JButton(categoryName);
        button.setFont(new Font("Arial", Font.BOLD, 24)); // Increased font size
        button.setBackground(color);
        button.setFocusPainted(false); // Remove button border
        button.addActionListener(listener); // Add ActionListener
        panel.add(button, BorderLayout.CENTER);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(AdminHome::new);
    }
}
