package creation_builder_pattern;

public class Program {

   public static void main(String[] args) {
      CivilEngineer engineer;
      House house;

      // Build a wooden house
      HouseBuilder woodHouseBuilder = new WoodHouseBuilder();
      engineer = new CivilEngineer(woodHouseBuilder);

      engineer.constructHouse();

      house = engineer.getHouse();
      System.out.println(house);

      // Build a stone house
      HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
      engineer = new CivilEngineer(stoneHouseBuilder);

      engineer.constructHouse();

      house = engineer.getHouse();
      System.out.println(house);
   }

}
