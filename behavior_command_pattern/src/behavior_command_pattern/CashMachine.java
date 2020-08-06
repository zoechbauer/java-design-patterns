package behavior_command_pattern;

public class CashMachine {
   public void executeBankTransaction(BankTransactionCommand command) {
      command.execute();
   }

}
