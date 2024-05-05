
package com.inventory.service;

import com.inventory.model.ModelSemBarangKeluar;
import java.util.List;


public interface ServiceSemBarangKeluar {
    
    void addData (ModelSemBarangKeluar modelkeluar);
    void updateData (ModelSemBarangKeluar modelkeluar);
    void deleteData (ModelSemBarangKeluar modelkeluar);
            
    List<ModelSemBarangKeluar> getData();
}
