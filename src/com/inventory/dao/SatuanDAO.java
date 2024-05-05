
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.ModelSatuan;
import com.inventory.service.ServiceSatuan;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;


public class SatuanDAO implements ServiceSatuan {

    
    private Connection conn;
    
    public SatuanDAO(){
        conn = Koneksi.getConnection();
    }
    
    
    @Override
    public void tambahData(ModelSatuan Unit) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO productunits(name) VALUES (?)";
            st = conn.prepareStatement(sql);
            st.setString    (1, Unit.getNamaSatuan());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(ModelSatuan Unit) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE productunits SET name=? WHERE id=?";
            st = conn.prepareStatement(sql);
            st.setString    (1, Unit.getNamaSatuan());
            st.setInt       (2, Integer.parseInt(Unit.getIdSatuan()));
            
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void hapusData(ModelSatuan Unit) {
        PreparedStatement st = null;
        String sql = "DELETE FROM productunits WHERE id=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, Integer.parseInt(Unit.getIdSatuan()));
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }        
    }

    @Override
    public List<ModelSatuan> tampilData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM productunits";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelSatuan satuan = new ModelSatuan();
                satuan.setIdSatuan(String.valueOf(rs.getInt("id")));
                satuan.setNamaSatuan(rs.getString("name"));
                
                list.add(satuan);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ModelSatuan> pencarianData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM productunits WHERE name LIKE '%"+id+"%'";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelSatuan satuan = new ModelSatuan();
                satuan.setIdSatuan(String.valueOf(rs.getInt("id")));
                satuan.setNamaSatuan(rs.getString("name"));
                
                list.add(satuan);
            }
            rs.close();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }
    

    @Override
    public boolean validasiNamaSatuan(ModelSatuan Unit) {
        PreparedStatement st = null;
        ResultSet rs = null;
        boolean valid = false;
        
        String sql = "SELECT name FROM productunits WHERE name LIKE BINARY ?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, Unit.getNamaSatuan());
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
