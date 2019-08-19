package com.design.structural.decorator;

/*
What problems can it solve:

1) Responsibilities should be added to (and removed from) an object dynamically at run-time.
2) A flexible alternative to subclassing for extending functionality should be provided.
 */
public class DecoratorClient
{
  public static void main(String[] args)
  {
    Coffee c = new SimpleCoffee();
    System.out.println(c.getCost() + " " + c.getIngredients());

    Coffee coffeeWithMilk = new CoffeeWithMilk(new SimpleCoffee());
    System.out.println(coffeeWithMilk.getCost() + " " + coffeeWithMilk.getIngredients());

    Coffee coffeeWithCream = new CoffeeWithCream(new SimpleCoffee());
    System.out.println(coffeeWithCream.getCost() + " " + coffeeWithCream.getIngredients());
  }
}
