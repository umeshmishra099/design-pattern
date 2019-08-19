package com.design.creational.factorymethod;

import java.util.List;

public class XMLParser implements Parser
{
  public XMLParser()
  {
    System.out.println("Creating XML Parser");
  }

  @Override
  public List<Record> parse()
  {
    System.out.println("Parsing XML records");
    return null;
  }
}
