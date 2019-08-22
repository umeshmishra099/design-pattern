package com.design.behavioural.memento;

public class FileMemento
{
  private String fileName;
  private StringBuilder content;

  public FileMemento(String fileName, StringBuilder content)
  {
    this.fileName = fileName;
    this.content = new StringBuilder(content);
  }

  public String getFileName()
  {
    return fileName;
  }

  public StringBuilder getContent()
  {
    return content;
  }

}
