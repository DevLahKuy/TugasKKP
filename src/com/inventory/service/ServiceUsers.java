package com.inventory.service;

import com.inventory.model.ModelUsers;
import java.util.List;


public interface ServiceUsers {
   void addData (ModelUsers users);
   void updateData (ModelUsers users);
   void deleteData (ModelUsers users);
   
   List<ModelUsers> viewData();
   List<ModelUsers> searchData(String id);
   
   boolean validationNameUsers (ModelUsers users);
   boolean login(String username, String password);
   
   
   String generateSHA256(String password);
}
