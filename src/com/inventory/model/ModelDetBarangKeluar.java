
package com.inventory.model;


public class ModelDetBarangKeluar {
    private ModelBarangKeluar modelkeluar;
    private ModelDataBarang databarang;
    private String surat_keluar;
    private int jml_keluar;
    private Long subtotal_keluar;
    

    public ModelBarangKeluar getModelkeluar() {
        return modelkeluar;
    }

    public void setModelkeluar(ModelBarangKeluar modelkeluar) {
        this.modelkeluar = modelkeluar;
    }

    public ModelDataBarang getDatabarang() {
        return databarang;
    }

    public void setDatabarang(ModelDataBarang databarang) {
        this.databarang = databarang;
    }
    
    public String getSurat_keluar() {
        return surat_keluar;
    }

    public void setSurat_keluar(String surat_keluar) {
        this.surat_keluar = surat_keluar;
    }

    public int getJml_keluar() {
        return jml_keluar;
    }

    public void setJml_keluar(int jml_keluar) {
        this.jml_keluar = jml_keluar;
    }

    public Long getSubtotal_keluar() {
        return subtotal_keluar;
    }

    public void setSubtotal_keluar(Long subtotal_keluar) {
        this.subtotal_keluar = subtotal_keluar;
    }

    

    
}
