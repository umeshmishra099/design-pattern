package com.design.creational.abstractfactory;

public interface AbstractFactory<T>
{
  T create(String type);
}
