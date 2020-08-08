package behavior_mediator_pattern;

public abstract class User {
   protected String nickName;
   protected ChatMediator mediator;

   public User(ChatMediator mediator, String nickName) {
      this.mediator = mediator;
      this.nickName = nickName;
   }

   public abstract void sendMessage(String message);

   public abstract void receiveMessage(String message, User sender);
}
