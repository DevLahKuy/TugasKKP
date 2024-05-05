
package com.inventory.tablemodel;

import com.inventory.model.ModelSemBarangKeluar;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class TableModelSemBarangKeluar extends AbstractTableModel {
    
     private List<ModelSemBarangKeluar> list = new ArrayList<>();
    
    public void addData(ModelSemBarangKeluar  modelkeluar){
        list.add( modelkeluar);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelSemBarangKeluar  modelkeluar){
        list.add(row,  modelkeluar);
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
    
    public void setData(List<ModelSemBarangKeluar> list ){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, ModelSemBarangKeluar modelkeluar){
        list.set(index,modelkeluar);
        fireTableRowsUpdated(index, index);
    }
    
    public ModelSemBarangKeluar getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] columnNames = {"Product Code","Product Name","Product Category","Type","Merk","No Surat Keluar","Price","Qty Outcoming","SubTotal"};

    @Override
    public int getColumnCount() {
       return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
           case 0:
               return list.get(rowIndex).getDatabarang().getCodeDataBarang();
           case 1:
               return list.get(rowIndex).getDatabarang().getNamaProdukBarang();
           case 2:
               return list.get(rowIndex).getDatabarang().getJnsBarang().getNamaJenisBarang();
           case 3:
               return list.get(rowIndex).getDatabarang().getTypItems().getNameTypeItems();
           case 4:
               return list.get(rowIndex).getDatabarang().getProBrands().getNameProductBrand();
           case 5:
               return list.get(rowIndex).getDatabarang().getSatuan().getNamaSatuan();
           case 6:
               return list.get(rowIndex).getDatabarang().getPrice();
           case 7:
               return list.get(rowIndex).getModeldetkeluar().getSurat_keluar();    
           case 8:
               return list.get(rowIndex).getModeldetkeluar().getJml_keluar();
           case 9:
               return list.get(rowIndex).getModeldetkeluar().getSubtotal_keluar();    
           default:
               return null;
       }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
}
