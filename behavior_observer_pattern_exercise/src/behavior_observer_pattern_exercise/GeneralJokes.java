package behavior_observer_pattern_exercise;

import java.util.Arrays;
import java.util.List;

public class GeneralJokes extends JokeSubject {
   // jokes from tutorial
   // http://openbook.rheinwerk-verlag.de/javainsel9/javainsel_10_002.htm#mjc7ffdeb540e30917defcbcab81cc06b4
   private final List<String> jokes = Arrays.asList("Sorry, aber du siehst so aus, wie ich mich fühle.",
         "Eine Null kann ein bestehendes Problem verzehnfachen.", "Wer zuletzt lacht, hat es nicht eher begriffen.",
         "Wer zuletzt lacht, stirbt wenigstens fröhlich.",
         "Unsere Luft hat einen Vorteil: Man sieht, was man einatmet.");

   private String newJoke;
   private int currentJokeNumber = 0;

   public String getNewJoke() {
      return newJoke;
   }

   public void setNewJoke() {
      setRandomJokeNumber();
      newJoke = jokes.get(currentJokeNumber);
      System.out.println("\nNeuer Witz: " + newJoke);
      notify(newJoke);
   }

   private void setRandomJokeNumber() {
      int randomNumber = 0;
      do {
         randomNumber = (int) (Math.random() * jokes.size());
      } while (randomNumber == currentJokeNumber);
      currentJokeNumber = randomNumber;
   }
}
