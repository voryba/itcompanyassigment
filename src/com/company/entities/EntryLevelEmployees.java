package com.company.entities;

import com.company.entities.interfaces.IProgrammerMember;

import java.time.LocalDate;

public class EntryLevelEmployees extends Employees implements IProgrammerMember {
    private String position;
    private String project;
    private static final String GROUP = "Entry Level Employees";
    public static int deadline;
    public static int Bonus;
    public static int Penalty;
    private int doTime;
    private int Salary;


    public EntryLevelEmployees(String name, LocalDate hireDate, int salary, String position, String project) {
        super(name, hireDate, salary);
        setPosition(position);
        setProject(project);
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
                "name = '" + super.getName() + '\'' +
                ", position = '" + position + '\'' +
                ", project = '" + project + '\'' +
                ", date of hire = '" + super.getHireDate() + '\'' +
                ", salary = " + super.getSalary() + '\'' +
                ", group = " + GROUP  + '\''+
                '}';
    }

    @Override
    public String work() {
        return super.getName() + " works in IT company as " + getPosition();
    }
    @Override
    public String salaryInfo() {
        return super.getName() + " get salary " + getSalary() + "$ per month.";
    }
    @Override
    public String programs() {
        return super.getName() + " programs in " + GROUP + " department";
    }

    @Override
    public int get_doing_duration() {
        return deadline;
    }
    @Override
    public int getBonus() {
        return Bonus;
    }
    @Override
    public int getPenalty() {
        return Penalty;
    }
    public String checking() {
        if (deadline < doTime)
            return "He got bonus in "+getBonus()+"$ for early done.";

        else
            return "He got penalty in "+getPenalty()+"$ for late";

    }
    public void EntryProgrammerInfo(){
        System.out.println(work());
        System.out.println(programs());
        System.out.println(getSalary());
        System.out.println(checking());
    }
}
