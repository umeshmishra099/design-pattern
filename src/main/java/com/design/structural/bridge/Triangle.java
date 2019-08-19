package com.design.structural.bridge;

public class Triangle implements Shape
{
  private Color color;

  public Triangle(Color color)
  {
    this.color = color;
  }

  @Override
  public void shapeType()
  {
    System.out.println("Triangle with color :" + color.colorType());
  }
}
