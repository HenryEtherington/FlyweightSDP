package shape;

import org.junit.Test;
import static junit.framework.TestCase.assertNotSame;

public class TestShapeFactory {

    @Test
    public void testResult() throws Exception {
        String expectedShapeFactory = "";
        ShapeFactory shapeFactory = new ShapeFactory();
        assertNotSame(expectedShapeFactory,shapeFactory.getClass());
    }
}
