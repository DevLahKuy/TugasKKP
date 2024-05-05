package com.inventory.service;

import com.inventory.model.ModelTypeItems;
import java.util.List;


public interface ServiceTypeItems {
   void addData (ModelTypeItems model);
   void updateData (ModelTypeItems model);
   void deleteData (ModelTypeItems model);
   
   List<ModelTypeItems> viewData();
   
   List<ModelTypeItems> searchData(String id);
   
   boolean validationNameTypeItems (ModelTypeItems model);
   
   List<ModelTypeItems> viewData(int startIndex, int entriesPerPage);
   int getTotalHalaman();

   
}
