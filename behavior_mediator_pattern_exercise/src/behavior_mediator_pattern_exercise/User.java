package behavior_mediator_pattern_exercise;

abstract class User {
   protected String nickName;
   protected ChatMediator mediator;

   public User(ChatMediator mediator, String nickName) {
      this.nickName = nickName;
      this.mediator = mediator;
   }

   public abstract void sendToAll(String message);

   public abstract void sendTo(User receiver, String message);

   public abstract void receiveMessage(String message, User sender);
}
