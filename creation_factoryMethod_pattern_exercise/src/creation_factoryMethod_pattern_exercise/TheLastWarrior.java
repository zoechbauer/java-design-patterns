package creation_factoryMethod_pattern_exercise;

public class TheLastWarrior extends WarGame {
   private static int hammerId = 0;
   private static int shieldId = 0;

   /**
    * A Hammer or Shield is generated and returned Hammer: if number % 2 == 0;
    * Shield: else Number: 1...10
    */
   @Override
   public Item generateItem(int number) {
      if (number % 2 == 0) {
         String name = String.format("Hammer-%s", ++this.hammerId);
         int attackValue = number;
         return new Hammer(this.hammerId, name, attackValue);
      } else {
         String name = String.format("Schild-%s", ++this.shieldId);
         int defenseValue = number;
         return new Shield(this.shieldId, name, defenseValue);
      }
   }

}
