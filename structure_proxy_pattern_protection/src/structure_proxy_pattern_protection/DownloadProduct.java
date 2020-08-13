package structure_proxy_pattern_protection;

public class DownloadProduct implements Downloadable {
   private String productName;

   public DownloadProduct(String productName) {
      this.productName = productName;
   }

   @Override
   public void download(Customer customer) {
      System.out.printf("Der Kunde mit der Mail-Adresse '%s' hat das Produkt '%s' erfolgreich heruntergeladen.%n",
            customer.getEmail(), productName);
   }

}
