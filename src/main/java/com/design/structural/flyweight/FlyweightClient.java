package com.design.structural.flyweight;

/*

What problems can the Flyweight design pattern solve?
1) Large numbers of objects should be supported efficiently.
2) Creating large numbers of objects should be avoided.


 */
public class FlyweightClient
{
  public static void main(String[] args)
  {
    Pen yellowThinPen1 = PenFactory.getThickPen("YELLOW");
    yellowThinPen1.draw("Hello World !!");

    Pen yellowThinPen2 = PenFactory.getThickPen("YELLOW");
    yellowThinPen2.draw("Hello World !!");

    Pen blueThinPen = PenFactory.getThickPen("BLUE");
    blueThinPen.draw("Hello World !!");
  }
}
