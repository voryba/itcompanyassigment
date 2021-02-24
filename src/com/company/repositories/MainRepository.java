package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.entities.MainEmployees;
import com.company.entities.ManagementEmployees;
import com.company.repositories.interfaces.IMainRep;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class MainRepository implements IMainRep {
    private final IDB db;

    public MainRepository(IDB db) {
        this.db = db;
    }

    @Override
    public List<MainEmployees> getAllMainEmployees() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="select * from main";
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            List<MainEmployees> list = new LinkedList<MainEmployees>();
            while (rs.next()){
                MainEmployees mainEmployees = new MainEmployees(rs.getString("name"),
                        rs.getDate("hiredate").toLocalDate(),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("project"));
                list.add(mainEmployees);
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
    public List<MainEmployees> getMainEmployeeByName(String name) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="select * from main where name=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, name);

            ResultSet rs = st.executeQuery();
            List<MainEmployees> list = new LinkedList<MainEmployees>();
            while (rs.next()){
                MainEmployees mainEmployees = new MainEmployees(rs.getString("name"),
                        rs.getDate("hiredate").toLocalDate(),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("project"));
                list.add(mainEmployees);
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
    public List<MainEmployees> getMainEmployeeByProfession(String position) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="select * from main where position=?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, position);

            ResultSet rs = st.executeQuery();
            List<MainEmployees> list = new LinkedList<MainEmployees>();
            while (rs.next()){
                MainEmployees mainEmployees = new MainEmployees(rs.getString("name"),
                        rs.getDate("hiredate").toLocalDate(),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("project"));
                list.add(mainEmployees);
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
