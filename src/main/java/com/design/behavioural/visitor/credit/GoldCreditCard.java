package com.design.behavioural.visitor.credit;

import com.design.behavioural.visitor.offer.OfferVisitor;

public class GoldCreditCard implements CreditCard
{
  @Override
  public String getName()
  {
    return "Gold credit card";
  }

  @Override
  public void accept(OfferVisitor visitor)
  {
    visitor.visitGold(this);
  }
}
