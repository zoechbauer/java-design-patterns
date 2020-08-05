package structure_decorator_pattern_exercise;

public class Program {

   public static void main(String[] args) {
      Dish schnitzel = new Schnitzel();
      System.out.println(schnitzel.getDescription());
      System.out.println(schnitzel.getPrice() + " €");

      SideDishes schnitzelWithFrenchFries = new FrenchFries(schnitzel);
      System.out.println(schnitzelWithFrenchFries.getDescription());
      System.out.println(schnitzelWithFrenchFries.getPrice() + " €");

      SideDishes schnitzelWithFrenchFriesAndSalad = new Salad(schnitzelWithFrenchFries);
      System.out.println(schnitzelWithFrenchFriesAndSalad.getDescription());
      System.out.println(schnitzelWithFrenchFriesAndSalad.getPrice() + " €");

      SideDishes schnitzelAndSalad = new Salad(schnitzel);
      System.out.println(schnitzelAndSalad.getDescription());
      System.out.println(schnitzelAndSalad.getPrice() + " €");
   }
}

//console output
//Wiener Schnitzel
//8.5 €
//Wiener Schnitzel + Pommes
//12.0 €
//Wiener Schnitzel + Pommes + Salat
//14.5 €
//Wiener Schnitzel + Salat
//11.0 €
