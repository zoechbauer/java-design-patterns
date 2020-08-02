package creation_factoryMethod_pattern;

public class StreetSeaFlightLogistics extends Logistics {

   @Override
   public Transport transportFactory(TransportType transportType) {
      Transport transport = null;

      switch (transportType) {
      case ship:
         transport = new SeaTransport();
         break;

      case plane:
         transport = new FlightTransport();
         break;

      case truck:
         transport = new StreetTransport();
         break;

      default:
         System.err.println("Falsche Transportart: " + transportType);
         return null;
      }

      return transport;
   }

}
