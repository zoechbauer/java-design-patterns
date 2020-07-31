package solid_LiskovSubstitutionPrinciple;

public class Program {

   public static void main(String[] args) {
      // This example shows a violation against the Liskov Substitution Principle
      // because you get wrong results if you use parameters of super class

      // Test ok
      System.out.println("Test Rechteck");
      Rectangle rectangle = new Rectangle(10, 20);
      testLiskovSubstituionPrinciple(rectangle);

      // Test not ok
      System.out.println("\nTest Quadrat");
      Square square = new Square(5);
      testLiskovSubstituionPrinciple(square);

   }

   private static void testLiskovSubstituionPrinciple(Rectangle rectangle) {
      double height = rectangle.getHeight();
      rectangle.setWidth(30);

      System.out.printf("Erwarteter Flächeninhalt von %.2f m x %.2f m ist %.2f m2 %n", height, rectangle.getWidth(),
            height * rectangle.getWidth());
      System.out.printf("Tatsächlicher Flächeninhalt von %.2f m x %.2f m ist %.2f m2 %n", height, rectangle.getWidth(),
            rectangle.area());
   }

//   Console Output
//   Test Rechteck
//   Erwarteter Flächeninhalt von 20,00 m x 30,00 m ist 600,00 m2 
//   Tatsächlicher Flächeninhalt von 20,00 m x 30,00 m ist 600,00 m2 
//
//   Test Quadrat
//   Erwarteter Flächeninhalt von 5,00 m x 30,00 m ist 150,00 m2 
//   Tatsächlicher Flächeninhalt von 5,00 m x 30,00 m ist 900,00 m2 

}
