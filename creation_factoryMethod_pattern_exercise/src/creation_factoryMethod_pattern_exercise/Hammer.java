package creation_factoryMethod_pattern_exercise;

public class Hammer extends Item {
   int attackValue;

   public Hammer(int id, String name, int attackValue) {
      super(id, name);
      this.attackValue = attackValue;
   }

   @Override
   public int useItem() {
      System.out.printf("Attacke von %s brachte %d Punkte %n", this.getName(), this.attackValue);
      return attackValue;
   }

}
