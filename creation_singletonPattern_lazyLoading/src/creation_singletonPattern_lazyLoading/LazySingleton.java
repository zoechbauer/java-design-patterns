package creation_singletonPattern_lazyLoading;

public class LazySingleton {
   private static LazySingleton instance;
   private static int calledCounter = 0;

   private LazySingleton() {
      System.out.println("LazySingleton wurde erzeugt");
   }

   public static LazySingleton getInstance() {
      if (instance == null) {
         instance = new LazySingleton();
      }
      calledCounter += 1;
      return instance;
   }

   public int getCalledCounter() {
      return calledCounter;
   }

}
