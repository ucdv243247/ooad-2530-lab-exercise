import javax.swing.*;
import java.awt.*;

public class CoordinatorPage extends JPanel {
    public CoordinatorPage(SessionController sessionController) {
        setLayout(new BorderLayout());
        JTabbedPane tabbedPane = new JTabbedPane();
        // tabbedPane.addTab("Registration", new RegistrationPanel());
        tabbedPane.addTab("Sessions", new SessionsPanel(sessionController));
        tabbedPane.addTab("Result", new ResultPanel());
        add(tabbedPane, BorderLayout.CENTER);
    }
}

// class RegistrationPanel extends JPanel {
// public RegistrationPanel() {
// setLayout(new GridBagLayout());
// JLabel label = new JLabel("Coordinator Registration Panel");
// label.setFont(new Font("Arial", Font.PLAIN, 18));
// add(label);
// }
// }

class SessionsPanel extends JPanel {
    private SessionController sessionController;

    public SessionsPanel(SessionController sessionController) {
        this.sessionController = sessionController;
        setLayout(new BorderLayout());
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Form panel with GridBagLayout for proper alignment
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Day row
        JLabel dayLabel = new JLabel("Day:");
        JTextField dayField = new JTextField(5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.weightx = 0;
        formPanel.add(dayLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1.0;
        formPanel.add(dayField, gbc);

        // Month row
        JLabel monthLabel = new JLabel("Month:");
        JTextField monthField = new JTextField(5);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.weightx = 0;
        formPanel.add(monthLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1.0;
        formPanel.add(monthField, gbc);

        // Year row
        JLabel yearLabel = new JLabel("Year:");
        JTextField yearField = new JTextField(5);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.weightx = 0;
        formPanel.add(yearLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1.0;
        formPanel.add(yearField, gbc);

        // Venue row
        JLabel venueLabel = new JLabel("Venue:");
        JTextField venueField = new JTextField(20);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.weightx = 0;
        formPanel.add(venueLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1.0;
        formPanel.add(venueField, gbc);

        // Session Type row
        JLabel typeLabel = new JLabel("Session Type:");
        String[] sessionTypes = { SessionType.POSTER.name(), SessionType.ORAL.name() };
        JComboBox<String> typeComboBox = new JComboBox<>(sessionTypes);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.weightx = 0;
        formPanel.add(typeLabel, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.weightx = 1.0;
        formPanel.add(typeComboBox, gbc);

        // Create button row
        JButton createButton = new JButton("Create Session");
        createButton.addActionListener(e -> {
            String day = dayField.getText();
            String month = monthField.getText();
            String year = yearField.getText();
            String date = day + "/" + month + "/" + year;
            String venue = venueField.getText();
            String type = (String) typeComboBox.getSelectedItem();
            // Logic to create session goes here
            JOptionPane.showMessageDialog(this,
                    "Session Created:\nDate: " + date + "\nVenue: " + venue + "\nType: " + type);
            Session newSession = new Session(date, venue, SessionType.valueOf(type));
            sessionController.addSession(newSession);
        });

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.fill = GridBagConstraints.NONE;
        gbc.weightx = 0;
        formPanel.add(createButton, gbc);

        // Add form panel to the north so it doesn't stretch vertically
        add(formPanel, BorderLayout.NORTH);
    }
}

class ResultPanel extends JPanel {
    public ResultPanel() {
        setLayout(new GridBagLayout());
        JLabel label = new JLabel("Coordinator Result Panel");
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        add(label);
    }
}
