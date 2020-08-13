package behavior_observer_pattern;

public class SportNewsletter extends NewsletterSubject {
   private Newsletter currentNewsletter;

   public SportNewsletter(Newsletter newsletter) {
      currentNewsletter = newsletter;
   }

   public Newsletter getCurrentNewsletter() {
      return currentNewsletter;
   }

   public void setCurrentNewsletter(Newsletter newNewsletter) {
      currentNewsletter = newNewsletter;
      System.out.println("\nNeuer Newsletter wird versendet: " + currentNewsletter.getTopic());
      sendNewsletter(currentNewsletter);
   }

}
