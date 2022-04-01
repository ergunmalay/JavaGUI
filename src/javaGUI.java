import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class javaGUI extends JFrame {
    private JPanel Main;
    private JButton okButton;
    private JTextField txtAddress;
    private JTextField txtName;
    private JLabel Address;
    private JLabel Name;
    private JLabel Testing;

    public javaGUI() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String name = txtName.getText();
                String address = txtAddress.getText();

                JOptionPane.showMessageDialog(null, name);
                JOptionPane.showMessageDialog(null, address);
            }
        });
    }

    public static void main (String args[]) {

        javaGUI j = new javaGUI();
        j.setContentPane(new javaGUI().Main);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.pack();

    }

}
