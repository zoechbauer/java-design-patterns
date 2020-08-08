package behavior_mediator_pattern_exercise;

public interface ChatMediator {
   void addUser(User user);

   void removeUser(User user);

   void broadcast(String message, User sender);

   void sendTo(String message, User sender, User receiver);
}
