package creation_factoryMethod_pattern_exercise;

public class TheTiredWarrior extends ItemFactory {
   private static int hammerId = 0;
   private static int shieldId = 0;

   /**
    * A Hammer or Shield is generated and returned Hammer: if number % 5 == 0;
    * Shield: else Number: 1...10
    */
   @Override
   public Item createItem(int number) {
      if (number % 5 == 0) { // tired
         String name = String.format("Hammer-%s", ++hammerId);
         int attackValue = number;
         return new Hammer(hammerId, name, attackValue);
      } else {
         String name = String.format("Schild-%s", ++shieldId);
         int defenseValue = number;
         return new Shield(shieldId, name, defenseValue);
      }
   }
}
