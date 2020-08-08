package behavior_mediator_pattern_exercise;

public class UserImpl extends User {

   public UserImpl(ChatMediator mediator, String nickName) {
      super(mediator, nickName);
   }

   @Override
   public void sendToAll(String message) {
      System.out.printf("%n%s hat folgende Nachricht an alle versendet: %s%n", this.nickName, message);
      this.mediator.broadcast(message, this);
   }

   @Override
   public void receiveMessage(String message, User sender) {
      System.out.printf("%s hat von %s folgende Nachricht erhalten: %s%n", this.nickName, sender.nickName, message);
   }

   @Override
   public void sendTo(User receiver, String message) {
      System.out.printf("%n%s hat an %s folgende Nachricht gesendet: %s%n", this.nickName, receiver.nickName, message);

   }

}
