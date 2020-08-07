package behavior_iterator_pattern;

import java.util.ArrayList;
import java.util.Collections;

public class ChannelIteratorShuffle implements ChannelIterator {
   private ArrayList<Channel> channels;
   private ArrayList<Channel> channelsShuffled;
   private int currentPosition = 0;

   public ChannelIteratorShuffle(ArrayList<Channel> channels) {
      this.channels = channels;
      this.shuffle();
   }

   private void shuffle() {
      this.channelsShuffled = new ArrayList<>(this.channels);
      Collections.shuffle(channelsShuffled);
   }

   @Override
   public boolean hasNext() {
      if (this.currentPosition < this.channelsShuffled.size()) {
         return true;
      }
      return false;
   }

   @Override
   public Channel next() {
      return this.channelsShuffled.get(currentPosition++);
   }

}
