package com.design.behavioural.chainofresponsibility;

/*
What problems can the Chain of Responsibility design pattern solve?
1) Coupling the sender of a request to its receiver should be avoided.
2) It should be possible that more than one receiver can handle a request.
 */

public class CORClient
{
  public static void main(String[] args)
  {
    Chain c1 = new PositiveProcessor();
    Chain c2 = new NegativeProcessor();
    Chain c3 = new ZeroProcessor();
    c1.setNext(c2);
    c2.setNext(c3);

    c1.process(-1);
    c1.process(2);
    c1.process(0);
    c1.process(12);
  }
}
