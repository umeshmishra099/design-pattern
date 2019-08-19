package com.design.behavioural.visitor.credit;

import com.design.behavioural.visitor.offer.OfferVisitor;

public class SilverCreditCard implements CreditCard
{
  @Override
  public String getName()
  {
    return "Silver credit card";
  }

  @Override
  public void accept(OfferVisitor visitor)
  {
    visitor.visitSilver(this);
  }
}
