package com.design.behavioural.state;

public class InTransit implements ParcelState
{
  @Override
  public void update(ParcelContext parcelContext)
  {
    System.out.println("Parcel In transition");
    parcelContext.setCurrentState(new Delivered());
  }
}
