package com.design.behavioural.mediator;

/*
What problems can the Mediator design pattern solve?
1) Tight coupling between a set of interacting objects should be avoided.
2) It should be possible to change the interaction between a set of objects independently.

What solution does the Mediator design pattern describe?
1) Define a separate (mediator) object that encapsulates the interaction between a set of objects.
2) Objects delegate their interaction to a mediator object instead of interacting with each other directly.

 */

public class MediatorClient
{
  public static void main(String[] args)
  {
    ChatRoom chatRoom = new ChatRoom();
    User user1 = new ChatUser(chatRoom, "1");
    User user2 = new ChatUser(chatRoom, "2");
    User user3 = new ChatUser(chatRoom, "3");
    User user4 = new ChatUser(chatRoom, "4");

    chatRoom.addUser(user1);
    chatRoom.addUser(user2);
    chatRoom.addUser(user3);
    chatRoom.addUser(user4);
    user1.send("Hello User1", "1");
    user2.send("Hello User2", "2");
  }
}
