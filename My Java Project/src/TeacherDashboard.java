import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherDashboard extends JFrame {
    private JTextField fullNameField, registerNumberField, passwordField, addressField, phoneNumberField, emailField, classField;

    public TeacherDashboard() {
        setTitle("Student Marks Display System");
        setSize(1200, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(200, 220, 255)); // Set background color of JFrame

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add margin around the form

        // Header Panel
        JPanel headerPanel = new JPanel(new BorderLayout());
        JLabel headerLabel = new JLabel("Teacher's Admin Dashboard", SwingConstants.LEFT);
        headerLabel.setFont(new Font(headerLabel.getFont().getName(), Font.PLAIN, 30));
        headerPanel.add(headerLabel, BorderLayout.WEST);
        headerPanel.setBackground(new Color(200, 220, 255)); // Light blue color for header background

        // Button Panel in the header
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton backButton = new JButton("Back");
        backButton.setBackground(Color.YELLOW);
        backButton.setPreferredSize(new Dimension(100, 40));
        buttonPanel.add(backButton);
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
        ImageIcon originalIcon = new ImageIcon("E:/EAD HD/Project/My Java Project/src/Photoes/teacheradmin.jpg");
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        JLabel imageLabel = new JLabel(resizedIcon);
        contentPanel.add(imageLabel, BorderLayout.EAST);

        // Form Panel
        JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 10)); // Changed to 8 rows
        formPanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50)); // Add padding to the form

        // Set font size for labels and text fields
        Font labelFont = new Font("Arial", Font.BOLD, 20);
        Font textFieldFont = new Font("Arial", Font.PLAIN, 20);

        JLabel fullNameLabel = new JLabel("Full Name:");
        fullNameLabel.setFont(labelFont);
        fullNameField = new JTextField();
        fullNameField.setFont(textFieldFont);
        fullNameField.setPreferredSize(new Dimension(300, 22)); // Set preferred size for the text field
        formPanel.add(fullNameLabel);
        formPanel.add(fullNameField);

        JLabel registerNumberLabel = new JLabel("Register Number:"); // Changed label name
        registerNumberLabel.setFont(labelFont);
        registerNumberField = new JTextField(); // Reusing userNameField for register number
        registerNumberField.setFont(textFieldFont);
        registerNumberField.setPreferredSize(new Dimension(300, 22)); // Set preferred size for the text field
        formPanel.add(registerNumberLabel);
        formPanel.add(registerNumberField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setFont(labelFont);
        passwordField = new JTextField();
        passwordField.setFont(textFieldFont);
        passwordField.setPreferredSize(new Dimension(300, 22)); // Set preferred size for the text field
        formPanel.add(passwordLabel);
        formPanel.add(passwordField);

        JLabel addressLabel = new JLabel("Address:"); // Changed label name
        addressLabel.setFont(labelFont);
        addressField = new JTextField();
        addressField.setFont(textFieldFont);
        addressField.setPreferredSize(new Dimension(300, 22)); // Set preferred size for the text field
        formPanel.add(addressLabel);
        formPanel.add(addressField);

        JLabel phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberLabel.setFont(labelFont);
        phoneNumberField = new JTextField();
        phoneNumberField.setFont(textFieldFont);
        phoneNumberField.setPreferredSize(new Dimension(300, 22)); // Set preferred size for the text field
        formPanel.add(phoneNumberLabel);
        formPanel.add(phoneNumberField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setFont(labelFont);
        emailField = new JTextField();
        emailField.setFont(textFieldFont);
        emailField.setPreferredSize(new Dimension(200, 22)); // Set preferred size for the text field
        formPanel.add(emailLabel);
        formPanel.add(emailField);

        JLabel classLabel = new JLabel("Class:"); // Changed label name
        classLabel.setFont(labelFont);
        classField = new JTextField();
        classField.setFont(textFieldFont);
        classField.setPreferredSize(new Dimension(200, 22)); // Set preferred size for the text field
        formPanel.add(classLabel);
        formPanel.add(classField);

        contentPanel.add(formPanel, BorderLayout.CENTER);

        // Button Panel
        JPanel buttonPanelCenter = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton addButton = new JButton("Add");
        JButton viewButton = new JButton("View");
        JButton clearButton = new JButton("Clear");
        JButton deleteButton = new JButton("Delete");
        JButton updateButton = new JButton("Update");

        addButton.setPreferredSize(new Dimension(100, 40));
        viewButton.setPreferredSize(new Dimension(100, 40));
        clearButton.setPreferredSize(new Dimension(100, 40));
        deleteButton.setPreferredSize(new Dimension(100, 40));
        updateButton.setPreferredSize(new Dimension(100, 40));

        // Set different shades of pink color explicitly for buttons
// Set different shades of green color explicitly for buttons
        addButton.setBackground(new Color(0, 128, 0));          // Green
        viewButton.setBackground(new Color(46, 139, 87));       // Sea Green
        clearButton.setBackground(new Color(60, 179, 113));     // Medium Sea Green
        deleteButton.setBackground(new Color(143, 188, 143));   // Dark Sea Green
        updateButton.setBackground(new Color(152, 251, 152));   // Pale Green


        buttonPanelCenter.add(addButton);
        buttonPanelCenter.add(viewButton);
        buttonPanelCenter.add(clearButton);
        buttonPanelCenter.add(deleteButton);
        buttonPanelCenter.add(updateButton);

        contentPanel.add(buttonPanelCenter, BorderLayout.SOUTH);

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

        // ActionListener for clear button
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearFields();
            }
        });

        add(mainPanel);
        setVisible(true);
    }

    private void clearFields() {
        fullNameField.setText("");
        registerNumberField.setText("");
        passwordField.setText("");
        addressField.setText("");
        phoneNumberField.setText("");
        emailField.setText("");
        classField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TeacherDashboard();
            }
        });
    }
}

