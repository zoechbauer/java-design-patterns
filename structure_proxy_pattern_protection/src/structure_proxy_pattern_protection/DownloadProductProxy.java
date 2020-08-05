package structure_proxy_pattern_protection;

public class DownloadProductProxy implements Downloadable {
   private final int NUM_DOWNLOADS_ALLOWED = 3;
   private String productName;
   private int downloadCounter = 0;

   public DownloadProductProxy(String productName) {
      this.productName = productName;
   }

   @Override
   public void download(Customer customer) {
      if (downloadCounter < NUM_DOWNLOADS_ALLOWED) {
         this.downloadCounter += 1;
         System.out.printf("Der Kunde mit der Mail-Adresse '%s' hat das Produkt '%s' erfolgreich heruntergeladen.%n",
               customer.getEmail(), this.productName);
      } else {
         System.out.printf(
               "Es wurde die erlaubte Download Anzahl ( %dx ) überschritten. Weitere Downloads sind nicht mehr erlaubt.%n",
               this.NUM_DOWNLOADS_ALLOWED);
      }

   }

}
