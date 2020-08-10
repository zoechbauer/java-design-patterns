package behavior_strategy_pattern_exercise;

import java.util.List;

public class Navigation {
   private NavigationStrategy selectedStrategy;
   private List<Route> routes;

   public Navigation(List<Route> routes) {
      this.routes = routes;
   }

   public void setNavigationStrategy(NavigationStrategy strategy) {
      this.selectedStrategy = strategy;
   }

   public void calculateRoute() {
      if (this.routes == null || this.routes.isEmpty()) {
         throw new RuntimeException("Es wurden keine Routen �bergeben!");
      }
      if (this.selectedStrategy == null) {
         throw new RuntimeException(
               "Es muss zuvor eine Navigations-Strategie (k�rzester Weg/geringste Zeit) ausgew�hlt werden!");
      }
      this.selectedStrategy.calculateRoute(routes);
   }

}
