package com.design.behavioural.iterator;

public interface ChannelCollection
{
  void addChannel(Channel channel);

  void removeChannel(Channel channel);

  ChannelIterator iterator();
}
