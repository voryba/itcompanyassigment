package com.company;

import com.company.controllers.*;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.CompanyRepository;

public class Main {
    public static void main(String[] args) {
        IDB db = new PostgresDB();
        // Uncomment to check code

//        <-- Company Total cost -->
//        CompanyRepository repo = new CompanyRepository(db);
//        CompanyController controller = new CompanyController(repo);
//        System.out.println(controller.getTotalCost());




//        <-- Entry level state employees -->
//        EntryLevelRepository entryRep = new EntryLevelRepository(db);
//        EntryLevelController controller = new EntryLevelController(entryRep);
//        System.out.println(controller.getAllManagement());
//        System.out.println(controller.getManagementByName("Lil Peep"));
//        System.out.println(controller.getManagementByProfession("Junior dev."));
//      ---------------------------------------------------------------------------
//        EntryLevelEmployees example = new EntryLevelEmployees("Yerkhan", Date.valueOf("2022-03-15").toLocalDate(), 200000,"Junior dev.","Android app.");
//        example.EntryProgrammerInfo();



        // <-- Main Level employees -->
//        MainRepository mainRep = new MainRepository(db);
//        MainEmployeesController controller = new MainEmployeesController(mainRep);
//        System.out.println(controller.getAllManagement());
//        System.out.println(controller.getManagementByName("XXX Tentacion"));
//        System.out.println(controller.getManagementByProfession("Middle dev."));
//        ---------------------------------------------------------------------------
//        MainEmployees example = new MainEmployees("Yerkhan", Date.valueOf("2022-03-15").toLocalDate(), 200000,"Junior dev.","Android app.");
//        example.MainProgrammerInfo();



        // <-- Executive level employees -->
//        ExecutiveRep executiveRep = new ExecutiveRep(db);
//        ExecutiveController controller = new ExecutiveController(executiveRep);
//        System.out.println(controller.getAllManagement());
//        System.out.println(controller.getManagementByName("Lil Pump"));
//        System.out.println(controller.getManagementByProfession("CTO"));
//        ---------------------------------------------------------------------------
//        ExecutiveEmployees example = new ExecutiveEmployees("Yerkhan Sabyrov", Date.valueOf("2022-03-15").toLocalDate(), 200000, "CTO");
//        example.ExecutiveInfo();



        // <-- Management -->
//        ManagementRepository repo = new ManagementRepository(db);
//        ManagementController controller = new ManagementController(repo);
//        System.out.println(controller.getAllManagement());
//        System.out.println(controller.getManagementByName("Asap Rocky"));
    }

}
