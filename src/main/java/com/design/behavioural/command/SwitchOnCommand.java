package com.design.behavioural.command;

public class SwitchOnCommand implements Command
{
  private final Light light;

  public SwitchOnCommand(Light light)
  {
    this.light = light;
  }

  public void execute()
  {
    light.turnOn();
  }
}
