package creation_builder_pattern;

public class House {
   private String basement;
   private String material;
   private String roof;
   private String kitchen;

   public void setBasement(String basement) {
      this.basement = basement;
   }

   public void setMaterial(String material) {
      this.material = material;
   }

   public void setRoof(String roof) {
      this.roof = roof;
   }

   public void setKitchen(String kitchen) {
      this.kitchen = kitchen;
   }

   @Override
   public String toString() {
      return String.format("Haus%nKeller: %s%nBaumaterial: %s%nDach: %s%nKüche: %s%n", basement, material, roof,
            kitchen);
   }
}
