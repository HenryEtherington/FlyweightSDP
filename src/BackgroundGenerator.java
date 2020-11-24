import javax.swing.*;
import java.awt.*;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;


public class BackgroundGenerator extends Canvas implements ActionListener {
    //boolean waiting;
    private int x;
    private int y;
    String name;
    Color color;
    int height;
    int width;
    int guiWidth = 600;
    int guiHeight = 500;


    BackgroundGenerator() {

        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
        this.height = height;
        this.width = width;
        //notGeneratingBackground();

    }

    @Override
    public void paint(Graphics g) {

        Graphics2D graphics = (Graphics2D) g;

        //15 shapes
        graphics.fillRect(random(0, guiWidth),random(0, guiHeight), 50, 20);
        graphics.fillOval(random(0, guiWidth),random(0, guiHeight), 5, 20);
        graphics.fillRect(random(0, guiWidth),random(0, guiHeight), 43, 13);
        graphics.fillRect(random(0, guiWidth),random(0, guiHeight), 29, 20);
        drawRectangle(g);
        graphics.fillRect(random(0, guiWidth),random(0, guiHeight), 30, 20);
        graphics.fillRect(random(0, guiWidth),random(0, guiHeight), 50, 20);
        graphics.fillOval(random(0, guiWidth),random(0, guiHeight), 50, 20);
        graphics.fillOval(random(0, guiWidth),random(0, guiHeight), 20, 20);
        graphics.fillRect(random(0, guiWidth),random(0, guiHeight), 10, 20);
        graphics.fillRect(random(0, guiWidth),random(0, guiHeight), 14, 20);
        graphics.fillRect(random(0, guiWidth),random(0, guiHeight), 5, 20);
        graphics.fillRect(random(0, guiWidth),random(0, guiHeight), 50, 20);
        graphics.fillRect(random(0, guiWidth),random(0, guiHeight), 6, 20);
        graphics.fillOval(random(0, guiWidth),random(0, guiHeight), 7, 20);
        graphics.fillRect(random(0, guiWidth),random(0, guiHeight), 5, 20);

    }

    public void drawRectangle(Graphics g) {
        Graphics2D graphics = (Graphics2D) g;
        graphics.fillRect(random(0, guiWidth),random(0, guiHeight),50,20);
    }



    /*public void notGeneratingBackground() {
        if (!waiting) {
            System.out.println("error");
        } else
            JOptionPane.showMessageDialog(null, "Waiting on background generation.");
    }*/

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }


    public static int random(int min, int max) {
        min = 1;
        return min + (int) (Math.random() * ((max - min) + 1));
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        BackgroundGenerator backgroundGenerator = new BackgroundGenerator();
        JFrame jFrame = new JFrame();
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(backgroundGenerator);
        jFrame.setVisible(true);

        int SHAPES_TO_DRAW = 15;
        int SHAPE_TYPES = 2;
        //  waiting = false;

        long end = System.currentTimeMillis();
        System.out.println("Shapes take " +
                (end - start) + "ms to generate.");

        Runtime runtime = Runtime.getRuntime();

        NumberFormat format = NumberFormat.getInstance();

        StringBuilder sb = new StringBuilder();
        long maxMemory = runtime.maxMemory();
        long allocatedMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();

        //MEM USAGE
        //RAM USAGE
        //TIME TAKEN

        //REF ME REM mehttps://stackoverflow.com/questions/74674/how-do-i-check-cpu-and-memory-usage-in-java
        //https://refactoring.guru/design-patterns/flyweight/java/example
        long total = Runtime.getRuntime().totalMemory();
        long used  = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println(sb.append("free memory: " + format.format(freeMemory / 1024) + " mb."));
        System.out.println(sb.append("free memory: " + format.format(freeMemory / 1024) + " mb."));
        System.out.println(sb.append("\nallocated memory: " + format.format(allocatedMemory / 1024) + " mb."));
        System.out.println(sb.append("\nmax memory: " + format.format(maxMemory / 1024) + " mb."));
        System.out.println(sb.append("\ntotal free memory: " + format.format(freeMemory + (maxMemory - allocatedMemory))) + " mb.");
        System.out.println(total + " mb available in memory.");
        System.out.println(used + " mb available in memory.");
        System.out.println("Background generated.");
        System.out.println(SHAPES_TO_DRAW + " shapes drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("shape size (8 bytes) * " + SHAPES_TO_DRAW);
        System.out.println("+ ShapeTypes size (~30 bytes) * " + SHAPES_TO_DRAW + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((SHAPES_TO_DRAW  * 38) / 1024 / 1024) +
                "MB (instead of " + ((SHAPES_TO_DRAW * 8 + SHAPE_TYPES  * 30) / 1024 / 1024) + "MB)");

        //jFrame.setSize(500,500);*/
        //jFrame.setVisible(true);
    }

}




