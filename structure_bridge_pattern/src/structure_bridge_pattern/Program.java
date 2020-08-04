package structure_bridge_pattern;

public class Program {

   public static void main(String[] args) {
      Shape greenRectangle = new Rectangle(new GreenRectangle(), 10, 10, 20, 10);
      greenRectangle.draw();

      Shape yellowRectangle = new Rectangle(new yellowRectangle(), 20, 20, 10, 5);
      yellowRectangle.draw();
   }

}
