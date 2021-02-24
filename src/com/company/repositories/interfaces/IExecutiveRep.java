package com.company.repositories.interfaces;


import com.company.entities.ExecutiveEmployees;

import java.util.List;

public interface IExecutiveRep {
    List<ExecutiveEmployees> getAllMainEmployees();
    List<ExecutiveEmployees> getMainEmployeeByName(String name);
    List<ExecutiveEmployees> getMainEmployeeByProfession(String position);
}
