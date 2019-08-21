package com.design.behavioural.Interpreter;

public class TerminalExpression implements Expression
{
  private String data;

  public TerminalExpression(String data)
  {
    this.data = data;
  }

  @Override
  public boolean interpret(String value)
  {
    return value.contains(data);
  }
}
