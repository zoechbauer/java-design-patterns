package structure_decorator_pattern;

public class Program {

   public static void main(String[] args) {
      MacBookPro macBookPro = new MacBookPro();
      System.out.println(macBookPro.getDescription());
      System.out.println(macBookPro.getPrice() + " �");
      macBookPro.increaseVolume();
      System.out.println();

      AddonTouchbar macBookProTouchbar = new AddonTouchbar(macBookPro);
      System.out.println(macBookProTouchbar.getDescription());
      System.out.println(macBookProTouchbar.getPrice() + " �");
      macBookProTouchbar.increaseVolume();
      System.out.println();

      AddonI5Processor macBookProTouchbarWithI5 = new AddonI5Processor(macBookProTouchbar);
      System.out.println(macBookProTouchbarWithI5.getDescription());
      System.out.println(macBookProTouchbarWithI5.getPrice() + " �");
      macBookProTouchbarWithI5.increaseVolume();
      System.out.println();

      MacBookAir macBookAir = new MacBookAir();
      AddonI5Processor macBookAirI5 = new AddonI5Processor(macBookAir);
      System.out.println(macBookAirI5.getDescription());
      System.out.println(macBookAirI5.getPrice() + " �");
      macBookAirI5.increaseVolume();
   }

}

//Output Console
//Mac Book Pro Standardausf�hrung
//1199.99 �
//Die Lautst�rke des Mac Book Pro's wurde erh�ht.
//
//Mac Book Pro Standardausf�hrung + Touchbar
//1499.99 �
//Die Lautst�rke des MacBooks wurde mittels Touchbar erh�ht.
//
//Mac Book Pro Standardausf�hrung + Touchbar + I5 Prozessor
//1699.99 �
//Die Lautst�rke des MacBooks wurde mittels Touchbar erh�ht.
//
//Mac Book Air Standardausf�hrung + I5 Prozessor
//999.99 �
//Die Lautst�rke des Mac Book Air's wurde erh�ht.
