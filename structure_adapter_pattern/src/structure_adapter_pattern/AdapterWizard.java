package structure_adapter_pattern;

public class AdapterWizard implements EnemyObject {

   private Wizard wizard;

   public AdapterWizard(Wizard wizard) {
      this.wizard = wizard;
   }

   @Override
   public void attack() {
      this.wizard.attackEnemy();
   }

   @Override
   public void sleep() {
      this.wizard.goToBed();
   }

   @Override
   public void sayHello() {
      this.wizard.communicate();
   }

}
