package behavior_command_pattern;

public interface BankTransactionCommand {
   void execute();

   void undo();

   BankTransactionCommand clone();
}
