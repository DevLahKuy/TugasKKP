
package com.inventory.service;

import com.inventory.model.ModelSatuan;
import java.util.List;


public interface ServiceSatuan {
   void tambahData (ModelSatuan unit);
   void updateData (ModelSatuan unit);
   void hapusData (ModelSatuan unit);
   
   List<ModelSatuan> tampilData();
   List<ModelSatuan> pencarianData(String id);
   
   boolean validasiNamaSatuan (ModelSatuan unit);
}
