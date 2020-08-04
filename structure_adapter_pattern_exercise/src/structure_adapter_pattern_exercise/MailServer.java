package structure_adapter_pattern_exercise;

public interface MailServer {

   public void connectAndSendMail(String emailAddress, String content, String receiverName);

}
