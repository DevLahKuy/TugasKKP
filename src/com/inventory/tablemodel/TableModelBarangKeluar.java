
package com.inventory.tablemodel;

import com.inventory.model.ModelBarangKeluar;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class TableModelBarangKeluar extends AbstractTableModel {

    private List<ModelBarangKeluar> list = new ArrayList<>();
    
    public void addData(ModelBarangKeluar modelkeluar){
        list.add(modelkeluar);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelBarangKeluar modelkeluar){
        list.add(row, modelkeluar);
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
    
    public void setData(List<ModelBarangKeluar> list ){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, ModelBarangKeluar modelkeluar){
        list.set(index,modelkeluar);
        fireTableRowsUpdated(index, index);
    }
    
    public ModelBarangKeluar getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] columnNames = {"ID","Date","Total Outcoming","Nama Customers","Nama Users"};

    @Override
    public int getColumnCount() {
       return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
           case 0:
               return list.get(rowIndex).getIdBarang_Keluar();
           case 1:
               return list.get(rowIndex).getTgl_Keluar();
           case 2:
               return list.get(rowIndex).getTotal_Keluar();
           case 3:
               return list.get(rowIndex).getMod_Customers().getNameCustomers();    
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
