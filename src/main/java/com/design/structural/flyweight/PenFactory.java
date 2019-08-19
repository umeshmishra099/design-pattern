package com.design.structural.flyweight;

import java.util.WeakHashMap;

public class PenFactory
{
  private static final WeakHashMap<String, Pen> CACHE = new WeakHashMap<>();

  public static Pen getThickPen(String color)
  {
    String key = color + "-THICK";
    Pen pen = CACHE.get(key);
    if (pen != null)
    {
      return pen;
    }
    else
    {
      pen = new ThickPen();
      pen.setColor(color);
      CACHE.put(key, pen);
    }
    return pen;
  }

  public static Pen getThinPen(String color)
  {
    String key = color + "-THIN";

    Pen pen = CACHE.get(key);

    if (pen != null)
    {
      return pen;
    }
    else
    {
      pen = new ThinPen();
      pen.setColor(color);
      CACHE.put(key, pen);
    }
    return pen;
  }

  public static Pen getMediumPen(String color)
  {
    String key = color + "-MEDIUM";

    Pen pen = CACHE.get(key);

    if (pen != null)
    {
      return pen;
    }
    else
    {
      pen = new MediumPen();
      pen.setColor(color);
      CACHE.put(key, pen);
    }
    return pen;
  }
}
