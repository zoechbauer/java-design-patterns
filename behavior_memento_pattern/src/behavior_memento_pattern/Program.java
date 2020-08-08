package behavior_memento_pattern;

public class Program {

   public static void main(String[] args) {
      Caretaker fitnessCaretaker = new Caretaker();

      FitnessPlan fitnessPlan = new FitnessPlan("Ausdauertraining");
      System.out.println(fitnessPlan);

      fitnessCaretaker.saveState(fitnessPlan);

      fitnessPlan.changeTraining("Krafttraining");
      System.out.println(fitnessPlan);

      fitnessCaretaker.saveState(fitnessPlan);

      fitnessPlan.changeTraining("Zirkeltraining");
      System.out.println(fitnessPlan);

      fitnessCaretaker.saveState(fitnessPlan);

      // restore momento
      System.out.println("Zurücksetzen auf Anfang");
      fitnessCaretaker.restoreState(fitnessPlan, 0);
      System.out.println(fitnessPlan);
   }
}

//Ausgabe Console
//Trainingsart: Ausdauertraining
//Trainingsart: Krafttraining
//Trainingsart: Zirkeltraining
//Zurücksetzen auf Anfang
//Trainingsart: Ausdauertraining
