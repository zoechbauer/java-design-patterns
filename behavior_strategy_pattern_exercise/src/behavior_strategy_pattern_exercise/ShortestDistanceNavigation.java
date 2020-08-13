package behavior_strategy_pattern_exercise;

import java.util.List;

public class ShortestDistanceNavigation implements NavigationStrategy {

   /**
    * sort routes by distance and select first element
    */
   @Override
   public void calculateRoute(List<Route> routes) {
      System.out.println("\nStrategie: kürzeste Route wurde gewählt");
      System.out.println("Die Route wird berechnet...");
      List<Route> routesSorted = sortByDistance(routes);
      System.out.println("Kürzeste Route: " + routesSorted.get(0));
   }

   private List<Route> sortByDistance(List<Route> routes) {
      routes.sort((a, b) -> a.getDistanceInMeter() - b.getDistanceInMeter());
      return routes;
   }

}
