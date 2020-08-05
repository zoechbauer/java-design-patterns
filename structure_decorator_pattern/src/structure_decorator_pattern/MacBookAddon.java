package structure_decorator_pattern;

public abstract class MacBookAddon implements MacBook {
   protected MacBook macBook;

   public MacBookAddon(MacBook macBook) {
      this.macBook = macBook;
   }

}
