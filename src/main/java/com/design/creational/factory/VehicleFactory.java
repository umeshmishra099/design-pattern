package com.design.creational.factory;

public class VehicleFactory
{
  public static Vehicle createVehicle(String type)
  {
    if (type.equals("Bus"))
    {
      return new Bus();
    }
    else if (type.equals("Car"))
    {
      return new Car();
    }
    else if (type.equals("Bike"))
    {
      return new Bike();
    }
    return null;
  }
}
