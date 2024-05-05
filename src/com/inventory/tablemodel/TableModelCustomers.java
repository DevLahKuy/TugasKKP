package com.inventory.tablemodel;


import com.inventory.model.ModelCustomers;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class TableModelCustomers extends AbstractTableModel {

    private List<ModelCustomers> list = new ArrayList<>();
    
    public ModelCustomers getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelCustomers> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    } 
    
    public void addData(ModelCustomers cust){
        list.add(cust);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelCustomers cust){
        list.set(row, cust);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    }
    
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    private final String[] columnNames = {"ID", "Customers","Address", "No Telepon", "Email"};
    
    
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
        ModelCustomers cust = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return cust.getIdCustomers();
            case 1:
                return cust.getNameCustomers();
            case 2:
                return cust.getAddressCustomers();
            case 3:
                return cust.getPhoneCustomers();
            case 4:
                return cust.getEmailCustomers();    
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
    
}
