package com.design.creational.factorymethod;

import java.util.List;

public class TextParser implements Parser
{

  public TextParser()
  {
    System.out.println("Creating TEXT Parser");
  }

  public List<Record> parse()
  {
    System.out.println("Parsing TextParser records");
    return null;
  }
}
