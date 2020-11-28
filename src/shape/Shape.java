package shape;

import java.awt.*;


class Shape {
    private int x;
    private int y;
    ShapeType type;

   Shape(int x, int y, ShapeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

     void draw(Graphics g) {

        switch (type.name)
        {
            case "Square":
            type.drawSquare(g, x, y);
            break;

            case "Rectangle":
            type.drawRectangle(g, x, y);
            break;


            case "Circle":
            type.drawCircle(g, x, y);
            break;

            default:
            type.drawSmallRectangle(g, x, y);

        }
    }
 }
