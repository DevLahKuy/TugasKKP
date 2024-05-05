package com.inventory.tablemodel;

import com.inventory.model.ModelSatuan;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class TableModelSatuan extends AbstractTableModel {

    private List<ModelSatuan> list = new ArrayList<>();
    private ModelSatuan Satuan;
    
    public ModelSatuan getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelSatuan> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    } 
    
    public void tambahData(ModelSatuan Satuan){
        list.add(Satuan);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelSatuan satuan){
        list.set(row, Satuan);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    }
    
    public void hapusData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    private final String[] columnNames = {"ID", "Units"};
    
    
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
        ModelSatuan Satuan = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return Satuan.getIdSatuan();
            case 1:
                return Satuan.getNamaSatuan();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }

    public void deleteData(int row){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
