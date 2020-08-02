package creation_factoryMethod_pattern;

public class Program {

   public static void main(String[] args) {
      // logistic Software using trucks, ship and plains
      Logistics logisticSoftware = new StreetSeaFlightLogistics();
      logisticSoftware.manageTransportForCustomers(TransportType.ship);
      logisticSoftware.manageTransportForCustomers(TransportType.plane);
      logisticSoftware.manageTransportForCustomers(TransportType.truck);

      // logistic software using trucks and trains
      logisticSoftware = new TrainStreetLogistics();
      logisticSoftware.manageTransportForCustomers(TransportType.train);
      logisticSoftware.manageTransportForCustomers(TransportType.truck);
   }

}
