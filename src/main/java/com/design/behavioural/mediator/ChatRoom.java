package com.design.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChatRoom implements ChatControl
{
  private List<User> users = new ArrayList<>();

  @Override
  public void sendMessage(String message, String user)
  {
    List<User> collect = users.stream().filter(x -> x.getUser().equals(user)).collect(Collectors.toList());
    collect.forEach(user1 -> user1.receive(message));
  }

  @Override
  public void addUser(User user)
  {
    users.add(user);
  }
}
