package creation_singletonPattern_exercise;

public class StandardInteresRate {
   private static StandardInteresRate instance;
   private double interestRate;

   private StandardInteresRate() {
      interestRate = 3.0;
   }

   public static StandardInteresRate getInstance() {
      if (instance == null) {
         instance = new StandardInteresRate();
      }
      return instance;
   }

   public double getInterestRate() {
      return interestRate;
   }

   public void setInterestRate(double interestRate) {
      this.interestRate = interestRate;
   }
}
