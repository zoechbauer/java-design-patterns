package behavior_iterator_pattern;

import java.util.ArrayList;

public class CarRadio implements ChannelCollection {
   private ArrayList<Channel> channels;

   public CarRadio() {
      this.channels = new ArrayList<>();
   }

   @Override
   public void addChannel(Channel channel) {
      this.channels.add(channel);
   }

   @Override
   public void removeChannel(Channel channel) {
      this.channels.remove(channel);
   }

   @Override
   public ChannelIterator createIterator(ChannelIteratorType iteratorType) {
      ChannelIterator iterator = null;
      switch (iteratorType) {
      case NORMAL:
         iterator = new ChannelIteratorNormal(channels);
         break;
      case SHUFFLE:
         iterator = new ChannelIteratorShuffle(channels);
         break;
      default:
         System.out.printf("Der Iterator '%s' wurde noch nicht implementiert!%n", iteratorType.name());
         break;
      }
      return iterator;
   }

}
