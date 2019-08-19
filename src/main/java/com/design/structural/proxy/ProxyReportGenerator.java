package com.design.structural.proxy;

public class ProxyReportGenerator implements ReportGenerator
{
  private ReportGenerator reportGenerator;

  @Override
  public void generateReport()
  {
    if (reportGenerator == null)
    {
      reportGenerator = new RealReportGenerator();
    }
    reportGenerator.generateReport();
  }
}
