package behavior_memento_pattern;

public class Memento {
   private String typeOfTraining;

   public Memento(String typeOfTraining) {
      this.typeOfTraining = typeOfTraining;
   }

   public String getState() {
      return this.typeOfTraining;
   }
}
