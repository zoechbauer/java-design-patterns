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

      cashMachine.undoBankTransaction(command4);
      cashMachine.undoBankTransaction(command3);
      cashMachine.undoBankTransaction(command2);
      cashMachine.undoBankTransaction(command1);

      cashMachine.listExecutedCommands();
   }
}

//Console output
//Kontoanlage: Konto-Nummer: 123456789, Kontostand: 0,00 €, Überziehungsrahmen: -1000,00 €
//Einzahlung: 2000,00 €, neuer Kontostand: 2000,00 €
//Auszahlung: 500,00 €, neuer Kontostand: 1500,00 €
//Einzahlung: 1000,00 €, neuer Kontostand: 2500,00 €
//Die Abhebung von 4000,00 €übersteigt den Überziehungsrahmen von -1000,00 €, Kontostand: 2500,00 €
//Undo konnte nicht durchgeführt werden, da die vorige Transaction fehlerhaft beendet wurde.
//Banktransaktion wurde rückgängig gemacht, neuer Kontostand: 1500,00 €
//Banktransaktion wurde rückgängig gemacht, neuer Kontostand: 2000,00 €
//Banktransaktion wurde rückgängig gemacht, neuer Kontostand: 0,00 €
//
//Log der Banktransaktionen
//Transaktions-Nr 1: Einzahlung: 2000,00 €, Kontostand neu: 2000,00 €
//Transaktions-Nr 2: Auszahlung: 500,00 €, Kontostand neu: 1500,00 €
//Transaktions-Nr 3: Einzahlung: 1000,00 €, Kontostand neu: 2500,00 €
//Transaktions-Nr 4: Auszahlung: 4000,00 €, Kontostand neu: 2500,00 €
