
package com.inventory.service;

import com.inventory.model.ModelBarangMasuk;
import java.util.List;

public interface ServiceBarangMasuk {
    void addData(ModelBarangMasuk modelmasuk);
    void updateStatus (int idBarang_Masuk);
    
    List<ModelBarangMasuk> getData();
    List<ModelBarangMasuk> searchData(String id);
}
