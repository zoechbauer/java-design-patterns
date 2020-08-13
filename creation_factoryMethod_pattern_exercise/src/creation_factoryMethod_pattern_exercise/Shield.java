package creation_factoryMethod_pattern_exercise;

public class Shield extends Item {
   int defenseValue;

   public Shield(int id, String name, int defenseValue) {
      super(id, name);
      this.defenseValue = defenseValue;
   }

   @Override
   public int useItem() {
      System.out.printf("Abwehr mit %s kostete %d Punkte %n", getName(), defenseValue);
      return defenseValue * (-1);
   }

}
