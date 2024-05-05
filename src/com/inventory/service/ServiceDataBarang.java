
package com.inventory.service;

import com.inventory.model.ModelDataBarang;
import java.util.List;


public interface ServiceDataBarang {
    void addData (ModelDataBarang barang);
    void updateData (ModelDataBarang barang);
    void deleteData (ModelDataBarang barang);
    
    List<ModelDataBarang> getData();
    List<ModelDataBarang> searchData(String id);
}
