
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.ModelBarangMasuk;
import com.inventory.model.ModelSuppliers;
import com.inventory.model.ModelUsers;
import com.inventory.service.ServiceBarangMasuk;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.util.List;

public class BarangMasukDAO implements ServiceBarangMasuk {
    
    private Connection conn;
    
    public BarangMasukDAO(){
        conn = Koneksi.getConnection();
    }

    @Override
    public void addData(ModelBarangMasuk modelmasuk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateStatus(int idBarang_Masuk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelBarangMasuk> getData() {
        PreparedStatement st = null;
        ResultSet rs = null;
        List list = new ArrayList();
        String sql = "SELECT ip.id, ip.total_incoming,ip.created_at, s.name AS supplier_name, u.name AS user_name " +
                 "FROM incomingproducts ip " +
                 "INNER JOIN suppliers s ON ip.supplier_id = s.id " +
                 "INNER JOIN users u ON ip.user_id = u.id";
        
        try{
            st = conn.prepareStatement(sql);
            rs = st.executeQuery();
            while(rs.next()){
                ModelBarangMasuk msk = new ModelBarangMasuk();
                ModelSuppliers model = new ModelSuppliers();
                ModelUsers users = new ModelUsers();
                
                msk.setIdBarang_Masuk(rs.getInt("id"));
                msk.setTgl_Masuk(rs.getTimestamp("created_at"));
                msk.setTotal_Masuk(rs.getLong("total_incoming"));
                model.setNameSuppliers(rs.getString("supplier_name"));
                users.setNameUsers(rs.getString("user_name"));
                
                
                
                msk.setMod_Suppliers(model);
                msk.setMod_Users(users);
                
                list.add(msk);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<ModelBarangMasuk> searchData(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
