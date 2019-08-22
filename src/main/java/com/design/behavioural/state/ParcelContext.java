package com.design.behavioural.state;

public class ParcelContext
{
  private ParcelState parcelState;

  public ParcelContext(ParcelState parcelState)
  {
    if (parcelState == null)
    {
      this.parcelState = new Shipped();
    }
  }

  public void setCurrentState(ParcelState parcelState)
  {
    this.parcelState = parcelState;
  }

  public void update()
  {
    this.parcelState.update(this);
  }
}
