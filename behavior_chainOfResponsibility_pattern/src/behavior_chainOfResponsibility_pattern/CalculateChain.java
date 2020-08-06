package behavior_chainOfResponsibility_pattern;

public interface CalculateChain {
   void setNext(CalculateChain next);

   void calculate(Numbers request);
}
