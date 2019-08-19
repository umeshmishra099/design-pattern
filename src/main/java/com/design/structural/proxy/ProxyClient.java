package com.design.structural.proxy;

/*
What problems can the Proxy design pattern solve?
1) The access to an object should be controlled.
2) Additional functionality should be provided when accessing an object.

 */
public class ProxyClient
{
  public static void main(String[] args)
  {
    ReportGenerator realReportGenerator = new RealReportGenerator();
    realReportGenerator.generateReport();
    realReportGenerator = new RealReportGenerator();
    realReportGenerator.generateReport();

    ReportGenerator proxyReportGenerator = new ProxyReportGenerator();
    proxyReportGenerator.generateReport();
    proxyReportGenerator.generateReport();
  }
}
