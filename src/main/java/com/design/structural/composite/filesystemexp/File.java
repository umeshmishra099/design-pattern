package com.design.structural.composite.filesystemexp;

public class File implements AbstractFileSystem
{
  private String name;

  public File(String name)
  {
    this.name = name;
  }

  @Override
  public void list()
  {
    System.out.println("Listing file " + name);
  }

  @Override
  public void move()
  {
    System.out.println("Moving file " + name);
  }

  @Override
  public void copy()
  {
    System.out.println("Copying file " + name);
  }
}
