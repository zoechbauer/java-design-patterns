package behavior_mediator_pattern;

public interface ChatMediator {
   void addUser(User user);

   void removeUser(User user);

   void broadcast(String message, User user);
}
