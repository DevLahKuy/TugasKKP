
package com.inventory.service;

import com.inventory.model.ModelDetBarangKeluar;
import java.util.List;

public interface ServiceDetBarangKeluar {
    void addData (ModelDetBarangKeluar modeldetkeluar);
    void sumTotal (ModelDetBarangKeluar modeldetkeluar);
    void hapusSementara (ModelDetBarangKeluar modeldetkeluar);
    
    List<ModelDetBarangKeluar> getData (String id);
    List<ModelDetBarangKeluar> SearchData(String id);
    
    
}
