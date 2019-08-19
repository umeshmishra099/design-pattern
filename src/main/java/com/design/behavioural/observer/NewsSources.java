package com.design.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsSources
{
  private String news;
  List<Channel> channels = new ArrayList<>();

  public void addObserver(Channel channel)
  {
    channels.add(channel);
  }

  public void removeObserver(Channel channel)
  {
    channels.remove(channel);
  }

  public void setNews(String news)
  {
    this.news = news;
    for (Channel channel : channels)
    {
      channel.update(news);
    }
  }
}
