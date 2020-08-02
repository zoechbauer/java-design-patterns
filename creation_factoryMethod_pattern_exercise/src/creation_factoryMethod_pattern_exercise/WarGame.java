package creation_factoryMethod_pattern_exercise;

public abstract class WarGame {
   int points = 0;

   protected abstract Item generateItem(int number);

   /**
    * The Game creates randomly 3 items (Hammer or Shield) and calls it's useItem
    * Method which prints the data and returns the points which are added to the
    * game. After Game over the collected points are printed.
    */
   public void startGame() {
      System.out.printf("Spiel Start: %d Punkte %n", this.points);

      for (int i = 0; i < 3; i++) {
         int randomNumber = (int) (Math.random() * 10 + 1);
         Item item = generateItem(randomNumber);
         this.points += item.useItem();
      }
      System.out.printf("Spiel Ende: %d Punkte %n%n", this.points);
   }

}
