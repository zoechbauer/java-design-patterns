package structure_decorator_pattern_exercise;

public class Schnitzel implements Dish {

   @Override
   public double getPrice() {
      return 8.50;
   }

   @Override
   public String getDescription() {
      return "Wiener Schnitzel";
   }

}
