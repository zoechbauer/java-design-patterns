package structure_adapter_pattern;

public class Program {

   public static void main(String[] args) {
      EnemyObject orc = new EnemyObjectOrc();
      orc.attack();
      orc.sleep();
      orc.sayHello();

      Wizard wizard = new Wizard();
      EnemyObject adapterWizard = new AdapterWizard(wizard);
      adapterWizard.attack();
      adapterWizard.sleep();
      adapterWizard.sayHello();
   }

}
