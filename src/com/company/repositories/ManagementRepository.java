package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.ManagementEmployees;
import com.company.repositories.interfaces.IManagementRep;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ManagementRepository implements IManagementRep {
    private final IDB db;

    public ManagementRepository(IDB db) {
        this.db = db;
    }

    @Override
    public List<ManagementEmployees> getAllManagementEmployees() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="select * from management";
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            List<ManagementEmployees> managementEmployeesList = new LinkedList<ManagementEmployees>();
            while (rs.next()){
                ManagementEmployees managementEmployees = new ManagementEmployees(rs.getString("name"),
                                                                    rs.getDate("hireDate").toLocalDate(),
                                                                    rs.getInt("salary"),
                                                                    rs.getString("position"));
                managementEmployeesList.add(managementEmployees);
            }
            return managementEmployeesList;
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<ManagementEmployees> getManagementEmployeeByName(String name) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="select * from management where name=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, name);

            ResultSet rs = st.executeQuery();
            List<ManagementEmployees> managementEmployeesList = new LinkedList<ManagementEmployees>();
            while (rs.next()){
                ManagementEmployees managementEmployees = new ManagementEmployees(rs.getString("name"),
                        rs.getDate("hiredate").toLocalDate(),
                        rs.getInt("salary"),
                        rs.getString("position"));
                managementEmployeesList.add(managementEmployees);
            }
            return managementEmployeesList;
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return null;
    }
}
