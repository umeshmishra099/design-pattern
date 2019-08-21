package com.design.behavioural.iterator;

/*
What problems can the Iterator design pattern solve?
1) The elements of an aggregate object should be accessed
   and traversed without exposing its representation (data structures).
2) New traversal operations should be defined for an aggregate object without changing its interface.

What solution does the Iterator design pattern describe?
1) Define a separate (iterator) object that encapsulates accessing and traversing an aggregate object.
2) Clients use an iterator to access and traverse an aggregate without knowing its representation (data structures).
*/

public class IteratorClient
{
  public static void main(String[] args)
  {
    ChannelCollection channels = new ChannelCollectionImpl();
    channels.addChannel(new Channel("DD1"));
    channels.addChannel(new Channel("DD2"));
    channels.addChannel(new Channel("DDNEWS"));

    final ChannelIterator channelIterator = channels.iterator();
    while (channelIterator.hasNext())
    {
      Channel c = channelIterator.next();
      System.out.println(c.getName());
    }
  }

}
