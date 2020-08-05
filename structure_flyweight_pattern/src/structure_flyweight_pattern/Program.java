package structure_flyweight_pattern;

public class Program {

   public static void main(String[] args) {
      Tree tree1 = TreeFactory.getTree(TreeType.FUR);
      tree1.drawTree(10, 10, 4);

      Tree tree2 = TreeFactory.getTree(TreeType.FUR);
      tree2.drawTree(15, 10, 5);

      Tree tree3 = TreeFactory.getTree(TreeType.BIRCH);
      tree3.drawTree(20, 10, 3);

      Tree tree4 = TreeFactory.getTree(TreeType.FUR);
      tree4.drawTree(25, 10, 5);

      Tree tree5 = TreeFactory.getTree(TreeType.BIRCH);
      tree5.drawTree(30, 10, 3);
   }

}

//Console output
//Es wurde eine Tanne erstellt.
//Die Tanne wurde in Position ( 10/10 ) mit einer Höhe von 4 cm gezeichnet.
//Die Tanne wurde in Position ( 15/10 ) mit einer Höhe von 5 cm gezeichnet.
//Es wurde eine Birke erstellt.
//Die Birke wurde in Position ( 20/10 ) mit einer Höhe von 3 cm gezeichnet.
//Die Tanne wurde in Position ( 25/10 ) mit einer Höhe von 5 cm gezeichnet.
//Die Birke wurde in Position ( 30/10 ) mit einer Höhe von 3 cm gezeichnet.
