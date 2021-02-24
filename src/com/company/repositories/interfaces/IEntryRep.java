package com.company.repositories.interfaces;


import com.company.entities.EntryLevelEmployees;

import java.util.List;

public interface IEntryRep {
    List<EntryLevelEmployees> getAllMainEmployees();
    List<EntryLevelEmployees> getMainEmployeeByName(String name);
    List<EntryLevelEmployees> getMainEmployeeByProfession(String position);
}
