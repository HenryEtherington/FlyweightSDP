package generator;

import shape.ShapeAdder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;


 class BackgroundGenerator implements ActionListener {
    private int guiWidth = 600;
    private int guiHeight = 500;
    private final int SHAPES_TO_DRAW = 500000;
    private int shapeTypes = 4;
    private ShapeAdder shapeAdder = new ShapeAdder();
    private NumberFormat format = NumberFormat.getInstance();
    private Runtime runtime = Runtime.getRuntime();
    private long maxAmountMemory = runtime.maxMemory();
    private long allocatedMemory = runtime.totalMemory();

      void addShapes() {

        int shapesOnScreen = (SHAPES_TO_DRAW / shapeTypes);


          for (int i = 0; i < Math.floor(shapesOnScreen); i++) {
              shapeAdder.addShape(random(0, guiWidth), random(0, guiHeight), "Square", Color.PINK, 10, 10);
              shapeAdder.addShape(random(0, guiWidth), random(0, guiHeight), "Rectangle", Color.RED, 50, 20);
              shapeAdder.addShape(random(0, guiWidth), random(0, guiHeight), "Circle", Color.YELLOW, 20, 20);
              shapeAdder.addShape(random(0, guiWidth), random(0, guiHeight), "Small Rectangle", Color.BLUE, 5, 5);
          }

          addHeadings();
          shapeSizes();
          ramUsed();
          shapeAdder();
          timeToGenerate();
          isMemory();
      }

       String addHeadings() {
         return  ("Background generated." + SHAPES_TO_DRAW + " shapes drawn" +
                            "---------------------");
     }

     String shapeSizes() {
        return  ("---------------------" + "\nMemory usage:" +
                           "shape size (8 bytes) * " + SHAPES_TO_DRAW +
                           "+ ShapeTypes size (~30 bytes) * " + SHAPES_TO_DRAW + ".");
    }

      String ramUsed() {
        return ("---------------------" + "Total: " +
                          ((SHAPES_TO_DRAW * 8 + shapeTypes * 30) / 1024 / 1024) +
                          "MB (instead of " + ((SHAPES_TO_DRAW * 38) / 1024 / 1024) + "MB)");

     }

    private void shapeAdder() {
        shapeAdder.setSize(guiWidth, guiHeight);
        shapeAdder.setVisible(true);
    }

     String timeToGenerate() {
        long startOfMemory = System.currentTimeMillis();
        long endOfMemory = System.currentTimeMillis();

        return  ("\nShapes take " + (endOfMemory - startOfMemory) + " ms to generate.");
    }

    String isMemory() {
        long freeMemory = runtime.freeMemory();
        long totalAvailableMemory = Runtime.getRuntime().totalMemory();
        long totalMemoryUsed = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder + ( "\nmax memory: " + format.format(maxAmountMemory / 1024) + " mb.") + "\n"
                               + stringBuilder + ( "\nAllocated memory: " + format.format(allocatedMemory / 1024) + " mb.") + "\n"
                               + stringBuilder + ( "\nFree memory: " + format.format(freeMemory / 1024) + " mb.") + "\n"
                               + "------------------------------------------------------------------------------" + "\n"
                               + stringBuilder + ( "\nTotal free memory: " + format.format(freeMemory + (maxAmountMemory- allocatedMemory))) + " mb."
                               + "\n" + totalAvailableMemory + " mb left in memory." + "\n"
                               +  totalMemoryUsed + " mb left in memory." + "\n";
    }


    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }


     static int random(int min, int max) {
        min = 1;
        return min + (int) (Math.random() * ((max - min) + 1));
    }
  }





