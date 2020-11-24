package shape;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class TestShapeAdder {

    private ShapeAdder shapeAdder = new ShapeAdder();

    @Test
    public void testX() throws Exception {
        int expectedX = 0;

        assertEquals(expectedX,shapeAdder.getX());
    }

    @Test
    public void testY() throws Exception {
        int testY = 0;

        assertEquals(testY,shapeAdder.getY());
    }

    @Test
    public void testAddName() throws Exception {
        String expectedName = ("");

        assertEquals(expectedName,shapeAdder.getTitle());
    }

    @Test
    public void testAddHeight() throws Exception {
        int expectedHeight = 0;

        assertEquals(expectedHeight,shapeAdder.getHeight());
    }


    @Test
    public void testAddWidth() throws Exception {
        int expectedWidth = 0;

        assertEquals(expectedWidth,shapeAdder.getWidth());
    }
}
