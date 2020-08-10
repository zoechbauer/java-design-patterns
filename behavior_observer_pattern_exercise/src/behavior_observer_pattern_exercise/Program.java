package behavior_observer_pattern_exercise;

public class Program {

   public static void main(String[] args) {
      Person otto = new Person("Otto");
      Person anna = new Person("Anna");
      Person susi = new Person("Susi");

      GeneralJokes jokes = new GeneralJokes();

      jokes.subscribe(otto);
      jokes.subscribe(susi);

      jokes.setNewJoke();

      jokes.unsubscribe(otto);
      jokes.subscribe(anna);

      jokes.setNewJoke();
   }
}

//Output Console
//Neuer Witz: Wer zuletzt lacht, hat es nicht eher begriffen.
//Otto lacht über folgenden Witz: 
//   Wer zuletzt lacht, hat es nicht eher begriffen.
//Susi lacht über folgenden Witz: 
//   Wer zuletzt lacht, hat es nicht eher begriffen.
//
//Neuer Witz: Eine Null kann ein bestehendes Problem verzehnfachen.
//Susi lacht über folgenden Witz: 
//   Eine Null kann ein bestehendes Problem verzehnfachen.
//Anna lacht über folgenden Witz: 
//   Eine Null kann ein bestehendes Problem verzehnfachen.
