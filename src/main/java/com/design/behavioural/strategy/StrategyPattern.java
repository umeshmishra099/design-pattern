package com.design.behavioural.strategy;

public class StrategyPattern
{
  public static void main(String[] args)
  {
    StrategyContext strategyContext = new StrategyContext(new BubbleSort());
    strategyContext.sort();
    strategyContext = new StrategyContext(new MergeSort());
    strategyContext.sort();
    strategyContext = new StrategyContext(new CustomSort());
    strategyContext.sort();
  }
}
