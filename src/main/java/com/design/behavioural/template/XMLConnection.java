package com.design.behavioural.template;

public class XMLConnection extends DatabaseTemplate
{
  @Override
  public void setDriversDetail()
  {
    System.out.println("XML setDriversDetail");
  }

  @Override
  public void setConnectionDetails()
  {
    System.out.println("XML setConnectionDetails");
  }

  @Override
  public void setData()
  {
    System.out.println("XML setData");
  }

  @Override
  public void runQuery()
  {
    System.out.println("XML runQuery");
  }
}
