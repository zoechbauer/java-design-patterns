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
      System.out.println("Die Strategie wurde gew�hlt.");
   }

   public void makeConsultation() {
      this.isConsultation = true;
      System.out.println("Das Beratungsgespr�ch war ausgezeichnet.");
   }

   public void makeInvestment() {
      if (this.selectedStrategy == null || !this.isConsultation) {
         throw new RuntimeException(
               "Sie m�ssen ein Beratungsgespr�ch mit der Bank f�hren und eine Investment-Strategie ausw�hlen!");
      }
      this.selectedStrategy.invest(this.investmentMoney);
   }

}
