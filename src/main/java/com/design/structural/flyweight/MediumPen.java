package com.design.structural.flyweight;

public class MediumPen implements Pen
{
  private BrushSize brushSize = BrushSize.MEDIUM;
  private String color;

  @Override
  public void setColor(String color)
  {
    this.color = color;
  }

  @Override
  public void draw(String content)
  {
    System.out.println("Drawing Medium content in color: " + color);
  }
}
