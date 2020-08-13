package behavior_strategy_pattern_exercise;

import java.util.List;

public class Navigation {
   private NavigationStrategy selectedStrategy;
   private List<Route> routes;

   public Navigation(List<Route> routes) {
      this.routes = routes;
   }

   public void setNavigationStrategy(NavigationStrategy strategy) {
      selectedStrategy = strategy;
   }

   public void calculateRoute() {
      if (routes == null || routes.isEmpty()) {
         throw new RuntimeException("Es wurden keine Routen �bergeben!");
      }
      if (selectedStrategy == null) {
         throw new RuntimeException(
               "Es muss zuvor eine Navigations-Strategie (k�rzester Weg/geringste Zeit) ausgew�hlt werden!");
      }
      selectedStrategy.calculateRoute(routes);
   }

}
