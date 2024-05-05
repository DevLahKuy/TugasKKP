
package com.inventory.form;


import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import com.inventory.service.ServiceReport;
import com.inventory.dao.ReportDAO;


public class FormLaporanDataBarang extends javax.swing.JPanel {

    private ServiceReport servis_report = new ReportDAO();
    
    public FormLaporanDataBarang() {
        initComponents();
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        viewData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        pnPilihLaporan = new javax.swing.JPanel();
        cbx_laporan = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        pn_Main = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        pn_dataBarang = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnPrintDataBarang = new javax.swing.JButton();
        pn_transaksiBarang = new javax.swing.JPanel();
        btnPrintTransaksiBarang = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pnTampilLaporan = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1067, 610));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        viewData.setBackground(new java.awt.Color(255, 255, 255));
        viewData.setPreferredSize(new java.awt.Dimension(1067, 616));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("LAPORAN > Laporan Data Barang");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Laporan Data Barang");

        pnPilihLaporan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbx_laporan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbx_laporan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Laporan --", "Laporan Data Barang", "Laporan Transaksi Barang" }));
        cbx_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx_laporanActionPerformed(evt);
            }
        });
        pnPilihLaporan.add(cbx_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 48, 245, 34));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setText("Pilih Jenis Laporan");
        pnPilihLaporan.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 245, 36));

        pn_Main.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MAIN");

        javax.swing.GroupLayout pn_MainLayout = new javax.swing.GroupLayout(pn_Main);
        pn_Main.setLayout(pn_MainLayout);
        pn_MainLayout.setHorizontalGroup(
            pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pn_MainLayout.setVerticalGroup(
            pn_MainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_MainLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel4)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pnPilihLaporan.add(pn_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 245, -1));

        btnKembali.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnKembali.setText("KEMBALI");
        btnKembali.setPreferredSize(new java.awt.Dimension(100, 30));
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        pnPilihLaporan.add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 288, -1, -1));

        pn_dataBarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Laporan Data Barang");

        btnPrintDataBarang.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnPrintDataBarang.setText("PRINT");
        btnPrintDataBarang.setPreferredSize(new java.awt.Dimension(100, 30));
        btnPrintDataBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintDataBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_dataBarangLayout = new javax.swing.GroupLayout(pn_dataBarang);
        pn_dataBarang.setLayout(pn_dataBarangLayout);
        pn_dataBarangLayout.setHorizontalGroup(
            pn_dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pn_dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_dataBarangLayout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addComponent(btnPrintDataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );
        pn_dataBarangLayout.setVerticalGroup(
            pn_dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dataBarangLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addContainerGap(135, Short.MAX_VALUE))
            .addGroup(pn_dataBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_dataBarangLayout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(btnPrintDataBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );

        pnPilihLaporan.add(pn_dataBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 245, -1));

        pn_transaksiBarang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPrintTransaksiBarang.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnPrintTransaksiBarang.setText("PRINT");
        btnPrintTransaksiBarang.setPreferredSize(new java.awt.Dimension(100, 30));
        btnPrintTransaksiBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintTransaksiBarangActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Laporan Transaksi Barang");

        javax.swing.GroupLayout pn_transaksiBarangLayout = new javax.swing.GroupLayout(pn_transaksiBarang);
        pn_transaksiBarang.setLayout(pn_transaksiBarangLayout);
        pn_transaksiBarangLayout.setHorizontalGroup(
            pn_transaksiBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_transaksiBarangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_transaksiBarangLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnPrintTransaksiBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_transaksiBarangLayout.setVerticalGroup(
            pn_transaksiBarangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_transaksiBarangLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addComponent(btnPrintTransaksiBarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pnPilihLaporan.add(pn_transaksiBarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 245, -1));

        javax.swing.GroupLayout pnTampilLaporanLayout = new javax.swing.GroupLayout(pnTampilLaporan);
        pnTampilLaporan.setLayout(pnTampilLaporanLayout);
        pnTampilLaporanLayout.setHorizontalGroup(
            pnTampilLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnTampilLaporanLayout.setVerticalGroup(
            pnTampilLaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout viewDataLayout = new javax.swing.GroupLayout(viewData);
        viewData.setLayout(viewDataLayout);
        viewDataLayout.setHorizontalGroup(
            viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(viewDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewDataLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(864, 874, Short.MAX_VALUE))
                    .addGroup(viewDataLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDataLayout.createSequentialGroup()
                        .addComponent(pnPilihLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnTampilLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(15, 15, 15))))
        );
        viewDataLayout.setVerticalGroup(
            viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewDataLayout.createSequentialGroup()
                        .addComponent(pnPilihLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(viewDataLayout.createSequentialGroup()
                        .addComponent(pnTampilLaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14)))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(viewData);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1090, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnPrintDataBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintDataBarangActionPerformed
        pnTampilLaporan.removeAll();
        servis_report.lapDataBarang(pnTampilLaporan);
    }//GEN-LAST:event_btnPrintDataBarangActionPerformed
        
    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
       
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void cbx_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_laporanActionPerformed
       if (cbx_laporan.getSelectedItem()== "--Pilih Jenis Laporan--"){
           pn_Main.setVisible(true);
           pn_dataBarang.setVisible(false);
           pn_transaksiBarang.setVisible(false);
       }else if(cbx_laporan.getSelectedItem()== "Laporan Data Barang"){
           pn_Main.setVisible(false);
           pn_dataBarang.setVisible(true);
           pn_transaksiBarang.setVisible(false);
       }else if(cbx_laporan.getSelectedItem()== "Laporan Transaksi Barang"){
           pn_Main.setVisible(false);
           pn_dataBarang.setVisible(false);
           pn_transaksiBarang.setVisible(true);
       }
    }//GEN-LAST:event_cbx_laporanActionPerformed

    private void btnPrintTransaksiBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintTransaksiBarangActionPerformed
        pnTampilLaporan.removeAll();
        servis_report.lapTransaksiBarang(pnTampilLaporan);
    }//GEN-LAST:event_btnPrintTransaksiBarangActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnPrintDataBarang;
    private javax.swing.JButton btnPrintTransaksiBarang;
    private javax.swing.JComboBox<String> cbx_laporan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnPilihLaporan;
    private javax.swing.JPanel pnTampilLaporan;
    private javax.swing.JPanel pn_Main;
    private javax.swing.JPanel pn_dataBarang;
    private javax.swing.JPanel pn_transaksiBarang;
    private javax.swing.JPanel viewData;
    // End of variables declaration//GEN-END:variables

    

    

    
    
    public void refreshTable(){
        
    }
}
