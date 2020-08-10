package behavior_strategy_pattern_exercise;

import java.util.Arrays;
import java.util.List;

/**
 * Simple Navigation Program - generate and print routes - print route with
 * shortest distance - print route with shortest time
 * 
 * @author hansz
 *
 */
public class Program {

   public static void main(String[] args) {
      // generate & print routes
      List<Route> routes = Arrays.asList(new Route("Route-1", 10, 1000), new Route("Route-2", 9, 900),
            new Route("Route-3", 8, 1100), new Route("Route-4", 11, 1400));

      System.out.println("Folgende Routen sind verfügbar:");
      for (Route route : routes) {
         System.out.println(route);
      }

      // search route with shortes time and shortest distance
      Navigation nav = new Navigation(routes);

      nav.setNavigationStrategy(new ShortestDistanceNavigation());
      nav.calculateRoute();

      nav.setNavigationStrategy(new ShortestTimeNavigation());
      nav.calculateRoute();
   }

}

//Output Console
//Folgende Routen sind verfügbar:
//Die Route 'Route-1' beträgt 1000 Meter und kann in 10 Minuten erreicht werden.
//Die Route 'Route-2' beträgt 900 Meter und kann in 9 Minuten erreicht werden.
//Die Route 'Route-3' beträgt 1100 Meter und kann in 8 Minuten erreicht werden.
//Die Route 'Route-4' beträgt 1400 Meter und kann in 11 Minuten erreicht werden.
//
//Strategie: kürzeste Route wurde gewählt
//Die Route wird berechnet...
//Kürzeste Route: Die Route 'Route-2' beträgt 900 Meter und kann in 9 Minuten erreicht werden.
//
//Strategie: schnellste Route wurde gewählt
//Die Route wird berechnet...
//Schnellste Route: Die Route 'Route-3' beträgt 1100 Meter und kann in 8 Minuten erreicht werden.
