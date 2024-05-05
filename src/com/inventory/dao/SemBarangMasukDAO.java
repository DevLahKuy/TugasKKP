
package com.inventory.dao;

import com.inventory.config.Koneksi;
import com.inventory.model.ModelSemBarangMasuk;
import com.inventory.service.ServiceSemBarangMasuk;
import java.sql.Connection;
import java.util.List;


public class SemBarangMasukDAO implements ServiceSemBarangMasuk {
    
    private Connection conn;
    
    public SemBarangMasukDAO(){
        conn = Koneksi.getConnection();
    }

    @Override
    public void addData(ModelSemBarangMasuk modelmasuk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void updateData(ModelSemBarangMasuk modelmasuk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteData(ModelSemBarangMasuk modelmasuk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<ModelSemBarangMasuk> getData() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
