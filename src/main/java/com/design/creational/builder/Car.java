package com.design.creational.builder;

import java.util.Date;

public class Car
{
  private String make;
  private Date dom;
  private String carType;
  private String driveType;

  private Car(String make, Date dom, String carType, String driveType)
  {
    this.make = make;
    this.dom = dom;
    this.carType = carType;
    this.driveType = driveType;
  }

  @Override
  public String toString()
  {
    return "Car{" +
            "make='" + make + '\'' +
            ", dom=" + dom +
            ", carType='" + carType + '\'' +
            ", driveType='" + driveType + '\'' +
            '}';
  }

  public static class Builder
  {
    private String make;
    private Date dom;
    private String carType;
    private String driveType;

    public Builder setMake(String make)
    {
      this.make = make;
      return this;
    }

    public Builder setDom(Date dom)
    {
      this.dom = dom;
      return this;
    }

    public Builder setCarType(String carType)
    {
      this.carType = carType;
      return this;
    }

    public Builder setDriveType(String driveType)
    {
      this.driveType = driveType;
      return this;
    }

    public Car build()
    {
      return new Car(this.make, this.dom, this.carType, this.driveType);
    }
  }

}
