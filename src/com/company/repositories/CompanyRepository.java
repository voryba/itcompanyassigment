package com.company.repositories;

import com.company.data.interfaces.IDB;
import com.company.repositories.interfaces.ICompanyRep;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CompanyRepository implements ICompanyRep {
    private final IDB db;

    public CompanyRepository(IDB db) {
        this.db = db;
    }

    public int getTotalCost(){
        Connection con = null;
        try {
            con = db.getConnection();
            String sql ="SELECT SUM(salary) FROM entrylevel";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            int sum_entry = -1;
            if(rs.next()) {
                sum_entry = rs.getInt("sum");
            }
            sql ="SELECT SUM(salary) FROM main";
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            int sum_main = 0;
            if(rs.next()){
                sum_main = rs.getInt("sum");
            }

            sql ="SELECT SUM(salary) FROM executive";
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            int sum_executive = 0;
            if(rs.next()) {
                sum_executive = rs.getInt("sum");
            }
            sql ="SELECT SUM(salary) FROM management";
            st = con.prepareStatement(sql);
            rs = st.executeQuery();
            int sum_management = 0;
            if(rs.next()) {
                sum_management = rs.getInt("sum");
            }
            return sum_entry+sum_main+sum_executive+sum_management;
        } catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return -1;
    }
}
