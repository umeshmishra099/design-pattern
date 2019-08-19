package com.design.behavioural.chainofresponsibility;

public interface Chain
{
  void setNext(Chain chain);

  void process(int request);
}
