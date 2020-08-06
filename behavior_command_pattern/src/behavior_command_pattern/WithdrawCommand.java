package behavior_command_pattern;

public class WithdrawCommand implements BankTransactionCommand {
   private BankAccount bankAccount;
   private double amount;

   public WithdrawCommand(BankAccount bankAccount, double amount) {
      this.bankAccount = bankAccount;
      this.amount = amount;
   }

   @Override
   public void execute() {
      this.bankAccount.withdraw(this.amount);
   }
}
