package creation_builder_pattern;

public class StoneHouseBuilder extends HouseBuilder {
   private House house;

   public StoneHouseBuilder() {
      this.house = new House();
   }

   @Override
   public void buildBasement() {
      this.house.setBasement("Keller aus Beton");

   }

   @Override
   public void buildMaterial() {
      this.house.setMaterial("Mauern aus Stein");

   }

   @Override
   public void buildRoof() {
      this.house.setRoof("Schwarze Dachziegel");

   }

   @Override
   public void buildKitchen() {
      this.house.setKitchen("Granit Küche");

   }

   @Override
   public House getHouse() {
      return this.house;
   }

}
