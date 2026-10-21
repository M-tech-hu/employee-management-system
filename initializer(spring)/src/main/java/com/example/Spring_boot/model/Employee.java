package com.example.Spring_boot.model;
import jakarta.persistence.*;

import javax.annotation.processing.Generated;
//import jakarta.persistence.Entity;

@Entity
//@Table(name = "dec")

public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    public Employee(double salary, String department, String name) {
        this.salary = salary;
        this.department = department;
        this.name = name;
    }
    public Employee(){

    }
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    private String department;
    private double salary;
}
