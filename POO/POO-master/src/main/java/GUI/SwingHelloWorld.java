package GUI;
import javax.swing.*;
public class SwingHelloWorld extends JFrame {
    private JPanel mainPanel;
    private JLabel JLabel1;

    public SwingHelloWorld(){
        setContentPane(mainPanel);
        setTitle("Hello World");
        setSize(400,200);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new SwingHelloWorld();
    }
}
