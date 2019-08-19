package com.design.behavioural.command;

public class OpenCommand implements Command
{
  @Override
  public void execute()
  {
    System.out.println("Open File");
  }
}
