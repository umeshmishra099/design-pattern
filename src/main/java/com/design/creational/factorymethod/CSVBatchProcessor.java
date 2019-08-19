package com.design.creational.factorymethod;

public class CSVBatchProcessor extends BatchProcessor
{
  @Override
  public Parser createParser()
  {
    return new CSVParser();
  }
}
