package com.design.behavioural.mediator;

public class ChatUser extends User
{

  public ChatUser(ChatControl chatControl, String user)
  {
    super(chatControl, user);
  }

  @Override
  public void send(String msg, String user)
  {
    System.out.println("Message send " + msg);
    getChatControl().sendMessage(msg, user);
  }

  @Override
  public void receive(String msg)
  {
    System.out.println("Message received " + msg);
  }
}
