
package com.inventory.dao;

import com.inventory.config.Koneksi;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.HashMap;
import java.awt.BorderLayout;
import com.inventory.service.ServiceReport;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.view.JRViewer;
//import net.sf.jasperreports.view.JasperViewer;



public class ReportDAO implements ServiceReport {
    
    private Connection conn;
    
    public ReportDAO(){
        conn = Koneksi.getConnection();
    }

    

    @Override
    public void lapTransaksiBarang(JPanel jp) {
       try{
                String reportPath = "src/com/inventory/report/lapStokBarang.jasper";
                HashMap parameters = new HashMap();
                
                //JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                // view panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                // jp.add(new JRViewer(print));
                jp.revalidate();
        } catch (Exception e){
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void lapDataBarang(JPanel jp) {
        try{
                String reportPath = "src/com/inventory/report/lapDataBarang.jasper";
                HashMap parameters = new HashMap();
                
                //JasperPrint print = JasperFillManager.fillReport(reportPath, parameters, conn);
                // view panel
                jp.setLayout(new BorderLayout());
                jp.repaint();
                //jp.add(new JRViewer(print));
                jp.revalidate();
        } catch (Exception e){
            JOptionPane.showConfirmDialog(null, e.getMessage());
        }
    }

    @Override
    public void LapBarangMasukPerTransaksi(JPanel jp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void LapBarangMasukPerPeriode(JPanel jp, String tgl1, String tgl2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void LapBarangMasukPerBulan(JPanel jp, String dt1, String dt2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void LapBarangMasukPerSupplier(JPanel jp, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void LapBarangKeluarPerTransaksi(JPanel jp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void LapBarangKeluarPerPeriode(JPanel jp, String tgl1, String tgl2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void LapBarangKeluarPerBulan(JPanel jp, String dt1, String dt2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void LapBarangKeluarPerSupplier(JPanel jp, String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
