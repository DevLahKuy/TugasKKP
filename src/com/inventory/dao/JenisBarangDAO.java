
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.ModelJenisBarang;
import com.inventory.service.ServiceJenisBarang;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;


public class JenisBarangDAO implements ServiceJenisBarang {

    
    private Connection conn;
    
    public JenisBarangDAO(){
        conn = Koneksi.getConnection();
    }
    
    
    @Override
    public void tambahData(ModelJenisBarang model) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO productcategories(name) VALUES (?)";
            st = conn.prepareStatement(sql);
            st.setString    (1, model.getNamaJenisBarang());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(ModelJenisBarang model) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE productcategories SET name=? WHERE id=?";
            st = conn.prepareStatement(sql);
            st.setString    (1, model.getNamaJenisBarang());
            st.setInt       (2, Integer.parseInt(model.getIdJenisBarang()));
            
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void hapusData(ModelJenisBarang model) {
        PreparedStatement st = null;
        String sql = "DELETE FROM productcategories WHERE id=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt       (1, Integer.parseInt(model.getIdJenisBarang()));
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }        
    }

    @Override
    public List<ModelJenisBarang> tampilData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM productcategories";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelJenisBarang jenisbarang = new ModelJenisBarang();
                jenisbarang.setIdJenisBarang(String.valueOf(rs.getInt("id")));
                jenisbarang.setNamaJenisBarang(rs.getString("name"));
                
                list.add(jenisbarang);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ModelJenisBarang> pencarianData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM productcategories WHERE name LIKE '%"+id+"%'";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelJenisBarang jenisbarang = new ModelJenisBarang();
                jenisbarang.setIdJenisBarang(String.valueOf(rs.getInt("id")));
                jenisbarang.setNamaJenisBarang(rs.getString("name"));
                
                list.add(jenisbarang);
            }
            rs.close();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean validasiNamaJenisBarang(ModelJenisBarang model) {
        PreparedStatement st = null;
        ResultSet rs = null;
        boolean valid = false;
        
        String sql = "SELECT name FROM productcategories WHERE name LIKE BINARY ?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, model.getNamaJenisBarang());
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

    //@Override
    //public List<ModelJenisBarang> ambilJenisBarang() {
    //    PreparedStatement st = null;
    //    ResultSet rs = null;
    //    List list = new ArrayList();
    //    String sql = "SELECT id, name FROM productcategories";
    //    
    //    try{
    //        st = conn.prepareStatement(sql);
    //        rs = st.executeQuery();
    //        while(rs.next()){
    //            ModelJenisBarang jenisbarang = new ModelJenisBarang();
    //            jenisbarang.setIdJenisBarang(rs.getInt("id"));
    //            jenisbarang.setNamaJenisBarang(rs.getString("name"));
    //            
    //            list.add(jenisbarang);
    //        }
    //    }catch(SQLException e){
    //        e.printStackTrace();
    //    }
    //    return list;
    //}

    //@Override
    //public String ambilJenisBarangName(String name) {
    //    String idJenisBarang = null;
    //    PreparedStatement st = null;
    //    ResultSet rs = null;
    //    String sql ="SELECT id FROM productcategories WHERE name=?";
        
    //   try{
    //        st = conn.prepareStatement(sql);
    //        rs = st.executeQuery();
    //        st.setString(1, name);
    //        if(rs.next()){
    //            idJenisBarang = rs.getString("id");
    //        }
    //    }catch (SQLException e) {
    //        e.printStackTrace();
    //    }
    //    
    //    return idJenisBarang;
    //}
    
    
    
}
