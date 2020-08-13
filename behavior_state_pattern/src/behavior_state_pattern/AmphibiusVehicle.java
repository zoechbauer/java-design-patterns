package behavior_state_pattern;

public class AmphibiusVehicle {
   private CarState car;
   private BoatState boat;
   private State currentState;

   public AmphibiusVehicle() {
      car = new CarState(this);
      boat = new BoatState(this);
      currentState = car;
   }

   public void switchToCarState() {
      currentState = car;
      System.out.println("Das Fahrzeuge verhält sich wie ein Auto...");
   }

   public void switchToBoatState() {
      currentState = boat;
      System.out.println("Das Fahrzeuge verhält sich wie ein Boot...");
   }

   public void accelerate() {
      currentState.accelerate();
   }

   public void getSlower() {
      currentState.getSlower();
   }

}
