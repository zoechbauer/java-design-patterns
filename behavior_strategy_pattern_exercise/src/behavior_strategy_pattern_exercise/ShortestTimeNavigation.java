package behavior_strategy_pattern_exercise;

import java.util.List;

public class ShortestTimeNavigation implements NavigationStrategy {

   /**
    * sort routes by time and select first element
    */
   @Override
   public void calculateRoute(List<Route> routes) {
      System.out.println("\nStrategie: schnellste Route wurde gewählt");
      System.out.println("Die Route wird berechnet...");
      List<Route> routesSorted = sortByTime(routes);
      System.out.println("Schnellste Route: " + routesSorted.get(0));
   }

   List<Route> sortByTime(List<Route> routes) {
      routes.sort((a, b) -> a.getTimeInMinutes() - b.getTimeInMinutes());
      return routes;
   }

}
