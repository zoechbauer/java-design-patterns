package behavior_state_pattern;

public class BoatState extends State {

   private AmphibiusVehicle vehicle;

   public BoatState(AmphibiusVehicle vehicle) {
      this.vehicle = vehicle;
   }

   @Override
   void accelerate() {
      System.out.println("Das Fahrzeug mittels Motor und Schiffsschraube beschleunigen...");
   }

   @Override
   void getSlower() {
      System.out.println("Das Fahrzeug mittels Verstellen der Schiffsschraube abbremsen...");
   }

}
