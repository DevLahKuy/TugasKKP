
package com.inventory.model;


public class ModelBarangKeluar {
    private int idBarang_Keluar;
    private String tgl_Keluar;
    private Long total_Keluar;
    private ModelCustomers mod_Customers;
    private ModelUsers mod_Users; 

    public int getIdBarang_Keluar() {
        return idBarang_Keluar;
    }

    public void setIdBarang_Keluar(int idBarang_Keluar) {
        this.idBarang_Keluar = idBarang_Keluar;
    }

    public String getTgl_Keluar() {
        return tgl_Keluar;
    }

    public void setTgl_Keluar(String tgl_Keluar) {
        this.tgl_Keluar = tgl_Keluar;
    }

    public Long getTotal_Keluar() {
        return total_Keluar;
    }

    public void setTotal_Keluar(Long total_Keluar) {
        this.total_Keluar = total_Keluar;
    }

    public ModelCustomers getMod_Customers() {
        return mod_Customers;
    }

    public void setMod_Customers(ModelCustomers mod_Customers) {
        this.mod_Customers = mod_Customers;
    }

    public ModelUsers getMod_Users() {
        return mod_Users;
    }

    public void setMod_Users(ModelUsers mod_Users) {
        this.mod_Users = mod_Users;
    }

    

    
}
