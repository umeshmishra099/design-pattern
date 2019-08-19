package com.design.behavioural.visitor.offer;

import com.design.behavioural.visitor.credit.*;

public interface OfferVisitor
{
  void visitBronze(BronzeCreditCard bronzeCreditCard);

  void visitSilver(SilverCreditCard silverCreditCard);

  void visitGold(GoldCreditCard goldCreditCard);
}
