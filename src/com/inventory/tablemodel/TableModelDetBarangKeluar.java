
package com.inventory.tablemodel;

import com.inventory.model.ModelDetBarangKeluar;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class TableModelDetBarangKeluar extends AbstractTableModel {
    
    private List<ModelDetBarangKeluar> list = new ArrayList<>();
    
    public void addData(ModelDetBarangKeluar  modeldetkeluar){
        list.add( modeldetkeluar);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelDetBarangKeluar  modeldetkeluar){
        list.add(row,  modeldetkeluar);
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
    
    public void setData(List<ModelDetBarangKeluar> list ){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, ModelDetBarangKeluar modelkeluar){
        list.set(index,modelkeluar);
        fireTableRowsUpdated(index, index);
    }
    
    public ModelDetBarangKeluar getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] columnNames = {"ID","Product Code","Product Name","Product Category","Type","Merk","No Surat Keluar","Price","Qty Outcoming","SubTotal"};

    @Override
    public int getColumnCount() {
       return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
           case 0:
               return list.get(rowIndex).getModelkeluar().getIdBarang_Keluar();
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
               return list.get(rowIndex).getSurat_keluar();    
           case 7:
               return list.get(rowIndex).getDatabarang().getPrice();
           case 8:
               return list.get(rowIndex).getJml_keluar();
           case 9:
               return list.get(rowIndex).getSubtotal_keluar();    
           default:
               return null;
       }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
}
