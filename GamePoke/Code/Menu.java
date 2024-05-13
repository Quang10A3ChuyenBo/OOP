import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Menu extends JFrame {
    public Menu() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() != KeyEvent.VK_SPACE && e.getKeyCode() != KeyEvent.VK_TAB) {
                    changeScene("res://scenes/Scene1.tscn");
                }
            }
        });
    }

    public void changeScene(String scenePath) {
        Scene newScene = loadScene(scenePath);
        setScene(newScene);
    }

    // Define the main method to create and show the menu
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setSize(300, 200);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setVisible(true);
    }
}
