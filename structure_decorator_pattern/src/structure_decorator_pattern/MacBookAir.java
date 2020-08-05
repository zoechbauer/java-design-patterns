package structure_decorator_pattern;

public class MacBookAir implements MacBook {

   @Override
   public String getDescription() {
      return "Mac Book Air Standardausführung";
   }

   @Override
   public double getPrice() {
      return 799.99;
   }

   @Override
   public void increaseVolume() {
      System.out.println("Die Lautstärke des Mac Book Air's wurde erhöht.");
   }

}
