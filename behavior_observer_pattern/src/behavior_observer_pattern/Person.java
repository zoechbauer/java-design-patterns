package behavior_observer_pattern;

public class Person implements NewsletterObserver {
   private String name;
   private Newsletter currentNewsletter;

   public Person(String name) {
      this.name = name;
   }

   @Override
   public void update(Newsletter newsletter) {
      this.currentNewsletter = newsletter;
      System.out.printf("%s hat den neuen Newsletter '%s' erhalten.%n", this.name, this.currentNewsletter.getTopic());
   }

}
