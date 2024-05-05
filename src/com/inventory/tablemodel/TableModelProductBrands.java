package com.inventory.tablemodel;

import com.inventory.model.ModelProductBrands;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class TableModelProductBrands extends AbstractTableModel {

    private List<ModelProductBrands> list = new ArrayList<>();
    
    public ModelProductBrands getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelProductBrands> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    } 
    
    public void addData(ModelProductBrands brand){
        list.add(brand);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelProductBrands brand){
        list.set(row, brand);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    }
    
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    private final String[] columnNames = {"ID", "Product Brand"};
    
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ModelProductBrands brand = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return brand.getIdProductBrand();
            case 1:
                return brand.getNameProductBrand();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
    
}
