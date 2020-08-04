package structure_adapter_pattern_exercise;

public class Program {

   public static void main(String[] args) {
      // 1st mail
      System.out.println("1st mail");
      GoogleMailServer mailServer = new GoogleMailServer();
      mailServer.buildConnection();
      mailServer.sendEmail("otto.mustermann@mailserver.com", "Dies ist eine Mail via GoogleMailServer");

      // 2nd mail
      System.out.println("\n2nd mail");
      MailServer adapterMailServer = new GoogleMailServerAdapter(mailServer);
      adapterMailServer.connectAndSendMail("otto.mustermann@mailserver.com",
            "Dies ist eine Mail via Google Mail Server Adapter", "Otto Mustermann");

   }

}
