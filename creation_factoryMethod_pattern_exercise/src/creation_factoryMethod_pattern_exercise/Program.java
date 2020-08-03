package creation_factoryMethod_pattern_exercise;

public class Program {

   public static void main(String[] args) {
      System.out.println("Der letzte Krieger");
      ItemFactory lastWarrior = new TheLastWarrior();
      WarGame game = new WarGame(lastWarrior);
      game.start();

      System.out.println("Der müde Krieger");
      ItemFactory tiredWarrior = new TheTiredWarrior();
      game = new WarGame(tiredWarrior);
      game.start();

   }

//   Console Output
//   Der letzte Krieger
//   Spiel Start: 0 Punkte 
//   Attacke von Hammer-1 brachte 8 Punkte 
//   Attacke von Hammer-2 brachte 8 Punkte 
//   Abwehr mit Schild-1 kostete 7 Punkte 
//   Spiel Ende: 9 Punkte 
//
//   Der müde Krieger
//   Spiel Start: 0 Punkte 
//   Abwehr mit Schild-1 kostete 4 Punkte 
//   Abwehr mit Schild-2 kostete 2 Punkte 
//   Attacke von Hammer-1 brachte 5 Punkte 
//   Spiel Ende: -1 Punkte 

}
