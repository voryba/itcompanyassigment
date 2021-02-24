package com.company;

import com.company.data.PostgresDB;
import com.company.data.interfaces.IDB;
import com.company.repositories.ExecutiveRep;

public class Main {
    public static void main(String[] args) {
        // Сделать общую таблицу со списоком сотрудников и с общей информацией о компании
        IDB db = new PostgresDB();
        ExecutiveRep repo = new ExecutiveRep(db);
    }

}
