package com.design.structural.adapter;

public class NonCToCCharging implements CShapeCharger
{
  private NonCShapeCharger nonCShapeCharger;

  public NonCToCCharging(NonCShapeCharger nonCShapeCharger)
  {
    this.nonCShapeCharger = nonCShapeCharger;
  }

  @Override
  public void chargeCShape()
  {
    this.nonCShapeCharger.chargeNonCShape();
  }
}
