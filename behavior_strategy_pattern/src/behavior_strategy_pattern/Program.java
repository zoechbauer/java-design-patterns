package behavior_strategy_pattern;

public class Program {

   public static void main(String[] args) {
      Investment invest3000 = new Investment(3000);

      invest3000.makeConsultation();
      invest3000.setInvestmentStrategy(new StockMarketInvestment());
      invest3000.makeInvestment();

   }
}

//Output Console
//Das Beratungsgespräch war ausgezeichnet.
//Die Strategie wurde gewählt.
//Sie haben erfolgreich 3.000,00 € in Wertpapiere investiert.
