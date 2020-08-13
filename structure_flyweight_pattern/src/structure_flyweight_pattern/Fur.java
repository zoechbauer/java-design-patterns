package structure_flyweight_pattern;

import java.awt.Color;

// Tanne
public class Fur implements Tree {
   private TreeType treeType;
   private Color color;

   public Fur() {
      treeType = TreeType.FUR;
      color = Color.GREEN;
      System.out.println("Es wurde eine Tanne erstellt.");
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
      System.out.printf("Die Tanne wurde in Position ( %d/%d ) mit einer Höhe von %d cm gezeichnet.%n", x, y, height);
   }

}
