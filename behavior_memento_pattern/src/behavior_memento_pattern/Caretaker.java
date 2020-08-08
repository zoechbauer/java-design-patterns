package behavior_memento_pattern;

import java.util.ArrayList;

// Aufbewahrer der Mementos
public class Caretaker {
   private ArrayList<Memento> mementos;

   public Caretaker() {
      this.mementos = new ArrayList<>();
   }

   public void saveState(FitnessPlan fitnessplan) {
      Memento Memento = fitnessplan.saveStateToMemento();
      this.mementos.add(Memento);
   }

   public void restoreState(FitnessPlan fitnessPlan, int index) {
      Memento Memento = this.mementos.get(index);
      fitnessPlan.getStateFromMemento(Memento);
   }

}
