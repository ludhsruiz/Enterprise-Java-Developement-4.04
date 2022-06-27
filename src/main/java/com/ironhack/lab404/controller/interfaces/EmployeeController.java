package com.ironhack.lab404.controller.interfaces;

import com.ironhack.lab404.dto.DepartmentDto;
import com.ironhack.lab404.dto.NameDto;
import com.ironhack.lab404.dto.StatusDto;
import com.ironhack.lab404.models.Employee;


public interface EmployeeController {

    // Create a route to add a new employee
    public Employee addNewEmployee(Employee employee);

    // Create a route to change an employee's status
    public void changeEmployeeStatus(Integer employeeId, StatusDto status);

    // Create a route to update an employee's name
    public void changeEmployeeName(Integer employeeId, NameDto name);

    // Create a route to update an employee's department
    public void changeEmployeeDepartment(Integer employeeId, DepartmentDto department);

}


