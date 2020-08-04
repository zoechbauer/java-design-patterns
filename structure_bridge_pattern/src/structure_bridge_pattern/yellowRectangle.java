package structure_bridge_pattern;

public class yellowRectangle implements DrawAPI {

   @Override
   public void draw(int x, int y, int length, int width) {
      System.out.printf("Das gelbe Rechteck mit der Länge %d und der Breite %d wurde gezeichnet.%n", length, width);
   }

}
