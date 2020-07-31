package solid_interfaceSegregationPrinciple;

public class LuigisPizza implements Payment, Order {

   @Override
   public void takeTelephoneOrder() {
      // TODO Auto-generated method stub

   }

   @Override
   public void payCreditCard() {
      // TODO Auto-generated method stub

   }

   @Override
   public void payCash() {
      // TODO Auto-generated method stub

   }

   // a small restaurant will not use this interface method
   @Override
   public void paySmartphone() throws java.lang.UnsupportedOperationException {
      throw new java.lang.UnsupportedOperationException("Not supported yet.");

   }

}
