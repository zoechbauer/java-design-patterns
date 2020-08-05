package structure_decorator_pattern_exercise;

public class Salad extends SideDishes {

   public Salad(Dish dish) {
      super(dish);
   }

   @Override
   public double getPrice() {
      return dish.getPrice() + 2.5;
   }

   @Override
   public String getDescription() {
      return dish.getDescription() + " + Salat";
   }

}
