
package com.inventory.service;

import com.inventory.model.ModelSemBarangMasuk;
import java.util.List;

public interface ServiceSemBarangMasuk {
    
    void addData (ModelSemBarangMasuk modelmasuk);
    void updateData (ModelSemBarangMasuk modelmasuk);
    void deleteData (ModelSemBarangMasuk modelmasuk);
            
    List<ModelSemBarangMasuk> getData();
}
