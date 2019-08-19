package com.design.creational.abstractfactory;

public class AbstractFactoryPattern
{
  public static void main(String[] args)
  {
    AbstractFactory<Shape> ShapeFactory = FactoryProvider.getFactory("Shape");
    Shape circle = ShapeFactory.create("Circle");
    circle.draw();
    Shape triangle = ShapeFactory.create("Triangle");
    triangle.draw();

    AbstractFactory<Animal> animalFactory = FactoryProvider.getFactory("Animal");
    Animal dog = animalFactory.create("Dog");
    dog.run();
    Animal cat = animalFactory.create("Cat");
    cat.run();
  }
}
