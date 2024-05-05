
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.ModelUsers;
import com.inventory.service.ServiceUsers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;
import java.util.List;

public class UsersDAO implements ServiceUsers {

    
    private Connection conn;
    
    public UsersDAO(){
        conn = Koneksi.getConnection();
    }
    
    
    @Override
    public void addData(ModelUsers users) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO users(name, username, password, email, role) VALUES (?, ?, ?, ?, ?)";
            st = conn.prepareStatement(sql);
            st.setString    (1, users.getNameUsers());
            st.setString    (2, users.getUsername());
            st.setString    (3, generateSHA256(users.getPassword()));
            st.setString    (4, users.getEmail());
            st.setString    (5, users.getRole());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(ModelUsers users) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE users SET name=?, username=? , email=?, role=? WHERE id=?";
            st = conn.prepareStatement(sql);
            st.setString    (1, users.getNameUsers());
            st.setString    (2, users.getUsername());
            st.setString    (3, users.getEmail());
            st.setString    (4, users.getRole());
            st.setInt       (5, users.getIdUsers());
            
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteData(ModelUsers users) {
        PreparedStatement st = null;
        String sql = "DELETE FROM users WHERE id=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, users.getIdUsers());
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }        
    }

    @Override
    public List<ModelUsers> viewData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM users";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelUsers users = new ModelUsers();
                users.setIdUsers(rs.getInt("id"));
                users.setNameUsers(rs.getString("name"));
                users.setUsername(rs.getString("username"));
                users.setEmail(rs.getString("email"));
                users.setRole(rs.getString("role"));
                
                list.add(users);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

   @Override
    public boolean validationNameUsers(ModelUsers users) {
        PreparedStatement st = null;
        ResultSet rs = null;
        boolean valid = false;
        
        String sql = "SELECT name FROM users "
                + "WHERE name LIKE BINARY ? AND id !=?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, users.getNameUsers());
            st.setInt(2, users.getIdUsers());
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
    public List<ModelUsers> searchData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM users WHERE id LIKE '%"+id+"%'"
                + "OR name LIKE '%"+id+"%' "
                + "OR username LIKE '%"+id+"%' "
                + "OR email LIKE '%"+id+"%' "
                + "OR role LIKE '%"+id+"%' ";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelUsers users = new ModelUsers();
                users.setIdUsers(rs.getInt("id"));
                users.setNameUsers(rs.getString("name"));
                users.setUsername(rs.getString("username"));
                users.setEmail(rs.getString("email"));
                users.setRole(rs.getString("role"));                
                
                list.add(users);
            }
            rs.close();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public String generateSHA256(String password){
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encodehash = digest.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder(2 * encodehash.length);
            
            for(byte b : encodehash){
                String hex = Integer.toHexString(0xff & b);
                if(hex.length() == 1){
                    hexString.append('0');
                }
                hexString.append(hex);
            }   
            return hexString.toString();
        } catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }
        
        return null;
    }

    /* @Override
    public boolean validationNameUsers(ModelUsers users) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } */

    @Override
    public boolean login(String username, String password) {
        PreparedStatement st = null;
        ResultSet rs = null;
        try{
            
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            st = conn.prepareStatement(sql);
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            return rs.next();
        }catch(SQLException e){
            System.err.println("Terjadi kesalahan saat melakukan login: " + e.getMessage());
            return false;
        }
    }
    
    
    
    
}
