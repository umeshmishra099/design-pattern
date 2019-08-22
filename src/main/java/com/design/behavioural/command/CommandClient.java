package com.design.behavioural.command;

public class CommandClient
{
  public static void main(String[] args)
  {
    Light lamp = new Light();
    Command commandOn = lamp::turnOn;
    Command commandOff = lamp::turnOff;

    Switch switchTest = new Switch();
    switchTest.register("on", commandOn);
    switchTest.register("off", commandOff);
    switchTest.execute("on");
    switchTest.execute("off");
  }
}
