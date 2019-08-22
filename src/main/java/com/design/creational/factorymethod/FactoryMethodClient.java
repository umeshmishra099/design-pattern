package com.design.creational.factorymethod;

public class FactoryMethodClient
{
  public static void main(String[] args)
  {
    BatchProcessor batchProcessor = creatBatchProcessor("text");
    batchProcessor.processBatch("TEXTFILE");

    batchProcessor = creatBatchProcessor("csv");
    batchProcessor.processBatch("CSVFILE");

    batchProcessor = creatBatchProcessor("xml");
    batchProcessor.processBatch("XMLFILE");

  }

  private static BatchProcessor creatBatchProcessor(String format)
  {
    switch (format)
    {
      case "text":
        return new TextBatchProcessor();
      case "csv":
        return new CSVBatchProcessor();
      case "xml":
        return new XMLBatchProcessor();
    }
    return null;
  }
}
