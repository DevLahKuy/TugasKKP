package com.inventory.tablemodel;


import com.inventory.model.ModelUsers;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;


public class TableModelUsers extends AbstractTableModel {

    private List<ModelUsers> list = new ArrayList<>();
    
    public ModelUsers getData(int index){
        return list.get(index);
    }
    
    public void clear(){
        list.clear();
        fireTableDataChanged();
    }
    
    public void setData(List<ModelUsers> list){
        clear();
        this.list.addAll(list);
        fireTableDataChanged();
    } 
    
    public void addData(ModelUsers users){
        list.add(users);
        fireTableRowsInserted(list.size() - 1, list.size() -1);
        JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
    }
    
    public void updateData(int row, ModelUsers users){
        list.set(row, users);
        fireTableDataChanged();
        JOptionPane.showMessageDialog(null, "Data Berhasil Diubah");
    }
    
    public void deleteData(int row){
        list.remove(row);
        fireTableRowsDeleted(row, row);
        JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
    }
    
    private final String[] columnNames = {"ID", "Nama Users", "Username", "Email", "Role"};
    
    
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
        ModelUsers users = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return "    " + users.getIdUsers();
            case 1:
                return users.getNameUsers();
            case 2:
                return users.getUsername();
            case 3:
                return users.getEmail();
            case 4:
                return users.getRole();
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        return columnNames[column];
    }
    
}
