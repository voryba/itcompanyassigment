package com.company.entities;

public class ManagementEmployees extends Employees{
    private String managementPosition;
    private static final String GROUP = "Management Employees";

    public ManagementEmployees(String name, String hireDate, int salary, String managementPosition) {
        super(name, hireDate, salary);
        setManagementPosition(managementPosition);
    }

    public String getManagementPosition() {
        return managementPosition;
    }
    public void setManagementPosition(String managementPosition) {
        this.managementPosition = managementPosition;
    }

    @Override
    public String toString() {
        return "Management{" +
                "name ='" + super.getName() + '\'' +
                ", position ='" + managementPosition + '\'' +
                ", date of hire ='" + super.getHireDate() + '\'' +
                ", salary =" + super.getSalary() +
                ", group =" + GROUP +
                '}';
    }
}
