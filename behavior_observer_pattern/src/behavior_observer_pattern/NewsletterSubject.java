package behavior_observer_pattern;

import java.util.ArrayList;

public abstract class NewsletterSubject {
   private ArrayList<NewsletterObserver> observers = new ArrayList<>();

   public void subscribe(NewsletterObserver observer) {
      if (!this.observers.contains(observer)) {
         this.observers.add(observer);
      }
   }

   public void unsubsribe(NewsletterObserver observer) {
      if (this.observers.contains(observer)) {
         this.observers.remove(observer);
      }
   }

   public void sendNewsletter(Newsletter newsletter) {
      for (NewsletterObserver observer : this.observers) {
         observer.update(newsletter);
      }
   }
}
