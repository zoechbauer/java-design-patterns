package creation_builder_pattern;

public class StoneHouseBuilder extends HouseBuilder {
   private House house;

   public StoneHouseBuilder() {
      house = new House();
   }

   @Override
   public void buildBasement() {
      house.setBasement("Keller aus Beton");

   }

   @Override
   public void buildMaterial() {
      house.setMaterial("Mauern aus Stein");

   }

   @Override
   public void buildRoof() {
      house.setRoof("Schwarze Dachziegel");

   }

   @Override
   public void buildKitchen() {
      house.setKitchen("Granit Küche");

   }

   @Override
   public House getHouse() {
      return house;
   }

}
