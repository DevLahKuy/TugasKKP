
package com.inventory.service;

import com.inventory.model.ModelSerialNumber;
import java.util.List;


public interface ServiceSerialNumber {
   void addData (ModelSerialNumber sn);
   void updateData (ModelSerialNumber sn);
   void deleteData (ModelSerialNumber sn);
   
   List<ModelSerialNumber> getData();
   List<ModelSerialNumber> searchData(String id);
   
   boolean validationSerialNumber (ModelSerialNumber sn);
}
