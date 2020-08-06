package behavior_chainOfResponsibility_pattern;

/**
 * A simple calculator is implemented with Chain of Responsibility Pattern
 * (Simple linked List)
 */
public class Program {

   public static void main(String[] args) {
      CalculateChain chain1 = new AddOperation();
      CalculateChain chain2 = new SubtractOperation();
      CalculateChain chain3 = new MultiplyOperation();
      CalculateChain chain4 = new DivideOperation();

      chain1.setNext(chain2);
      chain2.setNext(chain3);
      chain3.setNext(chain4);

      chain1.calculate(new Numbers(3.5, 5.0, "*"));
      chain1.calculate(new Numbers(3.5, 1.5, "-"));
      chain1.calculate(new Numbers(3.5, 1.5, "+"));
      chain1.calculate(new Numbers(3.5, 1.5, "/"));
   }
}

//Console output
//3,50 * 5,00 = 17,50 
//3,50 - 1,50 = 2,00 
//3,50 + 1,50 = 5,00 
//3,50 / 1,50 = 2,33 
