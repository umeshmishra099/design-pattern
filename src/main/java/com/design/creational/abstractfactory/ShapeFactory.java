package com.design.creational.abstractfactory;

public class ShapeFactory implements AbstractFactory<Shape>
{
  @Override
  public Shape create(String type)
  {
    if (type.equals("Circle"))
    {
      return new Circle();
    }
    else if (type.equals("Triangle"))
    {
      return new Triangle();
    }
    return null;
  }
}
