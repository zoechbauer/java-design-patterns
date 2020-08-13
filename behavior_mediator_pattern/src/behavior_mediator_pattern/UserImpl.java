package behavior_mediator_pattern;

public class UserImpl extends User {

   public UserImpl(ChatMediator mediator, String userName) {
      super(mediator, userName);
   }

   @Override
   public void sendToAll(String message) {
      System.out.printf("%n%s hat folgende Nachricht gesendet: %s%n", nickName, message);
      mediator.broadcast(message, this);
   }

   @Override
   public void receiveMessage(String message, User sender) {
      System.out.printf("%s hat eine Nachricht von %s erhalten: %s%n", nickName, sender.nickName, message);
   }

}
