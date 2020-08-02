package creation_factoryMethod_pattern_exercise;

public abstract class Item {
   private final int id;
   private String name;

   public Item(int id, String name) {
      this.id = id;
      this.name = name;
   }

   public int getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public abstract int useItem();
}
