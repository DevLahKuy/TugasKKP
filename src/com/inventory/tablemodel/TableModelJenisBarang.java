package com.inventory.tablemodel;

import com.inventory.model.ModelJenisBarang;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class TableModelJenisBarang extends AbstractTableModel {

    private List<ModelJenisBarang> list = new ArrayList<>();
    
    public ModelJenisBarang getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelJenisBarang> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    } 
    
    public void tambahData(ModelJenisBarang jenisbarang){
        list.add(jenisbarang);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelJenisBarang jenisbarang){
        list.set(row, jenisbarang);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    }
    
    public void hapusData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    private final String[] columnNames = {"ID", "Product Category"};
    
    
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
        ModelJenisBarang jenisbarang = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return jenisbarang.getIdJenisBarang();
            case 1:
                return jenisbarang.getNamaJenisBarang();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
    
}
