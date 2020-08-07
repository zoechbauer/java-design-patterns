package behavior_iterator_pattern;

public class Program {

   public static void main(String[] args) {
      ChannelCollection radio = new CarRadio();
      radio.addChannel(new Channel("Bayern 3", 97.3));
      radio.addChannel(new Channel("Arabella", 96.7));
      radio.addChannel(new Channel("Life Radio", 100.5));
      radio.addChannel(new Channel("Hit Radio", 88.1));

      ChannelIterator normalIterator = radio.createIterator();

      while (normalIterator.hasNext()) {
         Channel channel = normalIterator.next();
         System.out.println(channel);
      }
   }

}
