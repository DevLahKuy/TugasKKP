package com.inventory.tablemodel;

import com.inventory.model.ModelSerialNumber;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class TableModelSerialNumber extends AbstractTableModel {

    private List<ModelSerialNumber> list = new ArrayList<>();
    private ModelSerialNumber sn;
    
    public ModelSerialNumber getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelSerialNumber> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    } 
    
    public void addData(ModelSerialNumber sn){
        list.add(sn);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelSerialNumber sn){
        list.get(row);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    }
    
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    private final String[] columnNames = {"No", "Serial Number", "ID_Product"};
    
    
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
        ModelSerialNumber sn = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return list.get(rowIndex).getIdSerialNumber();
            case 1:
                return list.get(rowIndex).getNameSerialNumber();
            case 2:
                return list.get(rowIndex).getMdlData().getIdDataBarang();    
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }

    
}
