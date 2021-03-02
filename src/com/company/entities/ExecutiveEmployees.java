package com.company.entities;

import com.company.entities.interfaces.INonProgrammerMember;

import java.time.LocalDate;

public class ExecutiveEmployees extends Employees implements INonProgrammerMember {
    private String executivePosition;
    private static final String GROUP = "Executive Employees";


    public ExecutiveEmployees(String name, LocalDate hireDate, int salary, String executivePosition) {
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
                ", salary =" + super.getSalary() + '\'' +
                ", group =" + GROUP  + '\''+
                '}';
    }

    @Override
    public String work() {
        return super.getName()+ " works in IT company as "+getExecutivePosition();
    }
    @Override
    public String salaryInfo() {
        return super.getName() + " get salary " + getSalary() + "$ per month.";
    }
    @Override
    public String manage() {
        return super.getName()+ " manage the department " + getExecutivePosition();
    }
    @Override
    public void setDoingDuration(int day) {
        EntryLevelEmployees.deadline=day;
        MainEmployees.deadline=day;
    }
    @Override
    public void setPenalty(int penalty) {
        EntryLevelEmployees.Penalty=penalty;
        MainEmployees.Penalty=penalty;
    }
    @Override
    public void setBonus(int bonus) {
        EntryLevelEmployees.Bonus=bonus;
        MainEmployees.Bonus=bonus;
    }

    public void ExecutiveInfo(){
        System.out.println(work());
        System.out.println(getSalary());
        System.out.println(manage());
    }
}
