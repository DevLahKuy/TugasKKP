
package com.inventory.model;

import java.sql.Timestamp;

public class ModelBarangMasuk {
    private int idBarang_Masuk;
    private Timestamp tgl_Masuk;
    private Long total_Masuk;
    private ModelSuppliers mod_Suppliers;
    private ModelUsers mod_Users;

    public int getIdBarang_Masuk() {
        return idBarang_Masuk;
    }

    public void setIdBarang_Masuk(int idBarang_Masuk) {
        this.idBarang_Masuk = idBarang_Masuk;
    }

    public Timestamp getTgl_Masuk() {
        return tgl_Masuk;
    }

    public void setTgl_Masuk(Timestamp tgl_Masuk) {
        this.tgl_Masuk = tgl_Masuk;
    }

    public Long getTotal_Masuk() {
        return total_Masuk;
    }

    public void setTotal_Masuk(Long total_Masuk) {
        this.total_Masuk = total_Masuk;
    }

    public ModelSuppliers getMod_Suppliers() {
        return mod_Suppliers;
    }

    public void setMod_Suppliers(ModelSuppliers mod_Suppliers) {
        this.mod_Suppliers = mod_Suppliers;
    }

    public ModelUsers getMod_Users() {
        return mod_Users;
    }

    public void setMod_Users(ModelUsers mod_Users) {
        this.mod_Users = mod_Users;
    }

    

    
}
