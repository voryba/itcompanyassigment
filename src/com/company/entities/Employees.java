package com.company.entities;

import java.time.LocalDate;

public abstract class Employees {
    private String name;
    private LocalDate hireDate;
    private int salary;

    public Employees(String name, LocalDate hireDate, int salary) {
        setName(name);
        setHireDate(hireDate);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
