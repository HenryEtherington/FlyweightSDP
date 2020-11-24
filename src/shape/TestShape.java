package shape;

import org.junit.Test;
import java.awt.*;
import static junit.framework.TestCase.assertEquals;

public class TestShape {

    @Test
    public void testColors() throws Exception {
        //Hex values for corresponding colors equal @...
        String expectedOrange = "shape.Shape@182830e";
        String expectedBlue = "shape.Shape@10e2030";
        String expectedBlack = "shape.Shape@1b4f649";
        String expectedRed = "shape.Shape@1833882";
        String expectedYellow = "shape.Shape@a570f";

        ShapeType shapeTypeOrange = new ShapeType("Circle", Color.ORANGE,60,46);
        ShapeType shapeTypeBlue = new ShapeType("Triangle", Color.BLUE,30,12);
        ShapeType shapeTypeBlack = new ShapeType("Rhombus", Color.BLACK,53,65);
        ShapeType shapeTypeRed = new ShapeType("Rectangle", Color.RED,23,22);
        ShapeType shapeTypeYellow = new ShapeType("Small Rectangle", Color.YELLOW,649,10);


        Shape shapeOrange = new Shape(15,30,shapeTypeOrange);
        Shape shapeBlue = new Shape(32,243,shapeTypeBlue);
        Shape shapeBlack = new Shape(240,10,shapeTypeBlack);
        Shape shapeRed = new Shape(50,184, shapeTypeRed);
        Shape shapeYellow =  new Shape(67,394, shapeTypeYellow);

        assertEquals(expectedOrange,shapeOrange.toString());
        assertEquals(expectedBlue,shapeBlue.toString());
        assertEquals(expectedBlack,shapeBlack.toString());
        assertEquals(expectedRed,shapeRed.toString());
        assertEquals(expectedYellow,shapeYellow.toString());
    }
}
