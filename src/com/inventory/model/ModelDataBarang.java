
package com.inventory.model;


public class ModelDataBarang {
  private int idDataBarang;
    private String codeDataBarang;
    private String namaProdukBarang;
    private ModelJenisBarang jnsBarang;
    private ModelTypeItems typItems;
    private ModelProductBrands proBrands; 
    private ModelSatuan satuan;
    private Long price;
    private int stock;  

    public int getIdDataBarang() {
        return idDataBarang;
    }

    public void setIdDataBarang(int idDataBarang) {
        this.idDataBarang = idDataBarang;
    }

    public String getCodeDataBarang() {
        return codeDataBarang;
    }

    public void setCodeDataBarang(String codeDataBarang) {
        this.codeDataBarang = codeDataBarang;
    }

    public String getNamaProdukBarang() {
        return namaProdukBarang;
    }

    public void setNamaProdukBarang(String namaProdukBarang) {
        this.namaProdukBarang = namaProdukBarang;
    }

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

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
