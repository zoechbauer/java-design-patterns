package creation_singletonPattern_exercise;

public class Program {

   public static void main(String[] args) {
      StandardInteresRate obj1 = StandardInteresRate.getInstance();
      System.out.printf("Zinssatz von obj1 = %.2f %% %n", obj1.getInterestRate());

      StandardInteresRate obj2 = StandardInteresRate.getInstance();
      obj2.setInterestRate(5.0);
      System.out.printf("Zinssatz von obj2 = %.2f %% %n", obj1.getInterestRate());

      System.out.printf("Zinssatz von obj1 = %.2f %% %n", obj1.getInterestRate());

      StandardInteresRate obj3 = StandardInteresRate.getInstance();
      System.out.printf("Zinssatz von obj3 = %.2f %% %n", obj3.getInterestRate());
   }
}

//Ergebnis:
//Zinssatz von obj1 = 3,00 % 
//Zinssatz von obj2 = 5,00 % 
//Zinssatz von obj1 = 5,00 % 
//Zinssatz von obj3 = 5,00 % 