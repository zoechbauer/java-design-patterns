package structure_decorator_pattern;

public class MacBookPro implements MacBook {

   @Override
   public String getDescription() {
      return "Mac Book Pro Standardausführung";
   }

   @Override
   public double getPrice() {
      return 1199.99;
   }

   @Override
   public void increaseVolume() {
      System.out.println("Die Lautstärke des Mac Book Pro's wurde erhöht.");
   }

}
