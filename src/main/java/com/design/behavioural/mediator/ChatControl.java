package com.design.behavioural.mediator;

public interface ChatControl
{
  void sendMessage(String message, String user);

  void addUser(User user);
}
