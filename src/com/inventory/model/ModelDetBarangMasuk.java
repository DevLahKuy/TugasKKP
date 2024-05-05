
package com.inventory.model;


public class ModelDetBarangMasuk {
    private ModelBarangMasuk modelmasuk;
    private ModelDataBarang databarang;
    private ModelJenisBarang jnsBarang;
    private ModelTypeItems typItems;
    private ModelProductBrands proBrands; 
    private ModelSatuan satuan;
    private int Jml_masuk;
    private Long Subtotal_masuk;

    public ModelJenisBarang getJnsBarang() {
        return jnsBarang;
    }

    public void setJnsBarang(ModelJenisBarang jnsBarang) {
        this.jnsBarang = jnsBarang;
    }

    public ModelTypeItems getTypItems() {
        return typItems;
    }

    public void setTypItems(ModelTypeItems typItems) {
        this.typItems = typItems;
    }

    public ModelProductBrands getProBrands() {
        return proBrands;
    }

    public void setProBrands(ModelProductBrands proBrands) {
        this.proBrands = proBrands;
    }

    public ModelSatuan getSatuan() {
        return satuan;
    }

    public void setSatuan(ModelSatuan satuan) {
        this.satuan = satuan;
    }
    private int jml_masuk;
    private Long subtotal_masuk;

    public ModelBarangMasuk getModelmasuk() {
        return modelmasuk;
    }

    public void setModelmasuk(ModelBarangMasuk modelmasuk) {
        this.modelmasuk = modelmasuk;
    }

    public ModelDataBarang getDatabarang() {
        return databarang;
    }

    public void setDatabarang(ModelDataBarang databarang) {
        this.databarang = databarang;
    }

    public int getJml_masuk() {
        return jml_masuk;
    }

    public void setJml_masuk(int jml_masuk) {
        this.jml_masuk = jml_masuk;
    }

    public Long getSubtotal_masuk() {
        return subtotal_masuk;
    }

    public void setSubtotal_masuk(Long subtotal_masuk) {
        this.subtotal_masuk = subtotal_masuk;
    }
}
