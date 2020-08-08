package behavior_memento_pattern_exercise;

public class Caretaker {
   private Memento lastSaving;

   public void saveMemento(Book book) {
      lastSaving = book.setStateToMemento();
   }

   public void restoreMemento(Book book) {
      book.getStateFromMemento(this.lastSaving);
   }
}
