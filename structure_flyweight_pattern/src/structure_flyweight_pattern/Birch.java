package structure_flyweight_pattern;

import java.awt.Color;

// Birke
public class Birch implements Tree {
   private TreeType treeType;
   private Color color;

   public Birch() {
      treeType = TreeType.BIRCH;
      color = Color.RED;
      System.out.println("Es wurde eine Birke erstellt.");
   }

   @Override
   public TreeType getTreeType() {
      return treeType;
   }

   @Override
   public Color getColor() {
      return color;
   }

   @Override
   public void drawTree(int x, int y, int height) {
      System.out.printf("Die Birke wurde in Position ( %d/%d ) mit einer Höhe von %d cm gezeichnet.%n", x, y, height);

   }

}
