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
   public ChannelIterator createIterator() {
      ChannelIterator iterator = new ChannelIteratorNormal(channels);
      return iterator;
   }

}
