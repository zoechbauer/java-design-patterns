package solid_DependencyInversionPrinciple;

public class JavaDeveloper implements Developer {

   public void writeJavaCode() {
      System.out.println("Ich schreibe Jave Code ...");
   }

   @Override
   public void develop() {
      writeJavaCode();
   }

}
