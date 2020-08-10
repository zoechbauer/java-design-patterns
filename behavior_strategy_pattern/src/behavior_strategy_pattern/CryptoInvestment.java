package behavior_strategy_pattern;

public class CryptoInvestment implements InvestmentStrategy {

   @Override
   public void invest(double investmentMoney) {
      System.out.printf("Sie haben erfolgreich %,.2f € in Krypto-Währungen investiert.", investmentMoney);
   }

}
