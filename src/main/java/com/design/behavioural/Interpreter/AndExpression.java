package com.design.behavioural.Interpreter;

public class AndExpression implements Expression
{
  private Expression left;
  private Expression right;

  public AndExpression(Expression left, Expression right)
  {
    this.left = left;
    this.right = right;
  }

  @Override
  public boolean interpret(String value)
  {
    return left.interpret(value) && right.interpret(value);
  }
}
