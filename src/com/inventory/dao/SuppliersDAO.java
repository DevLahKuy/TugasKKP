
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.ModelSuppliers;
import com.inventory.service.ServiceSuppliers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

public class SuppliersDAO implements ServiceSuppliers {

    
    private Connection conn;
    
    public SuppliersDAO(){
        conn = Koneksi.getConnection();
    }
    
    
    @Override
    public void addData(ModelSuppliers model) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO suppliers(name, address, phone, email) VALUES (?, ?, ?, ?)";
            st = conn.prepareStatement(sql);
            st.setString    (1, model.getNameSuppliers());
            st.setString    (2, model.getAddressSuppliers());
            st.setString    (3, model.getPhoneSuppliers());
            st.setString    (4, model.getEmailSuppliers());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(ModelSuppliers model) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE suppliers SET name=?, address=?, phone=?, email=? WHERE id=?";
            st = conn.prepareStatement(sql);
            st.setString    (1, model.getNameSuppliers());
            st.setString    (2, model.getAddressSuppliers());
            st.setString    (3, model.getPhoneSuppliers());
            st.setString    (4, model.getEmailSuppliers());
            st.setInt       (5, model.getIdSuppliers());
            
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteData(ModelSuppliers model) {
        PreparedStatement st = null;
        String sql = "DELETE FROM suppliers WHERE id=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, model.getIdSuppliers());
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }        
    }

    @Override
    public List<ModelSuppliers> viewData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM suppliers";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelSuppliers model = new ModelSuppliers();
                model.setIdSuppliers(rs.getInt("id"));
                model.setNameSuppliers(rs.getString("name"));
                model.setAddressSuppliers(rs.getString("address"));
                model.setPhoneSuppliers(rs.getString("phone"));
                model.setEmailSuppliers(rs.getString("email"));
                
                list.add(model);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean validationNameSuppliers(ModelSuppliers model) {
        PreparedStatement st = null;
        ResultSet rs = null;
        boolean valid = false;
        
        String sql = "SELECT name FROM suppliers "
                + "WHERE name LIKE BINARY ? AND id !=?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, model.getNameSuppliers());
            st.setInt(2, model.getIdSuppliers());
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
    public List<ModelSuppliers> searchData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM suppliers WHERE id LIKE '%"+id+"%'"
                + "OR name LIKE '%"+id+"%' "
                + "OR address LIKE '%"+id+"%' "
                + "OR phone LIKE '%"+id+"%' "
                + "OR email LIKE '%"+id+"%' ";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelSuppliers model = new ModelSuppliers();
                model.setIdSuppliers(rs.getInt("id"));
                model.setNameSuppliers(rs.getString("name"));
                model.setAddressSuppliers(rs.getString("address"));
                model.setPhoneSuppliers(rs.getString("phone"));
                model.setEmailSuppliers(rs.getString("email"));
                
                list.add(model);
            }
            rs.close();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    
    
    
    
}
