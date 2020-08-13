package creation_builder_pattern;

public class CivilEngineer {
   private HouseBuilder houseBuilder;

   public CivilEngineer(HouseBuilder houseBuilder) {
      this.houseBuilder = houseBuilder;
   }

   public void constructHouse() {
      houseBuilder.buildBasement();
      houseBuilder.buildMaterial();
      houseBuilder.buildRoof();
      houseBuilder.buildKitchen();
   }

   public House getHouse() {
      return houseBuilder.getHouse();
   }

}
