package behavior_observer_pattern_exercise;

import java.util.ArrayList;

public abstract class JokeSubject {
   private ArrayList<JokeObserver> observers = new ArrayList<>();

   public void subscribe(JokeObserver observer) {
      if (!this.observers.contains(observer)) {
         this.observers.add(observer);
      }
   }

   public void unsubscribe(JokeObserver observer) {
      if (this.observers.contains(observer)) {
         this.observers.remove(observer);
      }
   }

   public void notify(String joke) {
      for (JokeObserver o : this.observers) {
         o.update(joke);
      }
   }

}
