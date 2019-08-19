package com.design.structural.composite.developerexp;

/*
  Composite pattern is a partitioning design pattern.
  What problems can the Composite design pattern solve?
1) A part-whole hierarchy should be represented so that clients can treat part and whole objects uniformly.
2) part-whole hierarchy should be represented as tree structure.


In file system folder and file should be treated as same because folder and file have lots of similar
functionality like moving or copying a folder and file, listing folder and file.

When to use:

Composite should be used when clients ignore the difference between compositions of objects and individual objects.
If programmers find that they are using multiple objects in the same way, and often have nearly identical code
 to handle each of them, then composite is a good choice. it is less complex in this situation to treat primitives and composites as homogeneous.

 */
public class CompositePattern
{
  public static void main(String[] args)
  {
    Employee developer = new Developer();
    Employee manager = new Manager();
    CompanyDirectory companyDirectory = new CompanyDirectory();
    companyDirectory.addEmployee(developer);
    companyDirectory.addEmployee(manager);
    companyDirectory.showDetails();
  }
}
