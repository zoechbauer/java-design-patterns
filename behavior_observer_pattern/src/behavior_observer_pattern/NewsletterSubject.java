package behavior_observer_pattern;

import java.util.ArrayList;

public abstract class NewsletterSubject {
   private ArrayList<NewsletterObserver> observers = new ArrayList<>();

   public void subscribe(NewsletterObserver observer) {
      if (!observers.contains(observer)) {
         observers.add(observer);
      }
   }

   public void unsubsribe(NewsletterObserver observer) {
      if (observers.contains(observer)) {
         observers.remove(observer);
      }
   }

   public void sendNewsletter(Newsletter newsletter) {
      for (NewsletterObserver observer : observers) {
         observer.update(newsletter);
      }
   }
}
