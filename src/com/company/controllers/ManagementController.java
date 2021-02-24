package com.company.controllers;

import com.company.entities.ManagementEmployees;
import com.company.repositories.interfaces.IManagementRep;

import java.util.List;

public class ManagementController {
    private final IManagementRep repo;

    public ManagementController(IManagementRep repo) {
        this.repo = repo;
    }

    public String getAllManagement(){
        List<ManagementEmployees> list = repo.getAllManagementEmployees();
        return list.toString();
    }
    public String getManagementByName(String name){
        List<ManagementEmployees> list = repo.getManagementEmployeeByName(name);
        return (list.size() == 0 ? "Employee was not found!" : list.toString());
    }
}
