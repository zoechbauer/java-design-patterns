package behavior_memento_pattern;

import java.util.ArrayList;

// Aufbewahrer der Mementos
public class Caretaker {
   private ArrayList<Memento> mementos;

   public Caretaker() {
      mementos = new ArrayList<>();
   }

   public void saveState(FitnessPlan fitnessplan) {
      Memento Memento = fitnessplan.saveStateToMemento();
      mementos.add(Memento);
   }

   public void restoreState(FitnessPlan fitnessPlan, int index) {
      Memento Memento = mementos.get(index);
      fitnessPlan.getStateFromMemento(Memento);
   }

}
