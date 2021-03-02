package com.company.controllers;

import com.company.entities.EntryLevelEmployees;
import com.company.repositories.interfaces.IEntryRep;

import java.util.List;

public class EntryLevelController {
    private final IEntryRep repo;

    public EntryLevelController(IEntryRep repo) {
        this.repo = repo;
    }

    public String getAllManagement(){
        List<EntryLevelEmployees> list = repo.getAllMainEmployees();
        return list.toString();
    }
    public String getManagementByName(String name){
        List<EntryLevelEmployees> list = repo.getMainEmployeeByName(name);
        return (list.size() == 0 ? "Employee was not found!" : list.toString());
    }
    public String getManagementByProfession(String position){
        List<EntryLevelEmployees> list = repo.getMainEmployeeByProfession(position);
        return (list.size() == 0 ? "Employees was not found!" : list.toString());
    }
}
