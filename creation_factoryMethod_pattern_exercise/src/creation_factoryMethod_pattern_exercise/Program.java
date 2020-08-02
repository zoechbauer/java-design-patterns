package creation_factoryMethod_pattern_exercise;

public class Program {

   public static void main(String[] args) {
      WarGame game = new TheLastWarrior();
      game.startGame();

      game = new TheTiredWarrior();
      game.startGame();

   }

//   Console Output
//   Spiel Start: 0 Punkte 
//   Attacke von Hammer-1 brachte 10 Punkte 
//   Abwehr mit Schild-1 kostete 3 Punkte 
//   Abwehr mit Schild-2 kostete 1 Punkte 
//   Spiel Ende: 6 Punkte 
//
//   Spiel Start: 0 Punkte 
//   Abwehr mit Schild-1 kostete 1 Punkte 
//   Attacke von Hammer-1 brachte 5 Punkte 
//   Abwehr mit Schild-2 kostete 7 Punkte 
//   Spiel Ende: -3 Punkte 

}
