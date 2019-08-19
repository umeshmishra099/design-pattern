package com.design.structural.composite.filesystemexp;

import java.util.ArrayList;
import java.util.List;

public class Directory implements AbstractFileSystem
{
  private String name;
  private List<File> files = new ArrayList<>();

  public Directory(String name)
  {
    this.name = name;
  }

  @Override
  public void list()
  {
    files.forEach(File::list);
  }

  @Override
  public void move()
  {
    files.forEach(File::move);
  }

  @Override
  public void copy()
  {
    files.forEach(File::copy);
  }

  public void add(File file)
  {
    files.add(file);
  }

}
