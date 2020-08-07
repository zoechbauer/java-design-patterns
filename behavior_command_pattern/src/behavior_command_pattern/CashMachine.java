package behavior_command_pattern;

import java.util.ArrayList;
import java.util.List;

public class CashMachine {
   private List<BankTransactionCommand> commands = new ArrayList<BankTransactionCommand>();

   public void executeBankTransaction(BankTransactionCommand command) {
      command.execute();

      BankTransactionCommand logCommand = command.clone();
      commands.add(logCommand);
   }

   public void undoBankTransaction(BankTransactionCommand command) {
      command.undo();
   }

   public void listExecutedCommands() {
      System.out.println("\nLog der Banktransaktionen");
      int i = 1;
      for (BankTransactionCommand command : commands) {
         System.out.printf("Transaktions-Nr %d: %s", i++, command);
      }
   }

}
