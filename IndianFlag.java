import java.awt.*;
import javax.swing.*;

public class IndianFlag extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Flag dimensions
        int width = 300;
        int height = 200;
        int x = 50;
        int y = 50;

        // Each band height
        int bandHeight = height / 3;

        // Draw Saffron band
        g.setColor(new Color(255, 153, 51));
        g.fillRect(x, y, width, bandHeight);

        // Draw White band
        g.setColor(Color.WHITE);
        g.fillRect(x, y + bandHeight, width, bandHeight);

        // Draw Green band
        g.setColor(new Color(19, 136, 8));
        g.fillRect(x, y + 2 * bandHeight, width, bandHeight);

        // Draw Ashoka Chakra (blue circle)
        int chakraRadius = bandHeight / 2;
        int chakraX = x + width / 2 - chakraRadius;
        int chakraY = y + bandHeight + (bandHeight / 2) - chakraRadius;

        g.setColor(new Color(0, 0, 128));
        g.drawOval(chakraX, chakraY, 2 * chakraRadius, 2 * chakraRadius);

        // Draw 24 spokes
        for (int i = 0; i < 24; i++) {
            double angle = Math.toRadians(i * 15);
            int x1 = x + width / 2;
            int y1 = y + bandHeight + bandHeight / 2;
            int x2 = (int)(x1 + chakraRadius * Math.cos(angle));
            int y2 = (int)(y1 + chakraRadius * Math.sin(angle));
            g.drawLine(x1, y1, x2, y2);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Indian Flag");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 350);
        frame.add(new IndianFlag());
        frame.setVisible(true);
    }
}
