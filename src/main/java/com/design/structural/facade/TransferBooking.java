package com.design.structural.facade;

public class TransferBooking implements Booking
{
  @Override
  public void book()
  {
    System.out.println("Transfer Cab booked");
  }
}
