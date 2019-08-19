package com.design.structural.adapter;

/*
* The adapter design pattern solves problems like:
1) How can a class be reused that does not have an interface that a client requires?
2) How can classes that have incompatible interfaces work together?
3) How can an alternative interface be provided for a class?*/
public class AdapterPattern
{
  public static void main(String[] args)
  {
    AndriodPhones andriodPhones = new AndriodPhones();
    IPhones iPhones = new IPhones();

    andriodPhones.chargeCShape();
    iPhones.chargeNonCShape();

    NonCToCCharging nonCToCCharging = new NonCToCCharging(iPhones);
    nonCToCCharging.chargeCShape();

    CToNonCCharger cToNonCCharger = new CToNonCCharger(andriodPhones);
    cToNonCCharger.chargeNonCShape();
  }
}
