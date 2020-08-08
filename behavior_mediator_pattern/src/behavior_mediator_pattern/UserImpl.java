package behavior_mediator_pattern;

public class UserImpl extends User {

   public UserImpl(ChatMediator mediator, String userName) {
      super(mediator, userName);
   }

   @Override
   public void sendMessage(String message) {
      System.out.printf("%n%s hat folgende Nachricht gesendet: %s%n", this.nickName, message);
      this.mediator.broadcast(message, this);
   }

   @Override
   public void receiveMessage(String message, User sender) {
      if (!sender.nickName.equals(this.nickName)) {
         System.out.printf("%s hat eine Nachricht von %s erhalten: %s%n", this.nickName, sender.nickName, message);
      }
   }

}
