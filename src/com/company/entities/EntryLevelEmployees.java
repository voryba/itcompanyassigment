package com.company.entities;

public class EntryLevelEmployees extends Employees{
    private String position;
    private String project;
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
    public String getProject() {
        return project;
    }
    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Entry Level Employee{" +
                "name ='" + super.getName() + '\'' +
                ", position ='" + position + '\'' +
                ", project ='" + project + '\'' +
                ", date of hire ='" + super.getHireDate() + '\'' +
                ", salary =" + super.getSalary() +
                ", group =" + GROUP +
                '}';
    }
}
