
package com.inventory.form;


import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;
import com.inventory.service.ServiceReport;
import com.inventory.dao.ReportDAO;


public class FormLaporanBarangMasuk extends javax.swing.JPanel {

    private ServiceReport servis_report = new ReportDAO();
    
    public FormLaporanBarangMasuk() {
        initComponents();
        
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        dateChooser2 = new com.raven.datechooser.DateChooser();
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
        pn_perTransaksi = new javax.swing.JPanel();
        btn_printTransaksi = new javax.swing.JButton();
        t_idTransaksi = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        pn_perPeriode = new javax.swing.JPanel();
        btn_printPeriode = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t_dateFrom = new javax.swing.JTextField();
        btnFrom = new javax.swing.JButton();
        t_dateAfter = new javax.swing.JTextField();
        btnAfter = new javax.swing.JButton();
        pn_perBulan = new javax.swing.JPanel();
        btn_printPerbulan = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jYearChooser1 = new com.toedter.calendar.JYearChooser();
        pn_perSupplier = new javax.swing.JPanel();
        btn_printSupplier = new javax.swing.JButton();
        t_Supplier = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        pnTampilLaporan = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1067, 610));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        viewData.setBackground(new java.awt.Color(255, 255, 255));
        viewData.setPreferredSize(new java.awt.Dimension(1067, 616));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("LAPORAN > Laporan Barang Masuk");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Laporan Barang Masuk");

        pnPilihLaporan.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbx_laporan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        cbx_laporan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Laporan --", "Per Transaksi", "Per Supplier", "Per Periode", "Per Bulan" }));
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
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pnPilihLaporan.add(pn_Main, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 245, 190));

        btnKembali.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnKembali.setText("KEMBALI");
        btnKembali.setPreferredSize(new java.awt.Dimension(100, 30));
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });
        pnPilihLaporan.add(btnKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        pn_perTransaksi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_printTransaksi.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_printTransaksi.setText("PRINT");
        btn_printTransaksi.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_printTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printTransaksiActionPerformed(evt);
            }
        });

        t_idTransaksi.setText("Id Transaksi");

        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_perTransaksiLayout = new javax.swing.GroupLayout(pn_perTransaksi);
        pn_perTransaksi.setLayout(pn_perTransaksiLayout);
        pn_perTransaksiLayout.setHorizontalGroup(
            pn_perTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perTransaksiLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btn_printTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_perTransaksiLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_idTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn_perTransaksiLayout.setVerticalGroup(
            pn_perTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perTransaksiLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(pn_perTransaksiLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_idTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(btn_printTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pnPilihLaporan.add(pn_perTransaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 245, -1));

        pn_perPeriode.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_printPeriode.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_printPeriode.setText("PRINT");
        btn_printPeriode.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_printPeriode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printPeriodeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Dari Tanggal");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Sampai Tanggal");

        btnFrom.setText("...");

        btnAfter.setText("...");

        javax.swing.GroupLayout pn_perPeriodeLayout = new javax.swing.GroupLayout(pn_perPeriode);
        pn_perPeriode.setLayout(pn_perPeriodeLayout);
        pn_perPeriodeLayout.setHorizontalGroup(
            pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btn_printPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                                        .addComponent(t_dateAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                                        .addComponent(t_dateFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pn_perPeriodeLayout.setVerticalGroup(
            pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(t_dateFrom)
                    .addComponent(btnFrom, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addGap(5, 5, 5)
                .addGroup(pn_perPeriodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(t_dateAfter)
                    .addGroup(pn_perPeriodeLayout.createSequentialGroup()
                        .addComponent(btnAfter, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_printPeriode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnPilihLaporan.add(pn_perPeriode, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 245, -1));

        pn_perBulan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_printPerbulan.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_printPerbulan.setText("PRINT");
        btn_printPerbulan.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_printPerbulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printPerbulanActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Bulan");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Tahun");

        jComboBox1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Bulan--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));

        javax.swing.GroupLayout pn_perBulanLayout = new javax.swing.GroupLayout(pn_perBulan);
        pn_perBulan.setLayout(pn_perBulanLayout);
        pn_perBulanLayout.setHorizontalGroup(
            pn_perBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perBulanLayout.createSequentialGroup()
                .addGroup(pn_perBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_perBulanLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btn_printPerbulan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pn_perBulanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_perBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                            .addGroup(pn_perBulanLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(pn_perBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        pn_perBulanLayout.setVerticalGroup(
            pn_perBulanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perBulanLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jYearChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_printPerbulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnPilihLaporan.add(pn_perBulan, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 245, -1));

        pn_perSupplier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btn_printSupplier.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btn_printSupplier.setText("PRINT");
        btn_printSupplier.setPreferredSize(new java.awt.Dimension(100, 30));
        btn_printSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printSupplierActionPerformed(evt);
            }
        });

        t_Supplier.setText("Supplier");

        jButton2.setText("...");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_perSupplierLayout = new javax.swing.GroupLayout(pn_perSupplier);
        pn_perSupplier.setLayout(pn_perSupplierLayout);
        pn_perSupplierLayout.setHorizontalGroup(
            pn_perSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perSupplierLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(btn_printSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_perSupplierLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(t_Supplier)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pn_perSupplierLayout.setVerticalGroup(
            pn_perSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_perSupplierLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(pn_perSupplierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_Supplier, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addComponent(btn_printSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pnPilihLaporan.add(pn_perSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 100, 245, -1));

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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(viewDataLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewDataLayout.createSequentialGroup()
                        .addComponent(pnPilihLaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void btn_printTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printTransaksiActionPerformed
        pnTampilLaporan.removeAll();
        servis_report.lapDataBarang(pnTampilLaporan);
    }//GEN-LAST:event_btn_printTransaksiActionPerformed
        
    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
       
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void cbx_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx_laporanActionPerformed
       if (cbx_laporan.getSelectedItem()== "--Pilih Jenis Laporan--"){
           pn_Main.setVisible(true);
           pn_perTransaksi.setVisible(false);
           pn_perPeriode.setVisible(false);
           pn_perBulan.setVisible(false);
           pn_perSupplier.setVisible(false);
       }else if(cbx_laporan.getSelectedItem()== "Per Transaksi"){
           pn_Main.setVisible(false);
           pn_perTransaksi.setVisible(true);
           pn_perPeriode.setVisible(false);
           pn_perBulan.setVisible(false);
           pn_perSupplier.setVisible(false);
       }else if(cbx_laporan.getSelectedItem()== "Per Periode"){
           pn_Main.setVisible(false);
           pn_perTransaksi.setVisible(false);
           pn_perPeriode.setVisible(true);
           pn_perBulan.setVisible(false);
           pn_perSupplier.setVisible(false);
       }else if(cbx_laporan.getSelectedItem()== "Per Bulan"){
           pn_Main.setVisible(false);
           pn_perTransaksi.setVisible(false);
           pn_perPeriode.setVisible(false);
           pn_perBulan.setVisible(true);
           pn_perSupplier.setVisible(false);
       }else if(cbx_laporan.getSelectedItem()== "Per Supplier"){
           pn_Main.setVisible(false);
           pn_perTransaksi.setVisible(false);
           pn_perPeriode.setVisible(false);
           pn_perBulan.setVisible(false);
           pn_perSupplier.setVisible(true);
       }   
    }//GEN-LAST:event_cbx_laporanActionPerformed

    private void btn_printPeriodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printPeriodeActionPerformed
      
    }//GEN-LAST:event_btn_printPeriodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_printPerbulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printPerbulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_printPerbulanActionPerformed

    private void btn_printSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printSupplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_printSupplierActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfter;
    private javax.swing.JButton btnFrom;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btn_printPerbulan;
    private javax.swing.JButton btn_printPeriode;
    private javax.swing.JButton btn_printSupplier;
    private javax.swing.JButton btn_printTransaksi;
    private javax.swing.JComboBox<String> cbx_laporan;
    private com.raven.datechooser.DateChooser dateChooser1;
    private com.raven.datechooser.DateChooser dateChooser2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JYearChooser jYearChooser1;
    private javax.swing.JPanel pnPilihLaporan;
    private javax.swing.JPanel pnTampilLaporan;
    private javax.swing.JPanel pn_Main;
    private javax.swing.JPanel pn_perBulan;
    private javax.swing.JPanel pn_perPeriode;
    private javax.swing.JPanel pn_perSupplier;
    private javax.swing.JPanel pn_perTransaksi;
    private javax.swing.JTextField t_Supplier;
    private javax.swing.JTextField t_dateAfter;
    private javax.swing.JTextField t_dateFrom;
    private javax.swing.JTextField t_idTransaksi;
    private javax.swing.JPanel viewData;
    // End of variables declaration//GEN-END:variables

    

    

    
    
    public void refreshTable(){
        
    }
}
