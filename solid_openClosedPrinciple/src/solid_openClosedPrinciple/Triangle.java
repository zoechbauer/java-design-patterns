package solid_openClosedPrinciple;

public class Triangle extends Shape {
   private double length;
   private double heigth;

   public Triangle(double length, double heigth) {
      this.length = length;
      this.heigth = heigth;
   }

   public double area() {
      return this.length * this.heigth / 2;
   }

}
