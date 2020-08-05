package structure_decorator_pattern;

public class AddonTouchbar extends MacBookAddon {

   public AddonTouchbar(MacBook macBook) {
      super(macBook);
   }

   @Override
   public String getDescription() {
      return macBook.getDescription() + " + Touchbar";
   }

   @Override
   public double getPrice() {
      return macBook.getPrice() + 300.00;
   }

   @Override
   public void increaseVolume() {
      System.out.println("Die Lautstärke des MacBooks wurde mittels Touchbar erhöht.");

   }

}
