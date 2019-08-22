package com.design.behavioural.state;

public class Shipped implements ParcelState
{
  @Override
  public void update(ParcelContext parcelContext)
  {
    System.out.println("Parcel Shipped");
    parcelContext.setCurrentState(new InTransit());
  }
}
