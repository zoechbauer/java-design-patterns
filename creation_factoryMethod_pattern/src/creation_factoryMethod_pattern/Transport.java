package creation_factoryMethod_pattern;

public abstract class Transport {
   private String customer;
   private String address;
   // ....

   public void collectProductsFromCustomer() {
      System.out.println("\nDie Produkte wurden vom Kunden abgeholt");
   }

   public abstract void transportProducts();

}
