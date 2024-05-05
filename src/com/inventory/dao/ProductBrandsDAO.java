
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.ModelProductBrands;
import com.inventory.service.ServiceProductBrands;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;


public class ProductBrandsDAO implements ServiceProductBrands {

    
    private Connection conn;
    
    public ProductBrandsDAO(){
        conn = Koneksi.getConnection();
    }
    
    
    @Override
    public void addData(ModelProductBrands brand) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO productbrands (name) VALUES (?)";
            st = conn.prepareStatement(sql);
            st.setString    (1, brand.getNameProductBrand());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void updateData(ModelProductBrands brand) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE productbrands SET name=? WHERE id=?";
            st = conn.prepareStatement(sql);
            st.setString    (1, brand.getNameProductBrand());
            st.setInt       (2, Integer.parseInt(brand.getIdProductBrand()));
            
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    
    @Override
    public void deleteData(ModelProductBrands brand) {
        PreparedStatement st = null;
        String sql = "DELETE FROM productbrands WHERE id=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, Integer.parseInt(brand.getIdProductBrand()));
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }        
    }

    @Override
    public List<ModelProductBrands> viewData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM productbrands";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelProductBrands productbrands = new ModelProductBrands();
                productbrands.setIdProductBrand(String.valueOf(rs.getInt("id")));
                productbrands.setNameProductBrand(rs.getString("name"));
                
                list.add(productbrands);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ModelProductBrands> searchData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM productbrands WHERE name LIKE '%"+id+"%'";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelProductBrands productbrands = new ModelProductBrands();
                productbrands.setIdProductBrand(String.valueOf(rs.getInt("id")));
                productbrands.setNameProductBrand(rs.getString("name"));
                
                list.add(productbrands);
            }
            rs.close();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public boolean validationNameProductBrands(ModelProductBrands brand) {
        PreparedStatement st = null;
        ResultSet rs = null;
        boolean valid = false;
        
        String sql = "SELECT name FROM productbrands WHERE name LIKE BINARY ?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, brand.getNameProductBrand());
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
