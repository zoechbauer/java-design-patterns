package creation_builder_pattern;

public class WoodHouseBuilder extends HouseBuilder {
   private House house;

   public WoodHouseBuilder() {
      this.house = new House();
   }

   @Override
   public void buildBasement() {
      house.setBasement("Keller aus Beton");

   }

   @Override
   public void buildMaterial() {
      house.setMaterial("Material aus Holz");

   }

   @Override
   public void buildRoof() {
      house.setRoof("Schindeln");

   }

   @Override
   public void buildKitchen() {
      house.setKitchen("Bauernküche");
   }

   @Override
   public House getHouse() {
      return this.house;
   }

}
