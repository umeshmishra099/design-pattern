package com.design.behavioural.observer;

public class TheHindu implements Channel
{

  private String news;

  @Override
  public void update(String news)
  {
    this.news = news;
  }

  public String getNews()
  {
    return news;
  }
}
