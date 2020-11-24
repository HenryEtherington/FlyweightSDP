package shape;

import javax.swing.*;
import java.awt.*;

 public class ShapeType extends JComponent {
    String name;
    private Color color;
    private int height;
    private int width;


    ShapeType(String name, Color color, int heightScope, int widthScope) {
        this.name = name;
        this.color = color;
        this.height = heightScope;
        this.width = widthScope;
    }

     private void setColor(Graphics g) {
        g.setColor(Color.BLUE);
        g.setColor(color);
    }


     void drawRectangle(Graphics g, int x, int y) {
        setColor(g);
        g.fillRect(x - 1, y, 50, 20);
    }

     void drawSquare(Graphics g, int x, int y) {
        setColor(g);
        g.fillRect(x + 10, y, 50, 50);

    }

     void drawCircle(Graphics g, int x, int y) {
        setColor(g);
        g.fillOval(x - 5, y - 10, 25, 25);
    }

     void drawSmallRectangle(Graphics g, int x, int y) {
        setColor(g);
        g.fillRect(x - 1, y, 5, 20);
    }
}