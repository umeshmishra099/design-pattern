package com.design.behavioural.visitor.offer;

import com.design.behavioural.visitor.credit.*;

public class HotelVisitorOffer implements OfferVisitor
{
  @Override
  public void visitBronze(BronzeCreditCard bronzeCreditCard)
  {
    System.out.println("Hotel cash back for bronze credit card");
  }

  @Override
  public void visitSilver(SilverCreditCard silverCreditCard)
  {
    System.out.println("Hotel cash back for silver credit card");
  }

  @Override
  public void visitGold(GoldCreditCard goldCreditCard)
  {
    System.out.println("Hotel cash back for gold credit card");
  }
}
