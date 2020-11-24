package shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

  public class ShapeAdder extends JFrame {
    private List<shape.Shape> shapes = new ArrayList<>();

    public void addShape(int x, int y, String name, Color color, int height, int width) {
        try {
            ShapeType type = ShapeFactory.getShapeType(name, color, height, width);
            shape.Shape shape = new shape.Shape(x, y, type);
            shapes.add(shape);
        }
        catch(Exception e){
                System.out.println("Background shape was not added");
            }
        }

    @Override
    public void paint(Graphics graphics)
    {
        for (shape.Shape shape : shapes)
        {
            shape.draw(graphics);
        }
    }
}