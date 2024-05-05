
package com.inventory.tablemodel;

import com.inventory.model.ModelDataBarang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class TableModelDataBarang extends AbstractTableModel {
    
    private List<ModelDataBarang> list = new ArrayList<>();
    
    public void insertData(ModelDataBarang barang){
        list.add(barang);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelDataBarang barang){
        list.add(row, barang);
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
    
    public void setData(List<ModelDataBarang> list ){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    }
    
    public void setData(int index, ModelDataBarang barang){
        list.set(index, barang);
        fireTableRowsUpdated(index, index);
    }
    
    public ModelDataBarang getData(int index){
        return list.get(index);
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }
    
    private final String[] columnNames = {"ID","Product Code","Product Name","Product Category","Model / Type","Product Brand","Units","Price","Stock"};

    @Override
    public int getColumnCount() {
       return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       switch (columnIndex){
           case 0:
               return list.get(rowIndex).getIdDataBarang();
           case 1:
               return list.get(rowIndex).getCodeDataBarang();
           case 2:
               return list.get(rowIndex).getNamaProdukBarang();
           case 3:
               return list.get(rowIndex).getJnsBarang().getNamaJenisBarang();    
           case 4:
               return list.get(rowIndex).getTypItems().getNameTypeItems(); 
           case 5:
               return list.get(rowIndex).getProBrands().getNameProductBrand();
           case 6:
               return list.get(rowIndex).getSatuan().getNamaSatuan();    
           case 7:
               return list.get(rowIndex).getPrice();    
           case 8:
               return list.get(rowIndex).getStock();    
           default:
               return null;
       }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
    
}
