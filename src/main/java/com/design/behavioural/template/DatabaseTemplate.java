package com.design.behavioural.template;

public abstract class DatabaseTemplate
{
  final void connect()
  {
    setDriversDetail();
    setConnectionDetails();
    setData();
    runQuery();
  }

  public abstract void setDriversDetail();

  public abstract void setConnectionDetails();

  public abstract void setData();

  public abstract void runQuery();
}
