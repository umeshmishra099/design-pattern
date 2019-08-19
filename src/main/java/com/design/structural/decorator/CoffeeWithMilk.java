package com.design.structural.decorator;

public class CoffeeWithMilk extends CoffeeDecorator
{
  public CoffeeWithMilk(Coffee decoratedCoffee)
  {
    super(decoratedCoffee);
  }

  @Override
  public double getCost()
  {
    return super.getCost() + .2;
  }

  @Override
  public String getIngredients()
  {
    return super.getIngredients() + ", Milk";
  }
}
