package com;

import java.util.List;

public interface EmployeeDao {
public void addEmployee(Employee emp);
public Employee getEmployee(int empId);
public void updateEmployee(Employee emp);
public void deleteEmployee(int empId);
public List<Employee> getAllEmployee();
}
