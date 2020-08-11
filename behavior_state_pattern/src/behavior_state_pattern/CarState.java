package behavior_state_pattern;

public class CarState extends State {

   private AmphibiusVehicle vehicle;

   public CarState(AmphibiusVehicle vehicle) {
      this.vehicle = vehicle;
   }

   @Override
   void accelerate() {
      System.out.println("Das Fahrzeug mittels Motor und Rädern beschleunigen...");
   }

   @Override
   void getSlower() {
      System.out.println("Das Fahrzeug mittels Bremsen abbremsen...");
   }

}
