package com.design.structural.bridge;

/*
What problems can the Bridge design pattern solve?
1) An abstraction and its implementation should be defined and extended independently from each other.
2) A compile-time binding between an abstraction and its implementation should be avoided so that an implementation can be selected at run-time.
*/
public class BridgeClient
{
  public static void main(String[] args)
  {
    Shape blueCircle = new Circle(new BlueColor());
    blueCircle.shapeType();
    Shape redCircle = new Circle(new RedColor());
    redCircle.shapeType();
    Shape blueTriangle = new Triangle(new BlueColor());
    blueTriangle.shapeType();
    Shape redTriangle = new Triangle(new RedColor());
    redTriangle.shapeType();
  }
}
