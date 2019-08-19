package com.design.behavioural.command;

public class CloseCommand implements Command
{
  @Override
  public void execute()
  {
    System.out.println("Close command");
  }
}
