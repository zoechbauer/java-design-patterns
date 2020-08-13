package behavior_command_pattern;

public class BankAccount implements Cloneable {
   private long accountNumber;
   private double balance;
   private final double OVERDRAFT = -1000;

   public BankAccount(long accountNumber) {
      this.accountNumber = accountNumber;
   }

   @Override
   public String toString() {
      return String.format("Konto-Nummer: %d, Kontostand: %.2f €, Überziehungsrahmen: %.2f €", accountNumber, balance,
            OVERDRAFT);
   }

   public void deposit(double amount) {
      balance += amount;
      System.out.printf("Einzahlung: %.2f €, neuer Kontostand: %.2f €%n", amount, balance);
   }

   public boolean withdraw(double amount) {
      if (balance - amount < OVERDRAFT) {
         System.out.printf("Die Abhebung von %.2f €übersteigt den Überziehungsrahmen von %.2f €, Kontostand: %.2f €%n",
               amount, OVERDRAFT, balance);
         return false;
      } else {
         balance -= amount;
         System.out.printf("Auszahlung: %.2f €, neuer Kontostand: %.2f €%n", amount, balance);
         return true;
      }
   }

   public double getBalance() {
      return balance;
   }

   public void setBalance(double balance) {
      this.balance = balance;
   }

   public BankAccount clone() {
      try {
         return (BankAccount) super.clone();
      } catch (CloneNotSupportedException e) {
         System.err.println("BankAccount konnte nicht geklont werden");
         e.printStackTrace();
      }
      return null;
   }

}
