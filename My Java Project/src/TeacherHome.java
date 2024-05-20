import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherHome extends JFrame {
    private JButton nextbutton;
    private JComboBox<String> teacherComboBox, classComboBox;

    public TeacherHome() {
        setTitle("Student Marks Display System");
        setSize(1200, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        // Set background color of JFrame

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add margin around the form
        // Header Panel
        JPanel headerPanel = new JPanel(new BorderLayout());
        JLabel headerLabel = new JLabel("Teacher Dashboard", SwingConstants.LEFT);
        headerLabel.setFont(new Font(headerLabel.getFont().getName(), Font.PLAIN, 30));
        headerPanel.add(headerLabel, BorderLayout.WEST);
        headerPanel.setBackground(new Color (255, 192, 203)); // Light pink color

        // Button Panel in the header
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton backButton = new JButton("Back");
        backButton.setBackground(new Color(255, 105, 180)); // Hot pink color
        backButton.setPreferredSize(new Dimension(100, 40));
        buttonPanel.add(backButton);
        headerPanel.add(buttonPanel, BorderLayout.EAST);

        mainPanel.add(headerPanel, BorderLayout.NORTH);

        // Footer Panel
        JPanel footerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JLabel footerLabel = new JLabel("Welcome to ABC College Student Marks Display System");
        footerPanel.add(footerLabel);
        footerPanel.setBackground(new Color(255, 192, 203)); // Light blue color for footer background

        mainPanel.add(footerPanel, BorderLayout.SOUTH);

        // Content Panel
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0)); // Add an empty border to shift the photo to the right

        // Load and resize the image
        ImageIcon originalIcon = new ImageIcon("E:/EAD HD/Project/My Java Project/src/Photoes/teacherHome.png");
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        JLabel imageLabel = new JLabel(resizedIcon);
        contentPanel.add(imageLabel, BorderLayout.EAST);

        // Form Panel
        JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(50, 100, 250, 350)); // Add padding to the form

// JLabel for selecting teacher
        JLabel labelTeacher = new JLabel("Select Teacher:");
        labelTeacher.setFont(new Font("Raleway", Font.BOLD, 20));
// Adjust bounds as needed or use layout managers instead
        labelTeacher.setBounds(100, 300, 300, 30);
        add(labelTeacher);

// JComboBox for selecting teacher
        teacherComboBox = new JComboBox<>();
        teacherComboBox.setBounds(300, 300, 300, 30); // Example bounds, adjust as needed
// Populate teacherComboBox from Database
        populateTeacherComboBox();
        add(teacherComboBox);

// JLabel for selecting class
        JLabel labelClass = new JLabel("Select Class:");
        labelClass.setFont(new Font("Raleway", Font.BOLD, 20));
// Adjust bounds as needed or use layout managers instead
        labelClass.setBounds(100, 200, 300, 30);
        add(labelClass);

// JComboBox for selecting class
        classComboBox = new JComboBox<>();
        classComboBox.setBounds(300, 200, 300, 30); // Example bounds, adjust as needed
// Populate classComboBox from Database
        populateClassComboBox();
        add(classComboBox);

        nextbutton = new JButton("Next");
        nextbutton.setFont(new Font("Raleway",Font.BOLD, 20));
        nextbutton.setBackground(new Color(255, 105, 180)); // Hot pink color
        nextbutton.setForeground(Color.BLACK);
        nextbutton.setBounds(300,400,110,50);
        add(nextbutton);

        contentPanel.add(formPanel, BorderLayout.WEST);


        mainPanel.add(contentPanel, BorderLayout.CENTER);

        // ActionListener for back button
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                // Assuming AdminHome is a class representing the home page for admin
                new AdminHome().setVisible(true);
            }
        });


        add(mainPanel);
        setVisible(true);
    }

    private void populateTeacherComboBox() {
        // Code to fetch teacher names from the database and populate the teacherComboBox
    }

    private void populateClassComboBox() {
        // Code to fetch class names from the database and populate the classComboBox
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TeacherHome();
            }
        });
    }
}
