import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class SubjectDashboard extends JFrame {

    JLabel label2, SubjectLabel3;
    JTextField textField2;
    JTextField SubjectField3;

    public SubjectDashboard() {
        setTitle("Student Marks Display System");
        setSize(1200, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(200, 220, 255)); // Set background color of JFrame

        JPanel mainPanel = new JPanel(new BorderLayout());
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Add margin around the form

        // Header Panel
        JPanel headerPanel = new JPanel(new BorderLayout());
        JLabel headerLabel = new JLabel("Subject's Admin Dashboard", SwingConstants.LEFT);
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
        ImageIcon originalIcon = new ImageIcon("E:/EAD HD/Project/My Java Project/src/Photoes/subjectadmin.jpg");
        Image img = originalIcon.getImage();
        Image resizedImg = img.getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImg);

        JLabel imageLabel = new JLabel(resizedIcon);
        contentPanel.add(imageLabel, BorderLayout.EAST);

        // Form Panel
        JPanel formPanel = new JPanel(new GridLayout(10, 12, 10, 10)); // Changed to 2 rows
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 20, 100)); // Add padding to the form

        // Set font size for labels and text fields
        Font labelFont = new Font("Arial", Font.BOLD, 20);
        Font textFieldFont = new Font("Arial", Font.PLAIN, 20);

        label2 = new JLabel("Subject ID:");
        label2.setFont(labelFont);
        formPanel.add(label2); // Add label to the form panel

        textField2 = new JTextField();
        textField2.setFont(textFieldFont);
        textField2.setColumns(8); // Set the column count to adjust the size
        formPanel.add(textField2); // Add text field to the form panel

        SubjectLabel3 = new JLabel("Subject:");
        SubjectLabel3.setFont(labelFont);
        //classLabel3.setBounds(650,100,100,25);
        formPanel.add(SubjectLabel3); // Add label to the form panel

        SubjectField3 = new JTextField();
        SubjectField3.setFont(textFieldFont);
        // classField3.setBounds(650,150,100,25);
        SubjectField3.setColumns(2); // Set the column count to adjust the size
        formPanel.add(SubjectField3); // Add text field to the form panel

        // Button Panel
        JPanel buttonPanelCenter = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton addButton = new JButton("Add");
        JButton viewButton = new JButton("View");
        JButton clearButton = new JButton("Clear");
        JButton deleteButton = new JButton("Delete");
        JButton updateButton = new JButton("Update");

        addButton.setPreferredSize(new Dimension(100, 40 ));
        viewButton.setPreferredSize(new Dimension(100, 40));
        clearButton.setPreferredSize(new Dimension(100, 40));
        deleteButton.setPreferredSize(new Dimension(100, 40));
        updateButton.setPreferredSize(new Dimension(100, 40));

// Set different shades of yellow color explicitly for buttons
        addButton.setBackground(new Color(255, 255, 0));        // Yellow
        viewButton.setBackground(new Color(255, 255, 102));     // Light Yellow
        clearButton.setBackground(new Color(255, 255, 153));    // Pale Yellow
        deleteButton.setBackground(new Color(255, 255, 102));   // Light Yellow (same as viewButton)
        updateButton.setBackground(new Color(255, 255, 0));      // Yellow (same as addButton)


        buttonPanelCenter.add(addButton);
        buttonPanelCenter.add(viewButton);
        buttonPanelCenter.add(clearButton);
        buttonPanelCenter.add(deleteButton);
        buttonPanelCenter.add(updateButton);
        contentPanel.add(formPanel, BorderLayout.CENTER);


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

        add(mainPanel);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SubjectDashboard();
            }
        });
    }
}
