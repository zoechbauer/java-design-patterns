package structure_flyweight_pattern;

import java.util.HashMap;

public class TreeFactory {
   private static HashMap<TreeType, Tree> treeMap = new HashMap<>();

   public static Tree getTree(TreeType treeType) {
      if (!treeMap.containsKey(treeType)) {
         Tree tree = null;
         switch (treeType) {
         case FUR:
            tree = new Fur();
            break;
         case BIRCH:
            tree = new Birch();
            break;
         default:
            throw new RuntimeException("Falsche Baumart: " + treeType);
         }
         treeMap.put(treeType, tree);
      }
      return treeMap.get(treeType);
   }

}
