package behavior_iterator_pattern;

import java.util.ArrayList;
import java.util.Collections;

public class ChannelIteratorShuffle implements ChannelIterator {
   private ArrayList<Channel> channels;
   private ArrayList<Channel> channelsShuffled;
   private int currentPosition = 0;

   public ChannelIteratorShuffle(ArrayList<Channel> channels) {
      this.channels = channels;
      shuffle();
   }

   private void shuffle() {
      channelsShuffled = new ArrayList<>(channels);
      Collections.shuffle(channelsShuffled);
   }

   @Override
   public boolean hasNext() {
      if (currentPosition < channelsShuffled.size()) {
         return true;
      }
      return false;
   }

   @Override
   public Channel next() {
      return channelsShuffled.get(currentPosition++);
   }

}
