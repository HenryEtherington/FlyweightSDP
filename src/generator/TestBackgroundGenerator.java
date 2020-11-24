package generator;

import org.junit.Test;


import static junit.framework.Assert.assertNotSame;
import static junit.framework.TestCase.assertEquals;

public class TestBackgroundGenerator {
    private BackgroundGenerator backgroundGenerator = new BackgroundGenerator();

    @Test
    public void testHeadings() throws Exception{
        String expectedHeadings = "Background generated.500000 shapes drawn---------------------";

        assertEquals(expectedHeadings,backgroundGenerator.addHeadings());
    }

    @Test
    public void testShapeSizes() throws Exception {
        String expectedShapeSizes = "---------------------\n" +
                                    "Memory usage:shape size (8 bytes) * " +
                                    "500000+ ShapeTypes size (~30 bytes) * 500000.";

        assertEquals(expectedShapeSizes,backgroundGenerator.shapeSizes());
    }

    @Test
    public void testRamUsed() throws Exception {
        String expectedRamUsed = ("---------------------" + "Total: " +
                                 ((4000000) / 1024 / 1024) +
                                 "MB (instead of " + ((500000 * 38)/ 1024 / 1024) + "MB)");

        assertEquals(expectedRamUsed,backgroundGenerator.ramUsed());
    }

    @Test
     public void testTimeToGenerate() throws Exception {
        String expectedTimeToGenerate = ("\nShapes take 0 ms to generate.");

        assertEquals(expectedTimeToGenerate,backgroundGenerator.timeToGenerate());
    }

    @Test
     public void testIsMemory() throws Exception{
        String expectedIsMemoryBefore = ("max memory: 0 mb.\n" +
                                         "\n" + "Allocated memory: 0 mb.\n" +
                                         "\n" + "Free memory: 0 mb.\n" +
                                         "------------------------------------------------------------------------------\n" +
                                         "\n" + "Total free memory: 0 mb.\n" +
                                         "0 mb left in memory.\n" +
                                         "0 mb left in memory.");

        assertNotSame(expectedIsMemoryBefore,backgroundGenerator.isMemory());
    }

}

