package com.design.structural.adapter;

public class CToNonCCharger implements NonCShapeCharger
{

  private CShapeCharger cShapeCharger;

  public CToNonCCharger(CShapeCharger cShapeCharger)
  {
    this.cShapeCharger = cShapeCharger;
  }

  @Override
  public void chargeNonCShape()
  {
    cShapeCharger.chargeCShape();
  }
}
