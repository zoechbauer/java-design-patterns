package behavior_chainOfResponsibility_pattern;

public class DivideOperation implements CalculateChain {
   private CalculateChain next;

   @Override
   public void setNext(CalculateChain next) {
      this.next = next;
   }

   @Override
   public void calculate(Numbers request) {
      if (request.getOperation() == "/") {
         double result = request.getNumber1() / request.getNumber2();
         System.out.printf("%.2f / %.2f = %.2f %n", request.getNumber1(), request.getNumber2(), result);
      } else {
         // this operation is the last implemented operation in the chain
         // next.calculate(request);
         System.out.printf("Die Operation '%s' wurde nicht implementiert!%n", request.getOperation());
      }
   }
}
