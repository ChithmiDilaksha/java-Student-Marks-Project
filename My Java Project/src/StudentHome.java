import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentHome extends JFrame {
    private JLabel gradeLabel, termLabel, indexLabel;
    private JTextField gradeField, termField, indexField;
    private JButton viewButton;
    private JTable table;
    private JScrollPane scrollPane;

    public StudentHome() {
        super("Student Home");

        // Initialize components
        gradeLabel = new JLabel("Grade:");
        termLabel = new JLabel("Term:");
        indexLabel = new JLabel("Index Number:");
        gradeField = new JTextField(10);
        termField = new JTextField(10);
        indexField = new JTextField(10);
        viewButton = new JButton("View");
        table = new JTable();
        scrollPane = new JScrollPane(table);

        // Set layout
        setLayout(new BorderLayout());

        // Create input panel
        JPanel inputPanel = new JPanel(new GridLayout(3, 2, 10, 10)); // 3 rows, 2 columns, horizontal and vertical gap of 10
        inputPanel.add(gradeLabel);
        inputPanel.add(gradeField);
        inputPanel.add(termLabel);
        inputPanel.add(termField);
        inputPanel.add(indexLabel);
        inputPanel.add(indexField);

        // Create button panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(viewButton);

        // Add input and button panels to the frame
        add(inputPanel, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        // Add scroll pane to the frame, but keep it invisible initially
        add(scrollPane, BorderLayout.SOUTH);
        scrollPane.setVisible(false);

        // Add action listener to the view button
        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                displayMarksTable();
            }
        });

        // Configure frame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 400); // Adjusted size
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    private void displayMarksTable() {
        // Sample data for 6 subjects with marks
        Object[][] data = {
                {"Maths", ""},
                {"Science", ""},
                {"English", ""},
                {"History", ""},
                {"Geography", ""},
                {"Computer Science", ""}
        };

        // Column headers
        String[] columns = {"Subject", "Marks"};

        // Create table model with the data
        DefaultTableModel model = new DefaultTableModel(data, columns);
        table.setModel(model);

        // Set the scroll pane visible
        scrollPane.setVisible(true);

        // Update the frame to reflect changes
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(StudentHome::new);
    }
}
