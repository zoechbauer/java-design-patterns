package structure_decorator_pattern_exercise;

public abstract class SideDishes implements Dish {
   protected Dish dish;

   public SideDishes(Dish dish) {
      this.dish = dish;
   }

}
