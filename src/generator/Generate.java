package generator;

import javax.swing.*;

 class Generate {
    private int result;
    private BackgroundGenerator backgroundGenerator = new BackgroundGenerator();

     Generate() {
      addBackground();
    }


    void addBackground() {
        result = JOptionPane.showConfirmDialog(null, "Would you like to start game.");
        checksResult();
    }

    private void checksResult() {
        try
        {
            if (result == JOptionPane.YES_OPTION) {
                backgroundGenerator.addShapes();
            }

            else {
                JOptionPane.showMessageDialog(null, "Goodbye.");
                System.exit(0);
             }
        }

        catch (Exception e) {
            System.out.println("Error generator failed to generate.");
        }
    }

     public static void main(String[] args) {
         new Generate();
     } 
 }

