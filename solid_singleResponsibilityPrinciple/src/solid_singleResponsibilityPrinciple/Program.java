package solid_singleResponsibilityPrinciple;

import java.io.File;

public class Program {

   public static void main(String[] args) {
      ShoppingList list = new ShoppingList();
      list.addEntry("Bananen");
      list.addEntry("Birnen");
      list.addEntry("Äpfel");

      // list.saveToDisk(list.getEntries(), "Einkaufsliste.txt");

      Persistence persistance = new Persistence();
      persistance.saveToDisk(list.getEntries(), new File("Einkaufsliste.txt"));

   }

}
