package com.company.entities;

public class EntryLevelEmployees extends Employees{
    private String position;
    private static final String GROUP = "Entry Level Employees";

    public EntryLevelEmployees(String name, String hireDate, int salary, String position) {
        super(name, hireDate, salary);
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "EntryLevelEmployees{" +
                "name ='" + super.getName() + '\'' +
                ", position ='" + position + '\'' +
                ", date of hire ='" + super.getHireDate() + '\'' +
                ", salary =" + super.getSalary() +
                ", group =" + GROUP +
                '}';
    }
}
