package com.inventory.service;

import com.inventory.model.ModelSuppliers;
import java.util.List;


public interface ServiceSuppliers {
   void addData (ModelSuppliers model);
   void updateData (ModelSuppliers model);
   void deleteData (ModelSuppliers model);
   
   List<ModelSuppliers> viewData();
   List<ModelSuppliers> searchData(String id);
   
   boolean validationNameSuppliers (ModelSuppliers model);
}
