package behavior_state_pattern;

public class AmphibiusVehicle {
   private CarState car;
   private BoatState boat;
   private State currentState;

   public AmphibiusVehicle() {
      this.car = new CarState(this);
      this.boat = new BoatState(this);
      this.currentState = car;
   }

   public void switchToCarState() {
      this.currentState = car;
      System.out.println("Das Fahrzeuge verhält sich wie ein Auto...");
   }

   public void switchToBoatState() {
      this.currentState = boat;
      System.out.println("Das Fahrzeuge verhält sich wie ein Boot...");
   }

   public void accelerate() {
      this.currentState.accelerate();
   }

   public void getSlower() {
      this.currentState.getSlower();
   }

}
