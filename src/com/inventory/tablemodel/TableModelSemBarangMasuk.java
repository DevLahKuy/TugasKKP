
package com.inventory.tablemodel;

import com.inventory.model.ModelSemBarangMasuk;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class TableModelSemBarangMasuk extends AbstractTableModel {
    
     private List<ModelSemBarangMasuk> list = new ArrayList<>();
    
    public void addData(ModelSemBarangMasuk  modelmasuk){
        list.add(modelmasuk);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelSemBarangMasuk  modelmasuk){
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
    
    public void setData(List<ModelSemBarangMasuk> list ){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, ModelSemBarangMasuk modelmasuk){
        list.set(index,modelmasuk);
        fireTableRowsUpdated(index, index);
    }
    
    public ModelSemBarangMasuk getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] columnNames = {"Product ID","Product Code","Product Name","Product Category","Type","Merk","Price","Qty Incoming","SubTotal"};

    @Override
    public int getColumnCount() {
       return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
           case 0:
               return list.get(rowIndex).getDatabarang().getIdDataBarang();
           case 1:
               return list.get(rowIndex).getDatabarang().getCodeDataBarang();
           case 2:
               return list.get(rowIndex).getDatabarang().getNamaProdukBarang();
           case 3:
               return list.get(rowIndex).getDatabarang().getJnsBarang().getNamaJenisBarang();
           case 4:
               return list.get(rowIndex).getDatabarang().getTypItems().getNameTypeItems();
           case 5:
               return list.get(rowIndex).getDatabarang().getProBrands().getNameProductBrand();
           case 6:
               return list.get(rowIndex).getDatabarang().getSatuan().getNamaSatuan();
           case 7:
               return list.get(rowIndex).getDatabarang().getPrice();    
           case 8:
               return list.get(rowIndex).getModeldetmasuk().getJml_masuk();
           case 9:
               return list.get(rowIndex).getModeldetmasuk().getSubtotal_masuk();    
           default:
               return null;
       }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
}
