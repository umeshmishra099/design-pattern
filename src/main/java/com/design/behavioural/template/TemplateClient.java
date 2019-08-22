package com.design.behavioural.template;

public class TemplateClient
{
  public static void main(String[] args)
  {
    DatabaseTemplate csvConnection = new CSVConnection();
    csvConnection.connect();
    System.out.println("-----------------------------------------");
    DatabaseTemplate xmlConnection = new XMLConnection();
    xmlConnection.connect();
  }
}
