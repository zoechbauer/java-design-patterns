package creation_factoryMethod_pattern_exercise;

public class WarGame {
   private int points = 0;
   private ItemFactory itemFactory;

   public WarGame(ItemFactory itemFactory) {
      this.itemFactory = itemFactory;
   }

   /**
    * The Game creates randomly 3 items (Hammer or Shield) and calls it's useItem
    * Method which prints the data and returns the points which are added to the
    * game. After Game over the collected points are printed.
    */
   public void start() {
      System.out.printf("Spiel Start: %d Punkte %n", this.points);

      for (int i = 0; i < 3; i++) {
         Item item = itemFactory.generateRandomItem();
         this.points += item.useItem();
      }
      System.out.printf("Spiel Ende: %d Punkte %n%n", this.points);
   }

}
