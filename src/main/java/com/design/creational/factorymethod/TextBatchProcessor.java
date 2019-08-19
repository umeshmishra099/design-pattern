package com.design.creational.factorymethod;

public class TextBatchProcessor extends BatchProcessor
{
  @Override
  public Parser createParser()
  {
    return new TextParser();
  }
}
