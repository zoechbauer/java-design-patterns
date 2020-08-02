package creation_factoryMethod_pattern;

public abstract class Logistics {

   protected abstract Transport transportFactory(TransportType transportType);

   public void manageTransportForCustomers(TransportType transportType) {
      Transport transport = transportFactory(transportType);

      transport.collectProductsFromCustomer();
      transport.transportProducts();
   }

}
