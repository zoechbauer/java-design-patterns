package structure_bridge_pattern_example2;

import java.util.ArrayList;

/**
 * @author https://www.baeldung.com/java-bridge-pattern
 */
public class Program {

   public static void main(String[] args) {
      ArrayList<Shape> shapes = new ArrayList<>();

      shapes.add(new Square(new Red()));
      shapes.add(new Square(new Blue()));
      shapes.add(new Triangle(new Red()));
      shapes.add(new Triangle(new Blue()));

      shapes.forEach(shape -> System.out.println(shape.draw()));
   }

}
