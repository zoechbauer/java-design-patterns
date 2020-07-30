package solid_openClosedPrinciple;

public class Circle extends Shape {
   private double radius;

   public Circle(double radius) {
      this.radius = radius;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public double area() {
      return this.getRadius() * this.getRadius() * Math.PI;
   }
}
