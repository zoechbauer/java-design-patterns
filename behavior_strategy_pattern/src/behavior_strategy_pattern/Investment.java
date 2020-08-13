package behavior_strategy_pattern;

public class Investment {
   private double investmentMoney;
   private InvestmentStrategy selectedStrategy;
   private boolean isConsultation = false;

   public Investment(double investmentMoney) {
      this.investmentMoney = investmentMoney;
   }

   public void setInvestmentStrategy(InvestmentStrategy strategy) {
      selectedStrategy = strategy;
      System.out.println("Die Strategie wurde gewählt.");
   }

   public void makeConsultation() {
      isConsultation = true;
      System.out.println("Das Beratungsgespräch war ausgezeichnet.");
   }

   public void makeInvestment() {
      if (selectedStrategy == null || !isConsultation) {
         throw new RuntimeException(
               "Sie müssen ein Beratungsgespräch mit der Bank führen und eine Investment-Strategie auswählen!");
      }
      selectedStrategy.invest(investmentMoney);
   }

}
