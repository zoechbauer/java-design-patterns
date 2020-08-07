package behavior_iterator_pattern;

public class Program {

   public static void main(String[] args) {
      ChannelCollection radio = new CarRadio();
      radio.addChannel(new Channel("Bayern 3", 97.3));
      radio.addChannel(new Channel("Arabella", 96.7));
      radio.addChannel(new Channel("Life Radio", 100.5));
      radio.addChannel(new Channel("Hit Radio", 88.1));

      System.out.println("Normaler Iterator");
      ChannelIterator normalIterator = radio.createIterator(ChannelIteratorType.NORMAL);
      while (normalIterator.hasNext()) {
         Channel channel = normalIterator.next();
         System.out.println(channel);
      }

      System.out.println("\nZufälliger Iterator");
      ChannelIterator shuffleIterator = radio.createIterator(ChannelIteratorType.SHUFFLE);
      while (shuffleIterator.hasNext()) {
         Channel channel = shuffleIterator.next();
         System.out.println(channel);
      }

      System.out.println("\nGenre Iterator");
      ChannelIterator genreIterator = radio.createIterator(ChannelIteratorType.GENRE);
      while (shuffleIterator.hasNext()) {
         Channel channel = shuffleIterator.next();
         System.out.println(channel);
      }
   }

}

//Console Output
//Normaler Iterator
//Du hörst gerade Bayern 3 auf Frequenz 97,30 Mhz
//Du hörst gerade Arabella auf Frequenz 96,70 Mhz
//Du hörst gerade Life Radio auf Frequenz 100,50 Mhz
//Du hörst gerade Hit Radio auf Frequenz 88,10 Mhz
//
//Zufälliger Iterator
//Du hörst gerade Life Radio auf Frequenz 100,50 Mhz
//Du hörst gerade Bayern 3 auf Frequenz 97,30 Mhz
//Du hörst gerade Arabella auf Frequenz 96,70 Mhz
//Du hörst gerade Hit Radio auf Frequenz 88,10 Mhz
//
//Genre Iterator
//Der Iterator 'GENRE' wurde noch nicht implementiert!
