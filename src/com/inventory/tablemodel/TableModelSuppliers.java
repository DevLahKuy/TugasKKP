package com.inventory.tablemodel;


import com.inventory.model.ModelSuppliers;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class TableModelSuppliers extends AbstractTableModel {

    private List<ModelSuppliers> list = new ArrayList<>();
    
    public ModelSuppliers getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelSuppliers> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    } 
    
    public void addData(ModelSuppliers model){
        list.add(model);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelSuppliers model){
        list.set(row, model);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    }
    
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    private final String[] columnNames = {"ID", "Supplier","Address", "No Telepon", "Email"};
    
    
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
        ModelSuppliers model = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return model.getIdSuppliers();
            case 1:
                return model.getNameSuppliers();
            case 2:
                return model.getAddressSuppliers();
            case 3:
                return model.getPhoneSuppliers();
            case 4:
                return model.getEmailSuppliers();    
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
    
}
