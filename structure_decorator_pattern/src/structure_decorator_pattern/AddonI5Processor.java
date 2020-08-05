package structure_decorator_pattern;

public class AddonI5Processor extends MacBookAddon {

   public AddonI5Processor(MacBook macBook) {
      super(macBook);
   }

   @Override
   public String getDescription() {
      return macBook.getDescription() + " + I5 Prozessor";
   }

   @Override
   public double getPrice() {
      return macBook.getPrice() + 200.00;
   }

   @Override
   public void increaseVolume() {
      macBook.increaseVolume();
   }
}
