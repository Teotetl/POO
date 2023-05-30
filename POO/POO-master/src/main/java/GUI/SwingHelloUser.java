package GUI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingHelloUser extends JFrame {
    private JPanel panel1;
    private JLabel name;
    private JTextField inputName;
    private JButton okButton;

public SwingHelloUser() {
    setSize(400,200);
    setTitle("Hello");
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setContentPane(panel1);
    setLocationRelativeTo(null);
    setVisible(true);
    okButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String name = inputName.getText();
            JOptionPane.showMessageDialog(SwingHelloUser.this, "Hola " + name + "!!!!");
        }
    });
}

    public static void main(String[] args) {
        new SwingHelloUser();
    }
}
