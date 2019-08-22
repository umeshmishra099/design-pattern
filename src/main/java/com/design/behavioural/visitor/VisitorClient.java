package com.design.behavioural.visitor;

import com.design.behavioural.visitor.credit.*;
import com.design.behavioural.visitor.offer.HotelVisitorOffer;

public class VisitorClient
{
  public static void main(String[] args)
  {
    BronzeCreditCard bronzeCreditCard = new BronzeCreditCard();
    SilverCreditCard silverCreditCard = new SilverCreditCard();
    GoldCreditCard goldCreditCard = new GoldCreditCard();

    HotelVisitorOffer hotelVisitorOffer = new HotelVisitorOffer();
    bronzeCreditCard.accept(hotelVisitorOffer);
    silverCreditCard.accept(hotelVisitorOffer);
    goldCreditCard.accept(hotelVisitorOffer);
  }
}
