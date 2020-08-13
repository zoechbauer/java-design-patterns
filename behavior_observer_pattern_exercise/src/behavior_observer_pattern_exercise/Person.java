package behavior_observer_pattern_exercise;

public class Person implements JokeObserver {
   private String name;
   private String currentJoke;

   public Person(String name) {
      this.name = name;
   }

   @Override
   public void update(String joke) {
      currentJoke = joke;
      System.out.printf("%s lacht �ber folgenden Witz: %n   %s%n", name, currentJoke);
   }

}
