package structure_decorator_pattern_exercise;

public class FrenchFries extends SideDishes {

   public FrenchFries(Dish dish) {
      super(dish);
   }

   @Override
   public double getPrice() {
      return dish.getPrice() + 3.5;
   }

   @Override
   public String getDescription() {
      return String.format("%s + Pommes", dish.getDescription());
   }

}
