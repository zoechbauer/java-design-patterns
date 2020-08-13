package behavior_mediator_pattern_exercise;

import java.util.ArrayList;

public class ChatMediatorImpl implements ChatMediator {
   private ArrayList<User> users;

   public ChatMediatorImpl() {
      users = new ArrayList<>();
   }

   @Override
   public void addUser(User user) {
      users.add(user);
   }

   @Override
   public void removeUser(User user) {
      users.remove(user);
   }

   @Override
   public void broadcast(String message, User sender) {
      for (User user : users) {
         if (!user.equals(sender)) {
            user.receiveMessage(message, sender);
         }
      }
   }

   @Override
   public void sendTo(String message, User sender, User receiver) {
      receiver.receiveMessage(message, sender);
   }

}
