import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CustomControl extends JFrame {

    public CustomControl() {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() != KeyEvent.VK_SPACE && e.getKeyCode() != KeyEvent.VK_TAB) {
                    // Perform the scene change functionality here
                    System.out.println("Changing to Scene1");
                }
            }
        });
    }

    public static void main(String[] args) {
        CustomControl frame = new CustomControl();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
