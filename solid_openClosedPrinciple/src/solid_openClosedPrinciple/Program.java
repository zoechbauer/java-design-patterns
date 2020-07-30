package solid_openClosedPrinciple;

public class Program {

   public static void main(String[] args) {
//      1st customer request: calculate area of different rectangles and circles

//      Object[] shapes = new Object[] { new Rectangle(4, 5), new Rectangle(3.5, 6.5), new Rectangle(10, 2),
//            new Circle(3), new Circle(5.5) };
//      AreaCalculator calculator = new AreaCalculator();
//      System.out.printf("Flächeninhalten von Rechtecken und Kreisen: %.2f m2", calculator.calcArea(shapes));  
//
//
      // after 2nd customer request (triangles should also be calculated)
      // a refactoring with abstract class Shape was implemented
      // (open-closed-principle )
      //
      Shape[] shapes = new Shape[] { new Rectangle(4, 5), new Rectangle(3.5, 6.5), new Rectangle(10, 2), new Circle(3),
            new Circle(5.5), new Triangle(30, 10), new Triangle(5, 2) };

      AreaCalculator calculator = new AreaCalculator();

      System.out.printf("Flächeninhalten von Rechtecken und Kreisen: %.2f m2", calculator.calcArea(shapes));
   }

}
