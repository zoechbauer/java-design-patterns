package behavior_observer_pattern;

public class Program {

   public static void main(String[] args) {
      Person otto = new Person("Otto");
      Person anna = new Person("Anna");
      Person tom = new Person("Tom");

      SportNewsletter sn = new SportNewsletter(new Newsletter("WM 2020 Austragungsorte", "Inhalt..."));

      sn.subscribe(otto);
      sn.subscribe(tom);

      sn.setCurrentNewsletter(new Newsletter("WM 2020 wegen Corona verschoben ", "Inhalt..."));

      sn.unsubsribe(tom);
      sn.subscribe(anna);

      sn.setCurrentNewsletter(new Newsletter("WM 2020 Aktuelles zu Corona", "Inhalt..."));
   }
}

//Output Console
//Neuer Newsletter wird versendet: WM 2020 wegen Corona verschoben 
//Otto hat den neuen Newsletter 'WM 2020 wegen Corona verschoben ' erhalten.
//Tom hat den neuen Newsletter 'WM 2020 wegen Corona verschoben ' erhalten.
//
//Neuer Newsletter wird versendet: WM 2020 Aktuelles zu Corona
//Otto hat den neuen Newsletter 'WM 2020 Aktuelles zu Corona' erhalten.
//Anna hat den neuen Newsletter 'WM 2020 Aktuelles zu Corona' erhalten.