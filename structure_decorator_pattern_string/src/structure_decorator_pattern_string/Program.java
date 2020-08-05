package structure_decorator_pattern_string;

public class Program {

   public static void main(String[] args) {
      SpecialString test = new SpecialString("Das ist mein Haus. Aha!");
      int counterA = test.countCharA();
      System.out.printf("Der String '%s' enthält %d mal den Buchstaben (a/A).%n", test, counterA);
   }
}
