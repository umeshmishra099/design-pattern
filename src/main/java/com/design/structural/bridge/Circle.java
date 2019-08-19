package com.design.structural.bridge;

public class Circle implements Shape
{
  private Color color;

  public Circle(Color color)
  {
    this.color = color;
  }

  @Override
  public void shapeType()
  {
    System.out.println("Circle shape with :" + color.colorType());
  }
}
