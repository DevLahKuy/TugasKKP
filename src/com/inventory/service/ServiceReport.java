 
package com.inventory.service;

import javax.swing.JPanel;
    
public interface ServiceReport {
    
        void lapDataBarang       (JPanel jp);
        void lapTransaksiBarang  (JPanel jp);
    
        void LapBarangMasukPerTransaksi (JPanel jp);
        void LapBarangMasukPerPeriode (JPanel jp, String tgl1, String tgl2);
        void LapBarangMasukPerBulan (JPanel jp, String dt1, String dt2);
        void LapBarangMasukPerSupplier (JPanel jp, String id);
        
        void LapBarangKeluarPerTransaksi (JPanel jp);
        void LapBarangKeluarPerPeriode (JPanel jp, String tgl1, String tgl2);
        void LapBarangKeluarPerBulan (JPanel jp, String dt1, String dt2);
        void LapBarangKeluarPerSupplier (JPanel jp, String id);
}
