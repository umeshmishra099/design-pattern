package com.design.behavioural.command;

public class SwitchOffCommand implements Command
{
  private final Light light;

  public SwitchOffCommand(Light light)
  {
    this.light = light;
  }

  public void execute()
  {
    light.turnOff();
  }
}
