package com.inventory.service;

import com.inventory.model.ModelCustomers;
import java.util.List;


public interface ServiceCustomers {
   void addData (ModelCustomers cust);
   void updateData (ModelCustomers cust);
   void deleteData (ModelCustomers cust);
   
   List<ModelCustomers> viewData();
   List<ModelCustomers> searchData(String id);
   
   boolean validationNameCustomers (ModelCustomers cust);
}
