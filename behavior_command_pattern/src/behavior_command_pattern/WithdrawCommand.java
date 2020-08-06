package behavior_command_pattern;

public class WithdrawCommand implements BankTransactionCommand {
   private BankAccount bankAccount;
   private double amount;
   private boolean transactionSucceeded = false;

   public WithdrawCommand(BankAccount bankAccount, double amount) {
      this.bankAccount = bankAccount;
      this.amount = amount;
   }

   @Override
   public void execute() {
      transactionSucceeded = this.bankAccount.withdraw(this.amount);
   }

   @Override
   public void undo() {
      if (transactionSucceeded) {
         double oldBalance = this.bankAccount.getBalance() + this.amount;
         this.bankAccount.setBalance(oldBalance);
         System.out.printf("Banktransaktion wurde rückgängig gemacht, neuer Kontostand: %.2f €%n",
               this.bankAccount.getBalance());
      } else {
         System.out
               .println("Undo konnte nicht durchgeführt werden, da die vorige Transaction fehlerhaft beendet wurde.");

      }

   }

}
