import javax.swing.*;
import java.awt.*;



    public class ClinicianHealthAppUI extends JFrame {
        public ClinicianHealthAppUI() {
            setTitle("Clinician Health App - Dashboard");
            setSize(640, 400);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Create the main content panel
            JPanel contentPane = new JPanel();
            contentPane.setLayout(new BorderLayout());
            setContentPane(contentPane);

            // Create the left-side panel
            JPanel leftPanel = new JPanel();
            leftPanel.setPreferredSize(new Dimension(103, 0));
            leftPanel.setBackground(Color.decode("#eeeeee"));
            leftPanel.setLayout(null);
            contentPane.add(leftPanel, BorderLayout.WEST);

            JLabel userNameLabel = new JLabel("User Name");
            userNameLabel.setBounds(22, 51, 80, 20);
            leftPanel.add(userNameLabel);

            JLabel recentListLabel = new JLabel("Recent List");
            recentListLabel.setBounds(23, 90, 80, 20);
            leftPanel.add(recentListLabel);

            JList<String> recentListView = new JList<>(new String[]{});
            recentListView.setBounds(13, 118, 81, 91);
            leftPanel.add(recentListView);

            JLabel signOutLabel = new JLabel("Sign Out");
            signOutLabel.setBounds(22, 282, 80, 20);
            leftPanel.add(signOutLabel);

            // Create the right-side panel
            JPanel rightPanel = new JPanel();
            rightPanel.setBackground(Color.decode("#eeeeee"));
            rightPanel.setLayout(null);
            contentPane.add(rightPanel, BorderLayout.CENTER);

            JPanel contentPanel = new JPanel();
            contentPanel.setBounds(110, 43, 515, 348);
            contentPanel.setBackground(Color.decode("#eeeeee"));
            rightPanel.add(contentPanel);
            contentPanel.setLayout(null);

            JButton patientListButton = new JButton("Patient List");
            patientListButton.setBounds(17, 50, 134, 70);
            contentPanel.add(patientListButton);

            JButton addNewPatientButton = new JButton("Add New Patient");
            addNewPatientButton.setBounds(187, 50, 134, 70);
            contentPanel.add(addNewPatientButton);

            JButton testResultsButton = new JButton("Test Results");
            testResultsButton.setBounds(364, 50, 134, 70);
            contentPanel.add(testResultsButton);

            JButton prescriptionsButton = new JButton("Prescriptions");
            prescriptionsButton.setBounds(17, 139, 134, 70);
            contentPanel.add(prescriptionsButton);

            JButton scansButton = new JButton("Scans");
            scansButton.setBounds(187, 139, 134, 70);
            contentPanel.add(scansButton);

            JButton shortcut2Button = new JButton("Shortcut2");
            shortcut2Button.setBounds(364, 139, 134, 70);
            contentPanel.add(shortcut2Button);

            JButton shortcut3Button = new JButton("Shortcut3");
            shortcut3Button.setBounds(17, 236, 134, 70);
            contentPanel.add(shortcut3Button);

            JButton shortcut4Button = new JButton("Shortcut4");
            shortcut4Button.setBounds(187, 236, 134, 70);
            contentPanel.add(shortcut4Button);

            JButton shortcut5Button = new JButton("Shortcut5");
            shortcut5Button.setBounds(364, 236, 134, 70);
            contentPanel.add(shortcut5Button);

            JLabel titleLabel = new JLabel("Clinician Health App - Dashboard");
            titleLabel.setBounds(94, 14, 327, 30);
            titleLabel.setFont(new Font("Calibri", Font.BOLD, 20));
            contentPanel.add(titleLabel);

            setLocationRelativeTo(null);
        }

        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                ClinicianHealthAppUI appUI = new ClinicianHealthAppUI();
                appUI.setVisible(true);
            });
        }
    }


