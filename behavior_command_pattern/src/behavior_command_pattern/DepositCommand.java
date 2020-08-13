package behavior_command_pattern;

public class DepositCommand implements BankTransactionCommand, Cloneable {
   private BankAccount bankAccount;
   private double amount;

   public DepositCommand(BankAccount bankAccount, double amount) {
      this.bankAccount = bankAccount;
      this.amount = amount;
   }

   @Override
   public void execute() {
      bankAccount.deposit(amount);
   }

   @Override
   public void undo() {
      double oldBalance = bankAccount.getBalance() - amount;
      bankAccount.setBalance(oldBalance);
      System.out.printf("Banktransaktion wurde rückgängig gemacht, neuer Kontostand: %.2f €%n",
            bankAccount.getBalance());
   }

   @Override
   public String toString() {
      return String.format("Einzahlung: %.2f €, Kontostand neu: %.2f €%n", amount, bankAccount.getBalance());
   }

   public DepositCommand clone() {
      try {
         DepositCommand command = (DepositCommand) super.clone();
         command.bankAccount = command.bankAccount.clone();
         return command;
      } catch (CloneNotSupportedException e) {
         System.err.println("DespositCommand kann nicht geklont werden");
         e.printStackTrace();
      }
      return null;
   }

}
