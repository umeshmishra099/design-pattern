package com.design.creational.factory;

public abstract class Vehicle
{
  public String maker;
  public String makeYear;

  public String getMaker()
  {
    return maker;
  }

  public void setMaker(String maker)
  {
    this.maker = maker;
  }

  public String getMakeYear()
  {
    return makeYear;
  }

  public void setMakeYear(String makeYear)
  {
    this.makeYear = makeYear;
  }
  public abstract void getVehicleDetail();
}
