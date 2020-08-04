package structure_adapter_pattern_exercise;

public class GoogleMailServer {

   public GoogleMailServer() {
      // GoogleMailServer Objekt vorbereiten
   }

   public void buildConnection() {
      // Verbindung zu einem Konto aufbauen...
      System.out.println("Verbindung zu Mailkonto erfolgreich aufgebaut");
   }

   public void sendEmail(String receiverEmail, String content) {
      System.out.println("Die E-Mail wurden an " + receiverEmail + " gesendet...");
      System.out.println("Inhalt: " + content);
   }
}
