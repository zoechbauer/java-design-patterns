package behavior_iterator_pattern;

public interface ChannelCollection {
   void addChannel(Channel channel);

   void removeChannel(Channel channel);

   ChannelIterator createIterator(ChannelIteratorType iteratorType);
}
