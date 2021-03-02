package com.company.repositories.interfaces;

import com.company.entities.MainEmployees;

import java.util.List;

public interface IMainRep {
    List<MainEmployees> getAllMainEmployees();
    List<MainEmployees> getMainEmployeeByName(String name);
    List<MainEmployees> getMainEmployeeByProfession(String position);
}
