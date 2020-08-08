package behavior_mediator_pattern;

public class Program {

   public static void main(String[] args) {
      ChatMediator chatroom = new ChatMediatorImpl();

      User alice = new UserImpl(chatroom, "Alice");
      User tom = new UserImpl(chatroom, "Tom");
      User jerry = new UserImpl(chatroom, "Jerry");
      User donald = new UserImpl(chatroom, "Donald");

      chatroom.addUser(tom);
      chatroom.addUser(jerry);
      chatroom.addUser(donald);
      chatroom.addUser(alice);

      alice.sendToAll("Kann mir jemand den Weg ins Wunderland zeigen?");

      chatroom.removeUser(donald);

      jerry.sendToAll("Ich möchte auch mit, wer noch?");
   }

}

//Console output
//Tom hat den Chatroom betreten.
//Jerry hat den Chatroom betreten.
//Donald hat den Chatroom betreten.
//Alice hat den Chatroom betreten.
//
//Alice hat folgende Nachricht gesendet: Kann mir jemand den Weg ins Wunderland zeigen?
//Tom hat eine Nachricht von Alice erhalten: Kann mir jemand den Weg ins Wunderland zeigen?
//Jerry hat eine Nachricht von Alice erhalten: Kann mir jemand den Weg ins Wunderland zeigen?
//Donald hat eine Nachricht von Alice erhalten: Kann mir jemand den Weg ins Wunderland zeigen?
//Donald hat den Chatroom verlassen.
//
//Jerry hat folgende Nachricht gesendet: Ich möchte auch mit, wer noch?
//Tom hat eine Nachricht von Jerry erhalten: Ich möchte auch mit, wer noch?
//Alice hat eine Nachricht von Jerry erhalten: Ich möchte auch mit, wer noch?
