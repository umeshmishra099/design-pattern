package com.design.behavioural.iterator;

import java.util.List;

public class ChannelIteratorImpl implements ChannelIterator
{
  private List<Channel> channels;
  private int position;

  public ChannelIteratorImpl(List<Channel> channels)
  {
    this.channels = channels;
  }

  @Override
  public boolean hasNext()
  {
    if (channels.size() > position)
    {
      return true;
    }
    return false;
  }

  @Override
  public Channel next()
  {
    final Channel channel = channels.get(position);
    position = position + 1;
    return channel;
  }
}
