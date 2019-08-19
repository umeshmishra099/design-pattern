package com.design.creational.singleton;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton implements Serializable, Cloneable
{
  private static volatile Singleton singleInstance = null;

  private Singleton()
  {
    if (singleInstance != null)
    {
      throw new RuntimeException("Create using proper instance");
    }
    System.out.println("Creating...");
  }

  public static Singleton getInstance()
  {

    if (singleInstance == null)
    {
      synchronized (Singleton.class)
      {
        if (singleInstance == null)
        {
          singleInstance = new Singleton();
        }
      }
    }
    return singleInstance;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException
  {
    return singleInstance;
  }

  private Object readResolve() throws ObjectStreamException
  {
    return singleInstance;
  }
}

class TestClass
{
  public static void main(String[] args) throws Exception
  {

    Singleton instance1 = Singleton.getInstance();
    Singleton instance2 = Singleton.getInstance();

    System.out.println("Hashcode : instance1 : " + instance1.hashCode());
    System.out.println("Hashcode : instance2 : " + instance2.hashCode());

    //Reflection
    /*Class clazz = Class.forName("com.design.creational.singleton.Singleton");
    Constructor<Singleton> constructor = clazz.getDeclaredConstructor();
    constructor.setAccessible(true);
    Singleton reflection = constructor.newInstance();
    System.out.println("Hashcode : reflection : " + reflection.hashCode());*/

    //Serialization
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("instance.ser"));
    objectOutputStream.writeObject(instance2);

    ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("instance.ser"));
    Singleton serialization = (Singleton)objectInputStream.readObject();
    System.out.println("Hashcode : serialization : " + serialization.hashCode());

    //Clone
    Singleton clone = (Singleton)instance2.clone();
    System.out.println("Hashcode : clone : " + clone.hashCode());

    //MutipleThread
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    executorService.submit(TestClass::useSingleton);
    executorService.submit(TestClass::useSingleton);
    executorService.shutdown();

  }

  static void useSingleton()
  {
    Singleton singleton = Singleton.getInstance();
    System.out.println("singleton: " + singleton.hashCode());
  }
}
