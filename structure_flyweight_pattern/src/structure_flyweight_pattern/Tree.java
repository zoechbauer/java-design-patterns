package structure_flyweight_pattern;

import java.awt.Color;

public interface Tree {
   TreeType getTreeType();

   Color getColor();

   void drawTree(int x, int y, int height);
}
