package com.design.creational.singleton;

public enum EnumSingleton
{
  SINGLETON;

  public String getConfiguration(){
    return "Test";
  }

  static class TestIng {
    public static void main(String[] args)
    {
      EnumSingleton singleton = EnumSingleton.SINGLETON;
    }
  }
}
