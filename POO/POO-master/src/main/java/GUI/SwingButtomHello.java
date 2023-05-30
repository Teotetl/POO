package GUI;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingButtomHello extends JFrame {
    private JPanel JPanel1;
    private JButton daClickButton;

    public SwingButtomHello(){
        setContentPane(JPanel1);
        setTitle("Hello World");
        setSize(580,400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        daClickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(SwingButtomHello.this, "Hola Mundo!");
            }
        });
    }

    public static void main(String[] args) {
        new SwingButtomHello();
    }
}
