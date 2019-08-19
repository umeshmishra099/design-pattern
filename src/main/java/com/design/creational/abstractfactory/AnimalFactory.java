package com.design.creational.abstractfactory;

public class AnimalFactory implements AbstractFactory<Animal>
{
  @Override
  public Animal create(String type)
  {
    if (type.equals("Dog"))
    {
      return new Dog();
    }
    else if (type.equals("Cat"))
    {
      return new Cat();
    }
    return null;
  }
}
