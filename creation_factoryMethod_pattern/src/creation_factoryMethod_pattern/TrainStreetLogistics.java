package creation_factoryMethod_pattern;

public class TrainStreetLogistics extends Logistics {

   @Override
   protected Transport transportFactory(TransportType transportType) {
      Transport transport = null;

      switch (transportType) {
      case truck:
         transport = new StreetTransport();
         break;

      case train:
         transport = new TrainTransport();
         break;

      default:
         System.err.println("Falsche Transportart: " + transportType);
      }
      return transport;
   }

}
