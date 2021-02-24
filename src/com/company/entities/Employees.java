package com.company.entities;

public abstract class Employees {
    private String name;
    private String hireDate;
    private int salary;

    public Employees(String name, String hireDate, int salary) {
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
    public String getHireDate() {
        return hireDate;
    }
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

}
