import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        Reader r = new Reader("Calculator");
        r.setVisible(true);
        r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        r.setSize(180,180);
        r.setResizable(false);
        r.setLocationRelativeTo(null);
    }
}
