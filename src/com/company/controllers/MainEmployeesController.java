package com.company.controllers;

import com.company.entities.MainEmployees;
import com.company.repositories.interfaces.IMainRep;

import java.util.List;

public class MainEmployeesController {
    private final IMainRep repo;

    public MainEmployeesController(IMainRep repo) {
        this.repo = repo;
    }

    public String getAllManagement(){
        List<MainEmployees> list = repo.getAllMainEmployees();
        return list.toString();
    }
    public String getManagementByName(String name){
        List<MainEmployees> list = repo.getMainEmployeeByName(name);
        return (list.size() == 0 ? "Employee was not found!" : list.toString());
    }
    public String getManagementByProfession(String position){
        List<MainEmployees> list = repo.getMainEmployeeByProfession(position);
        return (list.size() == 0 ? "Employees was not found!" : list.toString());
    }
}
