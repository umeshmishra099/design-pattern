package com.design.structural.facade;

/*
What problems can the Facade design pattern solve?

1) To make a complex subsystem easier to use, a simple interface should be provided for a set of interfaces in the subsystem.
2) The dependencies on a subsystem should be minimized.

The facade pattern is typically used when

1) a simple interface is required to access a complex system,
2) a system is very complex or difficult to understand,
3) an entry point is needed to each level of layered software, or
4) the abstractions and implementations of a subsystem are tightly coupled.
 */
public class FacadeClient
{
  public static void main(String[] args)
  {
    //Old way of Booking
    Booking flightBooking = new FlightBooking();
    flightBooking.book();
    Booking hotelBooking = new HotelBooking();
    hotelBooking.book();
    Booking transferBooking = new TransferBooking();
    transferBooking.book();

    // using facade
    TravelFacade travelFacade = new TravelFacade();
    travelFacade.book();
  }

}
