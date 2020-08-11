package behavior_state_pattern;

public class Program {

   public static void main(String[] args) {
      AmphibiusVehicle vehicle = new AmphibiusVehicle();
      vehicle.accelerate();
      vehicle.getSlower();

      System.out.println();

      vehicle.switchToBoatState();
      vehicle.accelerate();
      vehicle.getSlower();
   }
}

//Output Console
//Das Fahrzeug mittels Motor und R�dern beschleunigen...
//Das Fahrzeug mittels Bremsen abbremsen...
//
//Das Fahrzeuge verh�lt sich wie ein Boot...
//Das Fahrzeug mittels Motor und Schiffsschraube beschleunigen...
//Das Fahrzeug mittels Verstellen der Schiffsschraube abbremsen...
