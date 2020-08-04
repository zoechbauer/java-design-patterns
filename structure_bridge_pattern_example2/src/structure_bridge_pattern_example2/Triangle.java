package structure_bridge_pattern_example2;

public class Triangle extends Shape {

   public Triangle(Color color) {
      super(color);
   }

   @Override
   public String draw() {
      return "Dreieck gezeichnet, " + color.fill();
   }

}
