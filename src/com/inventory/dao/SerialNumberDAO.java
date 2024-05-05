
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.ModelSerialNumber;
import com.inventory.service.ServiceSerialNumber;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;


public class SerialNumberDAO implements ServiceSerialNumber {

    
    private Connection conn;
    
    public SerialNumberDAO(){
        conn = Koneksi.getConnection();
    }
    
    
    @Override
    public void addData(ModelSerialNumber sn) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO productserialnumbers (serial_number, product_id) VALUES (?,?)";
            st = conn.prepareStatement(sql);
            
            st.setString    (1, sn.getNameSerialNumber());
            st.setInt       (2, sn.getMdlData().getIdDataBarang());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(ModelSerialNumber sn) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE productserialnumbers SET serial_number=?, product_id=? WHERE id=?";
            st = conn.prepareStatement(sql);
            st.setString    (1, sn.getNameSerialNumber());
            st.setInt       (2, sn.getMdlData().getIdDataBarang());
            st.setInt       (3, sn.getIdSerialNumber());
            
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteData(ModelSerialNumber sn) {
        PreparedStatement st = null;
        String sql = "DELETE FROM productserialnumbers WHERE id=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt       (3, sn.getIdSerialNumber());
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }        
    }

    @Override
    public List<ModelSerialNumber> getData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM productserialnumbers";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelSerialNumber sn = new ModelSerialNumber();
                sn.setIdSerialNumber(rs.getInt("id"));
                sn.setNameSerialNumber(rs.getString("serial_number"));
                
                list.add(sn);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ModelSerialNumber> searchData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM productserialnumbers WHERE serial_number LIKE '%"+id+"%'";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelSerialNumber sn = new ModelSerialNumber();
                sn.setIdSerialNumber(rs.getInt("id"));
                sn.setNameSerialNumber(rs.getString("serial_number"));
                
                list.add(sn);
            }
            rs.close();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    

    @Override
    public boolean validationSerialNumber(ModelSerialNumber sn) {
        PreparedStatement st = null;
        ResultSet rs = null;
        boolean valid = false;
        
        String sql = "SELECT serial_number FROM productserialnumbers WHERE serial_number LIKE BINARY ?";
        try{
            st = conn.prepareStatement(sql);
            st.setString    (1, sn.getNameSerialNumber());
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
}
