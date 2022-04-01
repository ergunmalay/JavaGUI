import javax.swing.*;

public class javaGUI extends JFrame {
    private JPanel Main;
    private JButton okButton;
    private JTextField txtAddress;
    private JTextField txtName;
    private JLabel Testing;
    private JLabel Name;
    private JLabel Address;

    public javaGUI() {
        okButton.addActionListener(e -> {

            String name = txtName.getText();
            String address = txtAddress.getText();

            JOptionPane.showMessageDialog(null, name);
            JOptionPane.showMessageDialog(null, address);
        });
    }

    public static void main (String[] args) {

        javaGUI j = new javaGUI();
        j.setContentPane(new javaGUI().Main);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.pack();

    }

}
