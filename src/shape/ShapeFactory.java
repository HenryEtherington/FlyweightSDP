package shape;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

 class ShapeFactory {

     static Map<String, ShapeType> shapeTypes = new HashMap<>();

      static ShapeType getShapeType(String name, Color color, int height, int width) {
          ShapeType result = shapeTypes.get(shapeTypes);
          try {

            if (result == null) {
                result = new ShapeType(name, color, height, width);
                shapeTypes.put(name, result);
            }
        } catch (Exception e) {
            System.out.println("Shape not added");
        }
          return result;
    }
}