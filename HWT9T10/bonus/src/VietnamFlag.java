import javax.swing.*;
import java.awt.*;

public class VietnamFlag extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Draw red background
        g.setColor(new Color(215, 20, 33));
        g.fillRect(0, 0, 900, 600); // Scaled up by a factor of 3
        // Draw yellow star
        int[] x = {405, 435, 540, 450, 480, 405, 330, 360, 270, 375};
        int[] y = {90, 225, 225, 300, 405, 345, 405, 300, 225, 225}; // Scaled up by a factor of 3
        g.setColor(Color.yellow);
        g.fillPolygon(x, y, 10);
        // Draw the date "30/4/1975"
        g.setColor(Color.white);
        Font font = new Font("Arial", Font.BOLD, 40); // Font scaled up by a factor of 3
        g.setFont(font);
        FontMetrics metrics = g.getFontMetrics(font);
        int textWidth = metrics.stringWidth("30/4/1975");
        int xCoordinate = (830 - textWidth) / 2; // Center horizontally
        int yCoordinate = 540; // Fixed vertical position
        g.drawString("30/4/1975", xCoordinate, yCoordinate);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vietnam Flag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VietnamFlag flag = new VietnamFlag();
        frame.add(flag);
        frame.setSize(900, 600); // Scaled up by a factor of 3
        frame.setVisible(true);
    }
}
