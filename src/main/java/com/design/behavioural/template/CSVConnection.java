package com.design.behavioural.template;

public class CSVConnection extends DatabaseTemplate
{
  @Override
  public void setDriversDetail()
  {
    System.out.println("CSV setDriversDetail");
  }

  @Override
  public void setConnectionDetails()
  {
    System.out.println("CSV setConnectionDetails");
  }

  @Override
  public void setData()
  {
    System.out.println("CSV setData");
  }

  @Override
  public void runQuery()
  {
    System.out.println("CSV runQuery");
  }
}
