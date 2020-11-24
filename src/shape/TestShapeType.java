package shape;

import org.junit.Test;
import java.awt.*;
import static junit.framework.TestCase.assertEquals;

public class TestShapeType {
    @Test
    public void testShapeType() throws Exception {
        String expectedShapeType = "shape.ShapeType[,0,0,0x0,invalid,alignmentX=0.0,alignmentY=0.0,border=,flags=0,maximumSize=,minimumSize=,preferredSize=]";
        ShapeType shapeType = new ShapeType("Square", Color.BLUE,10,25);

        assertEquals(expectedShapeType,shapeType.toString());
    }
}
