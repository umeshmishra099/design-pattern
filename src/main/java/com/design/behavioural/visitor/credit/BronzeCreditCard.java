package com.design.behavioural.visitor.credit;

import com.design.behavioural.visitor.offer.OfferVisitor;

public class BronzeCreditCard implements CreditCard
{

  @Override
  public String getName()
  {
    return "Bronze credit card";
  }

  @Override
  public void accept(OfferVisitor visitor)
  {
    visitor.visitBronze(this);
  }
}
