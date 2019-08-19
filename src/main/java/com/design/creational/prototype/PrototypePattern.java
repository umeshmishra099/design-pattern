package com.design.creational.prototype;

public class PrototypePattern
{
  public static void main(String[] args)
  {
    Bus bus = new Bus();
    Bus cloneBus = (Bus)CloneFactory.makeCopy(bus);
    System.out.println(bus.hashCode());
    System.out.println(cloneBus.hashCode());

    Car car = new Car();
    Car cloneCar = (Car)CloneFactory.makeCopy(car);
    System.out.println(car.hashCode());
    System.out.println(cloneCar.hashCode());
  }
}
