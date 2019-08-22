package com.design.behavioural.memento;

public class FileWriter
{
  private String fileName;
  private StringBuilder content;

  public FileWriter(String fileName)
  {
    this.fileName = fileName;
    this.content = new StringBuilder();
  }

  public void write(String content)
  {
    this.content.append(content);
  }

  public FileMemento createMemento()
  {
    return new FileMemento(fileName, content);
  }

  public void restore(FileMemento fileMemento)
  {
    this.fileName = fileMemento.getFileName();
    this.content = fileMemento.getContent();
  }

  @Override
  public String toString()
  {
    return "FileMemento{" +
            "fileName='" + fileName + '\'' +
            ", content=" + content.toString() +
            '}';
  }
}
