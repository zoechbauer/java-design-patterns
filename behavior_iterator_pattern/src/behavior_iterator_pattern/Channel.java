package behavior_iterator_pattern;

public class Channel {
   private String name;
   private double frequency;

   public Channel(String name, double frequency) {
      this.name = name;
      this.frequency = frequency;
   }

   @Override
   public String toString() {
      return String.format("Du hörst gerade %s auf Frequenz %.2f Mhz", this.name, this.frequency);
   }

}
