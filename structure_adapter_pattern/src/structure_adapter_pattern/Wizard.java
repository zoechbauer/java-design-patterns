package structure_adapter_pattern;

public class Wizard {
   private String name;
   private int health;
   // ...

   public void attackEnemy() {
      System.out.println("Der Zauberer greift an!!!");
   }

   public void goToBed() {
      System.out.println("Der Zauberer legt sich schlafen");
   }

   public void communicate() {
      System.out.println("Der Zauberer sagt Hallo!");
   }
}
