
package com.inventory.model;



public class ModelSemBarangKeluar {
    
    private ModelDataBarang databarang;
    private ModelDetBarangKeluar modeldetkeluar;

    public ModelDataBarang getDatabarang() {
        return databarang;
    }

    public void setDatabarang(ModelDataBarang databarang) {
        this.databarang = databarang;
    }

    public ModelDetBarangKeluar getModeldetkeluar() {
        return modeldetkeluar;
    }

    public void setModeldetkeluar(ModelDetBarangKeluar modeldetkeluar) {
        this.modeldetkeluar = modeldetkeluar;
    }
}
