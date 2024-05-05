
package com.inventory.tablemodel;

import com.inventory.model.ModelDetBarangMasuk;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class TableModelDetBarangMasuk extends AbstractTableModel {
   
    private List<ModelDetBarangMasuk> list = new ArrayList<>();
    
    public void addData(ModelDetBarangMasuk  modeldetmasuk){
        list.add(modeldetmasuk);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelDetBarangMasuk  modeldetmasuk){
        list.add(row,  modeldetmasuk);
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
    
    public void setData(List<ModelDetBarangMasuk> list ){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, ModelDetBarangMasuk modeldetmasuk){
        list.set(index, modeldetmasuk);
        fireTableRowsUpdated(index, index);
    }
    
    public ModelDetBarangMasuk getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] columnNames = {"Incoming Product ID","Product ID","Product Name","Category","Type","Merk","Unit","Price","Qty","SubTotal"};

    @Override
    public int getColumnCount() {
       return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
           case 0:
               return list.get(rowIndex).getModelmasuk().getIdBarang_Masuk();
           case 1:
               return list.get(rowIndex).getDatabarang().getIdDataBarang();
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
               return list.get(rowIndex).getJml_masuk();
           case 9:
               return list.get(rowIndex).getSubtotal_masuk();    
           default:
               return null;
       }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
}
