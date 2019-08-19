package com.design.behavioural.visitor.offer;

import com.design.behavioural.visitor.credit.*;

public class GasOfferVisitor implements OfferVisitor
{
  @Override
  public void visitBronze(BronzeCreditCard bronzeCreditCard)
  {
    System.out.println("Gas cash back for bronze credit card");
  }

  @Override
  public void visitSilver(SilverCreditCard silverCreditCard)
  {
    System.out.println("Gas cash back for silver credit card");
  }

  @Override
  public void visitGold(GoldCreditCard goldCreditCard)
  {
    System.out.println("Gas cash back for gold credit card");
  }
}
