package com.design.creational.abstractfactory;

public class FactoryProvider
{
  public static AbstractFactory getFactory(String factoryType)
  {
    if (factoryType.equals("Animal"))
    {
      return new AnimalFactory();
    }
    else if (factoryType.equals("Shape"))
    {
      return new ShapeFactory();
    }
    return null;
  }
}
