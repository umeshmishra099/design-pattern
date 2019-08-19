package com.design.creational.factorymethod;

public class XMLBatchProcessor extends BatchProcessor
{
  @Override
  public Parser createParser()
  {
    return new XMLParser();
  }
}
