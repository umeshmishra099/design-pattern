package com.design.structural.adapter;

public class AndriodPhones implements CShapeCharger
{
  @Override
  public void chargeCShape()
  {
    System.out.println("Charging using C Shape charger");
  }
}
