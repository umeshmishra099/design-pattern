package com.design.creational.factory;

public class FactoryClient
{
  public static void main(String[] args)
  {
    Vehicle bus = VehicleFactory.createVehicle("Bus");
    bus.getVehicleDetail();
    Vehicle car = VehicleFactory.createVehicle("Car");
    car.getVehicleDetail();
    Vehicle bike = VehicleFactory.createVehicle("Bike");
    bike.getVehicleDetail();
  }
}