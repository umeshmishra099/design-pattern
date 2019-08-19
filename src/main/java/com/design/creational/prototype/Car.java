package com.design.creational.prototype;

public class Car implements Vehicle
{
  @Override
  public Vehicle makeCopy()
  {
    Car car = null;
    try
    {
      car = (Car)super.clone();
    }
    catch (CloneNotSupportedException e)
    {
      e.printStackTrace();
    }
    return car;
  }
}
