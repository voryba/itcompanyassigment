package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.EntryLevelEmployees;
import com.company.repositories.interfaces.IEntryRep;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class EntryLevelRepository implements IEntryRep {
    private final IDB db;

    public EntryLevelRepository(IDB db) {
        this.db = db;
    }

    @Override
    public List<EntryLevelEmployees> getAllMainEmployees() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="select * from entrylevel";
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            List<EntryLevelEmployees> list = new LinkedList<EntryLevelEmployees>();
            while (rs.next()){
                EntryLevelEmployees entryLevelEmployees = new EntryLevelEmployees(rs.getString("name"),
                        rs.getDate("hiredate").toLocalDate(),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("project"));
                list.add(entryLevelEmployees);
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
    public List<EntryLevelEmployees> getMainEmployeeByName(String name) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="select * from entrylevel where name=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, name);

            ResultSet rs = st.executeQuery();
            List<EntryLevelEmployees> list = new LinkedList<EntryLevelEmployees>();
            while (rs.next()){
                EntryLevelEmployees entryLevelEmployees = new EntryLevelEmployees(rs.getString("name"),
                        rs.getDate("hiredate").toLocalDate(),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("project"));
                list.add(entryLevelEmployees);
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
    public List<EntryLevelEmployees> getMainEmployeeByProfession(String position) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="select * from entrylevel where position=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, position);

            ResultSet rs = st.executeQuery();
            List<EntryLevelEmployees> list = new LinkedList<EntryLevelEmployees>();
            while (rs.next()){
                EntryLevelEmployees entryLevelEmployees = new EntryLevelEmployees(rs.getString("name"),
                        rs.getDate("hiredate").toLocalDate(),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("project"));
                list.add(entryLevelEmployees);
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
