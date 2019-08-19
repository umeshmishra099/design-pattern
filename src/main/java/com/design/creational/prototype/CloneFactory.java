package com.design.creational.prototype;

public class CloneFactory
{
  public static Vehicle makeCopy(Vehicle vehicle)
  {
    return vehicle.makeCopy();
  }
}
