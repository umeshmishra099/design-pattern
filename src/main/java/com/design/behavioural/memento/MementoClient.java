package com.design.behavioural.memento;

/*
What problems can the Memento design pattern solve?

1) The internal state of an object should be saved externally
 so that the object can be restored to this state later.
2) The object's encapsulation must not be violated.

What solution does the Memento design pattern describe?
Make an object (originator) itself responsible for

1) saving its internal state to a (memento) object and
2) restoring to a previous state from a (memento) object.

 */
public class MementoClient
{
  public static void main(String[] args)
  {

    FileWriter fileWriter = new FileWriter("moment.txt");
    fileWriter.write("This is memento design pattern");
    System.out.println("Initial content: " + fileWriter);
    FileMemento memento = fileWriter.createMemento();

    fileWriter.write("\n Adding more content in memento pattern");
    System.out.println("Updated content: " + fileWriter);

    fileWriter.restore(memento);
    System.out.println("Restored content: " + fileWriter);
  }
}
