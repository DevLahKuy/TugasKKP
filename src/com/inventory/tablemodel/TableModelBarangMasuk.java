
package com.inventory.tablemodel;

import com.inventory.model.ModelBarangMasuk;
import java.util.ArrayList;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class TableModelBarangMasuk extends AbstractTableModel {
    private List<ModelBarangMasuk> list = new ArrayList<>();
    
    public void addData(ModelBarangMasuk modelmasuk){
        list.add(modelmasuk);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelBarangMasuk modelmasuk){
        list.add(row, modelmasuk);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    }
    
    public void deleteData(int index){
        list.remove(index);
        fireTableRowsDeleted(index, index);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelBarangMasuk> list ){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, ModelBarangMasuk modelkeluar){
        list.set(index,modelkeluar);
        fireTableRowsUpdated(index, index);
    }
    
    public ModelBarangMasuk getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] columnNames = {"Incoming Product ID","Date","Total Incoming","Nama Supplier","Nama Users"};

    @Override
    public int getColumnCount() {
       return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
           case 0:
               return list.get(rowIndex).getIdBarang_Masuk();
           case 1:
               Timestamp timestamp = list.get(rowIndex).getTgl_Masuk();
               SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
               return dateFormat.format(timestamp);    
           case 2:
               return list.get(rowIndex).getTotal_Masuk();
           case 3:
               return list.get(rowIndex).getMod_Suppliers().getNameSuppliers();    
           case 4:
               return list.get(rowIndex).getMod_Users().getNameUsers();
           default:
               return null;
       }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
}
