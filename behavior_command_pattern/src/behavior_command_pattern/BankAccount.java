package behavior_command_pattern;

public class BankAccount {
   private long accountNumber;
   private double balance;
   private final double OVERDRAFT = -1000;

   public BankAccount(long accountNumber) {
      this.accountNumber = accountNumber;
   }

   @Override
   public String toString() {
      return String.format("Konto-Nummer: %d, Kontostand: %.2f €, Überziehungsrahmen: %.2f €", this.accountNumber,
            this.balance, this.OVERDRAFT);
   }

   public void deposit(double amount) {
      this.balance += amount;
      System.out.printf("Einzahlung: %.2f €, neuer Kontostand: %.2f €%n", amount, this.balance);
   }

   public boolean withdraw(double amount) {
      if (balance - amount < OVERDRAFT) {
         System.out.printf("Die Abhebung von %.2f €übersteigt den Überziehungsrahmen von %.2f €, Kontostand: %.2f €%n",
               amount, this.OVERDRAFT, this.balance);
         return false;
      } else {
         this.balance -= amount;
         System.out.printf("Auszahlung: %.2f €, neuer Kontostand: %.2f €%n", amount, this.balance);
         return true;
      }
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

}
