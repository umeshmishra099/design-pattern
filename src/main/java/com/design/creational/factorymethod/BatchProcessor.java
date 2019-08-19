package com.design.creational.factorymethod;

import java.io.File;
import java.util.List;

public abstract class BatchProcessor
{
  public final void processBatch(String fileName)
  {
    openFile(fileName);
    Parser parser = createParser(); //create Parser
    List<Record> records = parser.parse();
    processRecords(records);
    writeSummary();
    closeFile();
  }

  public abstract Parser createParser();

  private void closeFile()
  {
    System.out.println("Closing file");
  }

  private void writeSummary()
  {
    System.out.println("Writing summary");
  }

  private void processRecords(List<Record> records)
  {
    System.out.println("processing Records");
  }

  private File openFile(String fileName)
  {
    System.out.println("opening File" + fileName);
    return null;
  }

}
