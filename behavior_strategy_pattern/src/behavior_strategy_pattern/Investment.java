package behavior_strategy_pattern;

public class Investment {
   private double investmentMoney;
   private InvestmentStrategy selectedStrategy;
   private boolean isConsultation = false;

   public Investment(double investmentMoney) {
      this.investmentMoney = investmentMoney;
   }

   public void setInvestmentStrategy(InvestmentStrategy strategy) {
      this.selectedStrategy = strategy;
      System.out.println("Die Strategie wurde gewählt.");
   }

   public void makeConsultation() {
      this.isConsultation = true;
      System.out.println("Das Beratungsgespräch war ausgezeichnet.");
   }

   public void makeInvestment() {
      if (this.selectedStrategy == null || !this.isConsultation) {
         throw new RuntimeException(
               "Sie müssen ein Beratungsgespräch mit der Bank führen und eine Investment-Strategie auswählen!");
      }
      this.selectedStrategy.invest(this.investmentMoney);
   }

}
