
package com.inventory.service;

import com.inventory.model.ModelProductBrands;
import java.util.List;


public interface ServiceProductBrands {
   void addData (ModelProductBrands brand);
   void updateData (ModelProductBrands brand);
   void deleteData (ModelProductBrands brand);
   
   List<ModelProductBrands> viewData();
   List<ModelProductBrands> searchData(String id);
   
   boolean validationNameProductBrands (ModelProductBrands brand);
}
