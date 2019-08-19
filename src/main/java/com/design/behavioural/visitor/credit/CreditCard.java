package com.design.behavioural.visitor.credit;

import com.design.behavioural.visitor.offer.OfferVisitor;

public interface CreditCard
{
  String getName();

  void accept(OfferVisitor visitor);
}
