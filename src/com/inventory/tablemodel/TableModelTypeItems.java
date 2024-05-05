package com.inventory.tablemodel;


import com.inventory.model.ModelTypeItems;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class TableModelTypeItems extends AbstractTableModel {

    private List<ModelTypeItems> list = new ArrayList<>();
    
    public ModelTypeItems getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelTypeItems> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    } 
    
    public void addData(ModelTypeItems model){
        list.add(model);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelTypeItems model){
        list.set(row, model);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    }
    
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    private final String[] columnNames = {"ID", "Type / Model"};
    
    
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
        ModelTypeItems model = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return model.getIdModelTypeItems();
            case 1:
                return model.getNameTypeItems();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
    
}
