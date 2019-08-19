package com.design.structural.flyweight;

public class ThinPen implements Pen
{
  private BrushSize brushSize = BrushSize.THIN;
  private String color;

  @Override
  public void setColor(String color)
  {
    this.color = color;
  }

  @Override
  public void draw(String content)
  {
    System.out.println("Drawing THIN content in color: " + color);
  }
}
