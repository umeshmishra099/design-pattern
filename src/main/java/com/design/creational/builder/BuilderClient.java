package com.design.creational.builder;

import java.util.Date;

public class BuilderClient
{
  public static void main(String[] args)
  {
    Car car = new Car.Builder()
            .setMake("Ford")
            .setCarType("SUV")
            .setDom(new Date())
            .setDriveType("Manual")
            .build();
    System.out.println(car);
  }
}
