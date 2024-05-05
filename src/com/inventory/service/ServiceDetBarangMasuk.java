
package com.inventory.service;

import com.inventory.model.ModelDetBarangMasuk;
import java.util.List;


public interface ServiceDetBarangMasuk {
    void addData (ModelDetBarangMasuk modeldetmasuk);
    void sumTotal (ModelDetBarangMasuk modeldetmasuk);
    void hapusSementara (ModelDetBarangMasuk modeldetmasuk);
    
    List<ModelDetBarangMasuk> getData();
    List<ModelDetBarangMasuk> SearchData(String id);
    
    boolean validasiStok (ModelDetBarangMasuk modeldetmasuk);

    
}
