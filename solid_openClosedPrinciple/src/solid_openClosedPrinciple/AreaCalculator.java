package solid_openClosedPrinciple;

public class AreaCalculator {

//  old pgm version violates against open-close principle 
//               because this class must be changed if a new shape should be calculated e.g triangle  

//   public double calcArea(Object[] shapes) {
//      double area = 0;
//      for (Object shape : shapes) {
//
//         if (shape instanceof Rectangle) {
//            Rectangle rect = (Rectangle) shape;
//            area += rect.getHeight() * rect.getWidth();
//
//         } else if (shape instanceof Circle) {
//            Circle circle = (Circle) shape;
//            area += circle.getRadius() * circle.getRadius() * Math.PI;
//         }
//      }
//      return area;
//   }

   public double calcArea(Shape[] shapes) {
      double area = 0;
      for (Shape shape : shapes) {
         area += shape.area();
      }
      return area;
   }

}
