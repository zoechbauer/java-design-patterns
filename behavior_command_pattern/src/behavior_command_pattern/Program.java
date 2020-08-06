package behavior_command_pattern;

public class Program {

   public static void main(String[] args) {
      BankAccount ottoBA = new BankAccount(123456789);
      System.out.println("Kontoanlage: " + ottoBA);

      CashMachine cashMachine = new CashMachine();

      BankTransactionCommand command1 = new DepositCommand(ottoBA, 2000);
      BankTransactionCommand command2 = new WithdrawCommand(ottoBA, 500);
      BankTransactionCommand command3 = new DepositCommand(ottoBA, 1000);
      BankTransactionCommand command4 = new WithdrawCommand(ottoBA, 4000);

      cashMachine.executeBankTransaction(command1);
      cashMachine.executeBankTransaction(command2);
      cashMachine.executeBankTransaction(command3);
      cashMachine.executeBankTransaction(command4);
   }
}

//Console output
//Kontoanlage: Konto-Nummer: 123456789, Kontostand: 0,00 €, Überziehungsrahmen: -1000,00 €
//Einzahlung: 2000,00 €, neuer Kontostand: 2000,00 €
//Auszahlung: 500,00 €, neuer Kontostand: 1500,00 €
//Einzahlung: 1000,00 €, neuer Kontostand: 2500,00 €
//Die Abhebung von 4000,00 €übersteigt den Überziehungsrahmen von -1000,00 €, Kontostand: 2500,00 €