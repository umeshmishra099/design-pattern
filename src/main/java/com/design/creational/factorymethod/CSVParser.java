package com.design.creational.factorymethod;

import java.util.List;

public class CSVParser implements Parser
{
  public CSVParser()
  {
    System.out.println("Creating CSV Parser");
  }

  @Override
  public List<Record> parse()
  {
    System.out.println("Parsing CSV records");
    return null;
  }
}
