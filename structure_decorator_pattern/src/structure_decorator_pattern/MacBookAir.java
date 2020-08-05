package structure_decorator_pattern;

public class MacBookAir implements MacBook {

   @Override
   public String getDescription() {
      return "Mac Book Air Standardausf�hrung";
   }

   @Override
   public double getPrice() {
      return 799.99;
   }

   @Override
   public void increaseVolume() {
      System.out.println("Die Lautst�rke des Mac Book Air's wurde erh�ht.");
   }

}
