package behavior_command_pattern;

public class DepositCommand implements BankTransactionCommand {
   private BankAccount bankAccount;
   private double amount;

   public DepositCommand(BankAccount bankAccount, double amount) {
      this.bankAccount = bankAccount;
      this.amount = amount;
   }

   @Override
   public void execute() {
      this.bankAccount.deposit(this.amount);
   }

   @Override
   public void undo() {
      double oldBalance = this.bankAccount.getBalance() - this.amount;
      this.bankAccount.setBalance(oldBalance);
      System.out.printf("Banktransaktion wurde rückgängig gemacht, neuer Kontostand: %.2f €%n",
            this.bankAccount.getBalance());
   }

}
