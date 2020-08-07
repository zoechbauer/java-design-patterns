package behavior_command_pattern;

public class WithdrawCommand implements BankTransactionCommand, Cloneable {
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

   @Override
   public String toString() {
      return String.format("Auszahlung: %.2f €, Kontostand neu: %.2f €%n", this.amount, this.bankAccount.getBalance());
   }

   public WithdrawCommand clone() {
      try {
         WithdrawCommand command = (WithdrawCommand) super.clone();
         command.bankAccount = command.bankAccount.clone();
         return command;
      } catch (CloneNotSupportedException e) {
         System.err.println("WithdrawCommand konnte nicht geklont werden");
         e.printStackTrace();
      }
      return null;
   }

}
