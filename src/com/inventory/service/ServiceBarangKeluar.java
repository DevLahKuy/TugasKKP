
package com.inventory.service;

import com.inventory.model.ModelBarangKeluar;
import java.util.List;

public interface ServiceBarangKeluar {
    void addData(ModelBarangKeluar modelkeluar);
    
    List<ModelBarangKeluar> getData();
    List<ModelBarangKeluar> searchData(String id);
}
