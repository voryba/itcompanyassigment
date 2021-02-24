package com.company.repositories.interfaces;

import com.company.entities.ManagementEmployees;

import java.util.List;

public interface IManagementRep {
    List<ManagementEmployees> getAllManagementEmployees();
    List<ManagementEmployees> getManagementEmployeeByName(String name);
}
