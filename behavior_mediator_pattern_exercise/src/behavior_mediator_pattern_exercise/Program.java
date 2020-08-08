package behavior_mediator_pattern_exercise;

/**
 * Ein simples Chat Programm. Es können Nachrichten an alle oder an eine
 * bestimmte Person uebermittelt werden. Die Implementierung erfolgt mittels
 * Mediator Pattern
 */
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

      tom.sendTo(jerry, "Und was mache ich dann den ganzen Tag?");
      jerry.sendTo(tom, "Komm halt einfach mit!");

   }
}

// Output Console
//Alice hat folgende Nachricht an alle versendet: Kann mir jemand den Weg ins Wunderland zeigen?
//Tom hat von Alice folgende Nachricht erhalten: Kann mir jemand den Weg ins Wunderland zeigen?
//Jerry hat von Alice folgende Nachricht erhalten: Kann mir jemand den Weg ins Wunderland zeigen?
//Donald hat von Alice folgende Nachricht erhalten: Kann mir jemand den Weg ins Wunderland zeigen?
//
//Jerry hat folgende Nachricht an alle versendet: Ich möchte auch mit, wer noch?
//Tom hat von Jerry folgende Nachricht erhalten: Ich möchte auch mit, wer noch?
//Alice hat von Jerry folgende Nachricht erhalten: Ich möchte auch mit, wer noch?
//
//Tom hat an Jerry folgende Nachricht gesendet: Und was mache ich dann den ganzen Tag?
//
//Jerry hat an Tom folgende Nachricht gesendet: Komm halt einfach mit!
