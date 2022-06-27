package com.ironhack.lab404.service.impl;
import com.ironhack.lab404.enums.Status;
import com.ironhack.lab404.models.Employee;
import com.ironhack.lab404.repository.EmployeeRepository;
import com.ironhack.lab404.service.interfaces.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Create a route to add a new employee
    public Employee addNewEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    // Create a route to change an employee's status
    public void changeEmployeeStatus(Integer employeeId, Status status) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()){
            employee.get().setStatus(status);
            employeeRepository.save(employee.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }

    // Create a route to update an employee's name
    public void changeEmployeeName(Integer employeeId, String name) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()){
            employee.get().setName(name);
            employeeRepository.save(employee.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }

    // Create a route to update an employee's department
    public void changeEmployeeDepartment(Integer employeeId, String department) {
        Optional<Employee> employee = employeeRepository.findById(employeeId);
        if (employee.isPresent()){
            employee.get().setDepartment(department);
            employeeRepository.save(employee.get());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found");
        }
    }
}
