
package com.inventory.service;

import com.inventory.model.ModelJenisBarang;
import java.util.List;


public interface ServiceJenisBarang {
   void tambahData (ModelJenisBarang model);
   void updateData (ModelJenisBarang model);
   void hapusData (ModelJenisBarang model);
   
   List<ModelJenisBarang> tampilData();
   List<ModelJenisBarang> pencarianData(String id);
   
   boolean validasiNamaJenisBarang (ModelJenisBarang model);
   //List<ModelJenisBarang> ambilJenisBarang();
   //String ambilJenisBarangName(int id);
}
