package uml_class_diagram;

import java.awt.EventQueue;

public class Program {

   /**
    * This Example shows the structure of an UML Class Diagram. UML Class Diagrams
    * are used in this course for explaining the problems which can be solved with
    * Design Patterns
    * 
    * @param args
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(() -> {
         DisplayImage ex = new DisplayImage();
         ex.setVisible(true);
      });

   }

}
