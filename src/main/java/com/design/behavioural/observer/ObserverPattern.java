package com.design.behavioural.observer;

public class ObserverPattern
{
  public static void main(String[] args)
  {
    NewsSources newsSources = new NewsSources();
    IndianExpress indianExpress = new IndianExpress();
    TheHindu theHindu = new TheHindu();

    //newsSources.addObserver(indianExpress);
    newsSources.addObserver(theHindu);

    newsSources.setNews("Flood in Pune");
    System.out.println(theHindu.getNews());
    System.out.println(indianExpress.getNews());

  }
}
