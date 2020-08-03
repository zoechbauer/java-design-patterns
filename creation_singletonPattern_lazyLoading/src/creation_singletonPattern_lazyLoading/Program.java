package creation_singletonPattern_lazyLoading;

public class Program {

   public static void main(String[] args) {
      LazySingleton obj1 = LazySingleton.getInstance();
      System.out.println("Anzahl Klassen-Aufrufe: " + obj1.getCalledCounter());

      LazySingleton obj2 = LazySingleton.getInstance();
      System.out.println("Anzahl Klassen-Aufrufe: " + obj2.getCalledCounter());
   }

}
