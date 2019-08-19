package com.design.behavioural.chainofresponsibility;

public class ZeroProcessor implements Chain
{
  private Chain nextInChain;

  @Override
  public void setNext(Chain chain)
  {
    this.nextInChain = chain;
  }

  @Override
  public void process(int request)
  {
    if (request == 0)
    {
      System.out.println("ZeroProcessor : " + request);
    }
    else
    {
      nextInChain.process(request);
    }
  }
}
