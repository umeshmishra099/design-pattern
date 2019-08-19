package com.design.structural.composite.developerexp;

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee
{
  List<Employee> employees = new ArrayList<>();

  @Override
  public void showDetails()
  {
    employees.forEach(Employee::showDetails);
  }

  public void addEmployee(Employee employee)
  {
    employees.add(employee);
  }

  public void removeEmployee(Employee employee)
  {
    employees.remove(employee);
  }
}
