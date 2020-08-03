package creation_factoryMethod_pattern_exercise;

public abstract class ItemFactory {

   public abstract Item createItem(int number);

   public Item generateRandomItem() {
      int randomNumber = (int) (Math.random() * 10 + 1);
      return createItem(randomNumber);
   }

}
