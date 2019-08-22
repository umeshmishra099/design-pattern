package com.design.behavioural.state;

public class Delivered implements ParcelState
{
  @Override
  public void update(ParcelContext parcelContext)
  {
    System.out.println("Parcel delivered");
  }
}
