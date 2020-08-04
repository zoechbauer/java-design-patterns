package structure_bridge_pattern_example2;

public abstract class Shape {
   protected Color color;

   public Shape(Color color) {
      this.color = color;
   }

   public abstract String draw();
}
