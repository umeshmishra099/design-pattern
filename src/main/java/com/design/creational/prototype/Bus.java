package com.design.creational.prototype;

public class Bus implements Vehicle
{

  @Override
  public Vehicle makeCopy()
  {
    Bus bus = null;
    try
    {
      bus = (Bus)super.clone();
    }
    catch (CloneNotSupportedException e)
    {
      e.printStackTrace();
    }
    return bus;
  }
}
