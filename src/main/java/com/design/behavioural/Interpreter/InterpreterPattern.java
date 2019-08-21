package com.design.behavioural.Interpreter;

/*
What problems can the Interpreter design pattern solve?

1) A grammar for a simple language should be defined
2) so that sentences in the language can be interpreted.
 */
public class InterpreterPattern
{
  public static void main(String[] args)
  {
    Expression expressionTrue = new TerminalExpression("TRUE");
    Expression expressionFalse = new TerminalExpression("FALSE");

    Expression expressionOR = new OrExpression(expressionTrue, expressionFalse);
    System.out.println(expressionOR.interpret("TRUE"));

    Expression expressionAND = new AndExpression(expressionTrue, expressionFalse);
    System.out.println(expressionAND.interpret("TRUE"));

    Expression expressionANDBothTrue = new AndExpression(expressionTrue, expressionTrue);
    System.out.println(expressionANDBothTrue.interpret("TRUE"));
  }
}
