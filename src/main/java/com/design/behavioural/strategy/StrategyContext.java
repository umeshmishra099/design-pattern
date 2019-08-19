package com.design.behavioural.strategy;

public class StrategyContext
{
  private Strategy strategy;

  public StrategyContext(Strategy strategy)
  {
    this.strategy = strategy;
  }

  public void sort()
  {
    strategy.sort();
  }
}
