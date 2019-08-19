package com.design.structural.adapter;

public class IPhones implements NonCShapeCharger
{
  @Override
  public void chargeNonCShape()
  {
    System.out.println("Charging using Non C Shape Charger");
  }
}
