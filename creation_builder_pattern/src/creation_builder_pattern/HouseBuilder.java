package creation_builder_pattern;

public abstract class HouseBuilder {

   public abstract void buildBasement();

   public abstract void buildMaterial();

   public abstract void buildRoof();

   public abstract void buildKitchen();

   public abstract House getHouse();

}
