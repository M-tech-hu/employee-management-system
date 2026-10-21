package com.example.Spring_boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Spring_boot.model.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
