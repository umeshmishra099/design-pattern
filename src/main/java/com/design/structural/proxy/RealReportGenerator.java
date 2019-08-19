package com.design.structural.proxy;

public class RealReportGenerator implements ReportGenerator
{
  @Override
  public void generateReport()
  {
    System.out.println("Real report generated");
  }

}
