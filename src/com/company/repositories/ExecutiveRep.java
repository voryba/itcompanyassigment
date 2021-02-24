package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.ExecutiveEmployees;
import com.company.entities.MainEmployees;
import com.company.repositories.interfaces.IExecutiveRep;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ExecutiveRep implements IExecutiveRep {
    private final IDB db;

    public ExecutiveRep(IDB db) {
        this.db = db;
    }

    @Override
    public List<ExecutiveEmployees> getAllMainEmployees() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="select * from executive";
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            List<ExecutiveEmployees> list = new LinkedList<ExecutiveEmployees>();
            while (rs.next()){
                ExecutiveEmployees executiveEmployees = new ExecutiveEmployees(rs.getString("name"),
                        rs.getDate("hiredate").toLocalDate(),
                        rs.getInt("salary"),
                        rs.getString("position"));
                list.add(executiveEmployees);
            }
            return list;
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
    public List<ExecutiveEmployees> getMainEmployeeByName(String name) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="select * from executive where name=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, name);

            ResultSet rs = st.executeQuery();
            List<ExecutiveEmployees> list = new LinkedList<ExecutiveEmployees>();
            while (rs.next()){
                ExecutiveEmployees executiveEmployees = new ExecutiveEmployees(rs.getString("name"),
                        rs.getDate("hiredate").toLocalDate(),
                        rs.getInt("salary"),
                        rs.getString("position"));
                list.add(executiveEmployees);
            }
            return list;
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
    public List<ExecutiveEmployees> getMainEmployeeByProfession(String position) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="select * from executive where position=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, position);

            ResultSet rs = st.executeQuery();
            List<ExecutiveEmployees> list = new LinkedList<ExecutiveEmployees>();
            while (rs.next()){
                ExecutiveEmployees executiveEmployees = new ExecutiveEmployees(rs.getString("name"),
                        rs.getDate("hiredate").toLocalDate(),
                        rs.getInt("salary"),
                        rs.getString("position"));
                list.add(executiveEmployees);
            }
            return list;
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
