package solid_singleResponsibilityPrinciple;

import java.util.ArrayList;

public class ShoppingList {
   private ArrayList<String> entries = new ArrayList<>();
   private static int count = 0;

   public ArrayList<String> getEntries() {
      return entries;
   }

   public void setEntries(ArrayList<String> entries) {
      this.entries = entries;
   }

   public void addEntry(String product) {
      String text = String.format("%d : %s", count++, product);
      entries.add(text);
   }

   public void removeEntry(int index) {
      entries.remove(index);
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Einkaufsliste\n");
      for (String product : entries) {
         sb.append(product);
         sb.append("\n");
      }
      return sb.toString();
   }
}
