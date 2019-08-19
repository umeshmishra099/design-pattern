package com.design.behavioural.strategy;

public class CustomSort implements Strategy
{
  @Override
  public void sort()
  {
    System.out.println("Custom sort");
  }
}
