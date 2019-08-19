package com.design.structural.decorator;

public class CoffeeWithCream extends CoffeeDecorator
{
  public CoffeeWithCream(Coffee decoratedCoffee)
  {
    super(decoratedCoffee);
  }

  @Override
  public double getCost()
  {
    return super.getCost() + .5;
  }

  @Override
  public String getIngredients()
  {
    return super.getIngredients() + ", With Cream";
  }
}
