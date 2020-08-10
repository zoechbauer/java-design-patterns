package behavior_strategy_pattern_exercise;

public class Route {
   private String name;
   private int timeInMinutes;
   private int distanceInMeter;

   public Route(String name, int timeInMinutes, int distanceInMeter) {
      this.name = name;
      this.timeInMinutes = timeInMinutes;
      this.distanceInMeter = distanceInMeter;
   }

   public String toString() {
      return String.format("Die Route '%s' beträgt %d Meter und kann in %d Minuten erreicht werden.", this.name,
            this.distanceInMeter, this.timeInMinutes);
   }

   public int getTimeInMinutes() {
      return timeInMinutes;
   }

   public int getDistanceInMeter() {
      return distanceInMeter;
   }

}
