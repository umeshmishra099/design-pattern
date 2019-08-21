package com.design.behavioural.mediator;

public abstract class User
{
  private ChatControl chatControl;
  private String user;

  public User(ChatControl chatControl, String user)
  {
    this.chatControl = chatControl;
    this.user = user;
  }

  public abstract void send(String msg, String user);

  public abstract void receive(String msg);

  public ChatControl getChatControl()
  {
    return chatControl;
  }

  public String getUser()
  {
    return user;
  }
}
