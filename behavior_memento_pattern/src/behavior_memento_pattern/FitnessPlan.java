package behavior_memento_pattern;

public class FitnessPlan {
   private String typeOfTraining;

   public FitnessPlan(String typeOfTraining) {
      this.typeOfTraining = typeOfTraining;
   }

   public void changeTraining(String typeOfTraining) {
      this.typeOfTraining = typeOfTraining;
   }

   public Memento saveStateToMemento() {
      return new Memento(this.typeOfTraining);
   }

   public void getStateFromMemento(Memento memento) {
      this.typeOfTraining = memento.getState();
   }

   @Override
   public String toString() {
      return "Trainingsart: " + this.typeOfTraining;
   }

}
