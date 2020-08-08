package behavior_mediator_pattern;

import java.util.ArrayList;

public class ChatMediatorImpl implements ChatMediator {
   private ArrayList<User> users;

   public ChatMediatorImpl() {
      this.users = new ArrayList<User>();
   }

   @Override
   public void addUser(User user) {
      this.users.add(user);
      System.out.println(user.nickName + " hat den Chatroom betreten.");
   }

   @Override
   public void removeUser(User user) {
      this.users.remove(user);
      System.out.println(user.nickName + " hat den Chatroom verlassen.");
   }

   @Override
   public void broadcast(String message, User user) {
      for (User u : this.users) {
         if (!u.equals(user)) {
            u.receiveMessage(message, user);
         }
      }
   }
}
