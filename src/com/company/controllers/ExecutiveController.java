package com.company.controllers;

import com.company.entities.ExecutiveEmployees;
import com.company.repositories.interfaces.IExecutiveRep;

import java.util.List;

public class ExecutiveController {
    private final IExecutiveRep repo;

    public ExecutiveController(IExecutiveRep repo) {
        this.repo = repo;
    }

    public String getAllManagement(){
        List<ExecutiveEmployees> list = repo.getAllMainEmployees();
        return list.toString();
    }
    public String getManagementByName(String name){
        List<ExecutiveEmployees> list = repo.getMainEmployeeByName(name);
        return (list.size() == 0 ? "Employee was not found!" : list.toString());
    }
    public String getManagementByProfession(String position){
        List<ExecutiveEmployees> list = repo.getMainEmployeeByProfession(position);
        return (list.size() == 0 ? "Employees was not found!" : list.toString());
    }
}
