package com.design.structural.facade;

public class TravelFacade implements Booking
{
  @Override
  public void book()
  {
    Booking flightBooking = new FlightBooking();
    flightBooking.book();
    Booking hotelBooking = new HotelBooking();
    hotelBooking.book();
    Booking transferBooking = new TransferBooking();
    transferBooking.book();
  }
}
