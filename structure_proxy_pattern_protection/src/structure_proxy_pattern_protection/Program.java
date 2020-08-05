package structure_proxy_pattern_protection;

public class Program {

   public static void main(String[] args) {
      Customer otto = new Customer("otto.normalverbraucher@provider.com");
      // unlimited download
      DownloadProduct javaEbook = new DownloadProduct("Java E-Book");
      javaEbook.download(otto);
      javaEbook.download(otto);
      javaEbook.download(otto);
      javaEbook.download(otto);

      System.out.println();

      // limited download
      Customer max = new Customer("max.mustermann@provider.com");
      DownloadProductProxy javaDesignPatterns = new DownloadProductProxy("Java Design Pattern");
      javaDesignPatterns.download(otto);
      javaDesignPatterns.download(max);
      javaDesignPatterns.download(new Customer("tester1.testcompany@provider.com"));
      javaDesignPatterns.download(new Customer("tester2.testcompany@provider.com"));

   }

}

//Console Ausgabe
//Der Kunde mit der Mail-Adresse 'otto.normalverbraucher@provider.com' hat das Produkt 'Java E-Book' erfolgreich heruntergeladen.
//Der Kunde mit der Mail-Adresse 'otto.normalverbraucher@provider.com' hat das Produkt 'Java E-Book' erfolgreich heruntergeladen.
//Der Kunde mit der Mail-Adresse 'otto.normalverbraucher@provider.com' hat das Produkt 'Java E-Book' erfolgreich heruntergeladen.
//Der Kunde mit der Mail-Adresse 'otto.normalverbraucher@provider.com' hat das Produkt 'Java E-Book' erfolgreich heruntergeladen.
//
//Der Kunde mit der Mail-Adresse 'otto.normalverbraucher@provider.com' hat das Produkt 'Java Design Pattern' erfolgreich heruntergeladen.
//Der Kunde mit der Mail-Adresse 'max.mustermann@provider.com' hat das Produkt 'Java Design Pattern' erfolgreich heruntergeladen.
//Der Kunde mit der Mail-Adresse 'tester1.testcompany@provider.com' hat das Produkt 'Java Design Pattern' erfolgreich heruntergeladen.
//Es wurde die erlaubte Download Anzahl ( 3x ) überschritten. Weitere Downloads sind nicht mehr erlaubt.
