package com.company.entities;

public class ExecutiveEmployees extends Employees{
    private String executivePosition;
    private static final String GROUP = "Executive Employees";

    public ExecutiveEmployees(String name, String hireDate, int salary, String executivePosition) {
        super(name, hireDate, salary);
        setExecutivePosition(executivePosition);
    }

    public String getExecutivePosition() {
        return executivePosition;
    }
    public void setExecutivePosition(String executivePosition) {
        this.executivePosition = executivePosition;
    }

    @Override
    public String toString() {
        return "Executive employee{" +
                "name ='" + super.getName() + '\'' +
                ", position ='" + executivePosition + '\'' +
                ", date of hire ='" + super.getHireDate() + '\'' +
                ", salary =" + super.getSalary() +
                ", group =" + GROUP +
                '}';
    }
}
