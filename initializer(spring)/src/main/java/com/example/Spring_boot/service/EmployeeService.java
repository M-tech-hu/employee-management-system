package com.example.Spring_boot.service;

import com.example.Spring_boot.model.Employee;
import com.example.Spring_boot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Employee ById
    public Employee getEmployeeById(Long id) {

        Optional<Employee> opt = employeeRepository.findById(id);

        return opt.orElse(null);

    }

    // UPDATE
    public Employee updateEmployee(Long id, Employee employeeDetails) {

        Employee employee = getEmployeeById(id);

        employee.setName(employeeDetails.getName());
        employee.setDepartment(employeeDetails.getDepartment());
        employee.setSalary(employeeDetails.getSalary());

        return employeeRepository.save(employee);
    }

    // DELETE
    public void deleteEmployee(Long id) {

        Employee employee = getEmployeeById(id);

        employeeRepository.delete(employee);
    }
}
