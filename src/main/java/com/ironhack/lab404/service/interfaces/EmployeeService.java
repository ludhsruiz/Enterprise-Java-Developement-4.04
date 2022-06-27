package com.ironhack.lab404.service.interfaces;

import com.ironhack.lab404.enums.Status;
import com.ironhack.lab404.models.Employee;


public interface EmployeeService {

    // Create a route to add a new employee
    public Employee addNewEmployee(Employee employee);

    // Create a route to change an employee's status
    public void changeEmployeeStatus(Integer employeeId, Status status);

    // Create a route to update an employee's name
    public void changeEmployeeName(Integer employeeId, String name);

    // Create a route to update an employee's department
    public void changeEmployeeDepartment(Integer employeeId, String department);
}
