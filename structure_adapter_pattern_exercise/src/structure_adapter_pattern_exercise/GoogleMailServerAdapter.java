package structure_adapter_pattern_exercise;

public class GoogleMailServerAdapter implements MailServer {
   private GoogleMailServer mailServer;

   public GoogleMailServerAdapter(GoogleMailServer mailServer) {
      this.mailServer = mailServer;
   }

   @Override
   public void connectAndSendMail(String emailAddress, String content, String receiverName) {
      this.mailServer.buildConnection();
      String encryptedContend = encryptEmail(content);
      this.mailServer.sendEmail(emailAddress, encryptedContend);
      System.out.printf("Name des Empfängers: %s %n", receiverName);
   }

   protected String encryptEmail(String content) {
      String encryptedContent = content;
      // ... TODO encrypt content
      System.out.println("E-Mail erfolgreich verschlüsselt");
      return encryptedContent;
   }

}
