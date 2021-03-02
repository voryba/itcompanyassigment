package com.company;

import com.company.controllers.EntryLevelController;
import com.company.controllers.ExecutiveController;
import com.company.controllers.MainEmployeesController;
import com.company.controllers.ManagementController;
import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.EntryLevelRepository;
import com.company.repositories.ExecutiveRep;
import com.company.repositories.MainRepository;
import com.company.repositories.ManagementRepository;

public class Main {
    public static void main(String[] args) {
        IDB db = new PostgresDB();
        // Uncomment to check code

//         Entry level state employees
//        EntryLevelRepository entryRep = new EntryLevelRepository(db);
//        EntryLevelController controller = new EntryLevelController(entryRep);
//        System.out.println(controller.getAllManagement());
//        System.out.println(controller.getManagementByName("Lil Peep"));
//        System.out.println(controller.getManagementByProfession("Junior dev."));

        // Main Level employees
//        MainRepository mainRep = new MainRepository(db);
//        MainEmployeesController controller = new MainEmployeesController(mainRep);
//        System.out.println(controller.getAllManagement());
//        System.out.println(controller.getManagementByName("XXX Tentacion"));
//        System.out.println(controller.getManagementByProfession("Middle dev."));

        // Executive level employees
//        ExecutiveRep executiveRep = new ExecutiveRep(db);
//        ExecutiveController controller = new ExecutiveController(executiveRep);
//        System.out.println(controller.getAllManagement());
//        System.out.println(controller.getManagementByName("Lil Pump"));
//        System.out.println(controller.getManagementByProfession("CTO"));

        // Management
//        ManagementRepository repo = new ManagementRepository(db);
//        ManagementController controller = new ManagementController(repo);
//        System.out.println(controller.getAllManagement());
//        System.out.println(controller.getManagementByName("Asap Rocky"));
    }

}
