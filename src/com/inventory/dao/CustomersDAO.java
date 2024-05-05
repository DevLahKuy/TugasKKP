
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.ModelCustomers;
import com.inventory.service.ServiceCustomers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

public class CustomersDAO implements ServiceCustomers {

    
    private Connection conn;
    
    public CustomersDAO(){
        conn = Koneksi.getConnection();
    }
    
    
    @Override
    public void addData(ModelCustomers cust) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO customers(name, address, phone, email) VALUES (?, ?, ?, ?)";
            st = conn.prepareStatement(sql);
            st.setString    (1, cust.getNameCustomers());
            st.setString    (2, cust.getAddressCustomers());
            st.setString    (3, cust.getPhoneCustomers());
            st.setString    (4, cust.getEmailCustomers());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(ModelCustomers cust) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE customers SET name=?, address=?, phone=?, email=? WHERE id=?";
            st = conn.prepareStatement(sql);
            st.setString    (1, cust.getNameCustomers());
            st.setString    (2, cust.getAddressCustomers());
            st.setString    (3, cust.getPhoneCustomers());
            st.setString    (4, cust.getEmailCustomers());
            st.setInt       (5, cust.getIdCustomers());
            
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteData(ModelCustomers cust) {
        PreparedStatement st = null;
        String sql = "DELETE FROM customers WHERE id=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, cust.getIdCustomers());
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }        
    }

    @Override
    public List<ModelCustomers> viewData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM customers";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelCustomers cust = new ModelCustomers();
                cust.setIdCustomers(rs.getInt("id"));
                cust.setNameCustomers(rs.getString("name"));
                cust.setAddressCustomers(rs.getString("address"));
                cust.setPhoneCustomers(rs.getString("phone"));
                cust.setEmailCustomers(rs.getString("email"));
                
                list.add(cust);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean validationNameCustomers(ModelCustomers cust) {
        PreparedStatement st = null;
        ResultSet rs = null;
        boolean valid = false;
        
        String sql = "SELECT name FROM customers "
                + "WHERE name LIKE BINARY ? AND id !=?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, cust.getNameCustomers());
            st.setInt(2, cust.getIdCustomers());
            rs = st.executeQuery();
            
            if(rs.next()){
                valid = false;
            }else{
                valid = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try{
                if(rs != null){
                    rs.close();
                }
                if(st != null){
                    st.close();
                }
            } catch (SQLException e){
              e.printStackTrace();  
            }
        }
        return valid;
    }

    @Override
    public List<ModelCustomers> searchData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM customers WHERE id LIKE '%"+id+"%'"
                + "OR name LIKE '%"+id+"%' "
                + "OR address LIKE '%"+id+"%' "
                + "OR phone LIKE '%"+id+"%' "
                + "OR email LIKE '%"+id+"%' ";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelCustomers cust = new ModelCustomers();
                cust.setIdCustomers(rs.getInt("id"));
                cust.setNameCustomers(rs.getString("name"));
                cust.setAddressCustomers(rs.getString("address"));
                cust.setPhoneCustomers(rs.getString("phone"));
                cust.setEmailCustomers(rs.getString("email"));
                
                list.add(cust);
            }
            rs.close();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    
    
    
    
}
