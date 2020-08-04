package structure_bridge_pattern_example2;

public class Square extends Shape {

   public Square(Color color) {
      super(color);
   }

   @Override
   public String draw() {
      return "Quadrat gezeichnet, " + color.fill();
   }

}
