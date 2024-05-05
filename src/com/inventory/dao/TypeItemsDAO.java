
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.ModelTypeItems;
import com.inventory.service.ServiceTypeItems;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.SQLException;


public class TypeItemsDAO implements ServiceTypeItems {

    
    private Connection conn;
    
    public TypeItemsDAO(){
        conn = Koneksi.getConnection();
    }
    
    
    @Override
    public void addData(ModelTypeItems model) {
        PreparedStatement st = null;
        try {
            String sql = "INSERT INTO productmodels(name) VALUES (?)";
            st = conn.prepareStatement(sql);
            st.setString    (1, model.getNameTypeItems());
            
            st.executeUpdate();
            st.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    @Override
    public List<ModelTypeItems> viewData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM productmodels";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelTypeItems model = new ModelTypeItems();
                model.setIdModelTypeItems(String.valueOf(rs.getInt("id")));
                model.setNameTypeItems(rs.getString("name"));
                
                list.add(model);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void updateData(ModelTypeItems model) {
        PreparedStatement st = null;
        try {
            String sql = "UPDATE productmodels SET name=? WHERE id=?";
            st = conn.prepareStatement(sql);
            st.setString    (1, model.getNameTypeItems());
            st.setInt       (2, Integer.parseInt(model.getIdModelTypeItems()));
            
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteData(ModelTypeItems model) {
        PreparedStatement st = null;
        String sql = "DELETE FROM productmodels WHERE id=?";
        try {
            st = conn.prepareStatement(sql);
            st.setInt(1, Integer.parseInt(model.getIdModelTypeItems()));
            st.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }        
    }

    

    @Override
    public boolean validationNameTypeItems(ModelTypeItems model) {
        PreparedStatement st = null;
        ResultSet rs = null;
        boolean valid = false;
        
        String sql = "SELECT name FROM productmodels WHERE name LIKE BINARY ?";
        try{
            st = conn.prepareStatement(sql);
            st.setString(1, model.getNameTypeItems());
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
    public List<ModelTypeItems> searchData(String id) {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT * FROM productmodels WHERE name LIKE '%"+id+"%'";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelTypeItems model = new ModelTypeItems();
                model.setIdModelTypeItems(String.valueOf(rs.getInt("id")));
                model.setNameTypeItems(rs.getString("name"));
                
                list.add(model);
            }
            rs.close();
            st.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ModelTypeItems> viewData(int startIndex, int entriesPerPage) {
       PreparedStatement st = null;
       ResultSet rs = null;
       String sql = "SELECT * FROM productmodels LIMIT ?, ?";
       List<ModelTypeItems> list = new ArrayList<>();
       
       try{
           st = conn.prepareStatement(sql);
           st.setInt(1, startIndex);
           st.setInt(2, entriesPerPage);
           rs = st.executeQuery();
           
           while (rs.next()){
               ModelTypeItems model = new ModelTypeItems();
               model.setIdModelTypeItems(String.valueOf(rs.getInt("id")));
               model.setNameTypeItems(rs.getString("name"));
               list.add(model);
           }
           
           return list;
       } catch (SQLException e){
           e.printStackTrace();
           return null;
       } 
    }

    @Override
    public int getTotalHalaman() {
       PreparedStatement st = null;
       ResultSet rs = null;
       String sql = "SELECT COUNT(*) AS total FROM productmodels";
       
       try{
           st = conn.prepareStatement(sql);
           rs = st.executeQuery();
           
           if (rs.next()){
               return rs.getInt("total");
           }else {
               return 0;
           }
       } catch (SQLException e) {
           e.printStackTrace();
           return 0;
       }
    }

    

   

   
}
