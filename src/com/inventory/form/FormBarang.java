
package com.inventory.form;

import com.inventory.dao.DataBarangDAO;
import com.inventory.model.ModelDataBarang;
import com.inventory.model.ModelJenisBarang;
import com.inventory.model.ModelProductBrands;
import com.inventory.model.ModelSatuan;
import com.inventory.model.ModelTypeItems;
import com.inventory.service.ServiceDataBarang;
import com.inventory.tablemodel.TableModelDataBarang;
import java.util.List;
import javax.swing.JOptionPane;





public class FormBarang extends javax.swing.JPanel {

    private final TableModelDataBarang tblModel = new TableModelDataBarang();
    private final ServiceDataBarang servis = new DataBarangDAO();
    
    
    public FormBarang() {
        initComponents();
        
        tblData.setModel(tblModel);
        t_id_JenisBarang.setVisible(false);
        t_id_ModelType.setVisible(false);
        t_id_MerkBrand.setVisible(false);
        t_id_Satuan.setVisible(false);
        btnSerialNumber.setVisible(false);
        loadData();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        viewData = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnTambah = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        txtPencarian = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        addData = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        t_kodeBarang = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        t_namaBarang = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        t_JenisBarang = new javax.swing.JTextField();
        btnJenisBarang = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        t_ModelType = new javax.swing.JTextField();
        btnModelType = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        t_MerkBrand = new javax.swing.JTextField();
        btnMerkBarang = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        t_Satuan = new javax.swing.JTextField();
        btnSatuan = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        t_Harga = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        t_Stok = new javax.swing.JTextField();
        btnTambah1 = new javax.swing.JButton();
        btnBatal1 = new javax.swing.JButton();
        t_id_JenisBarang = new javax.swing.JTextField();
        t_id_ModelType = new javax.swing.JTextField();
        t_id_MerkBrand = new javax.swing.JTextField();
        t_id_Satuan = new javax.swing.JTextField();
        serialNumber = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        btnSerialNumber = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1067, 610));
        setLayout(new java.awt.CardLayout());

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        viewData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel1.setText("DATA MASTER > Data Barang");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("Data Barang");

        btnTambah.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/icon/tambah.png"))); // NOI18N
        btnTambah.setText("TAMBAH");
        btnTambah.setPreferredSize(new java.awt.Dimension(100, 30));
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnBatal.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/icon/CANCEL.png"))); // NOI18N
        btnBatal.setText("BATAL");
        btnBatal.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/icon/delete.png"))); // NOI18N
        btnHapus.setText("HAPUS");
        btnHapus.setPreferredSize(new java.awt.Dimension(100, 30));
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        txtPencarian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPencarianActionPerformed(evt);
            }
        });
        txtPencarian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPencarianKeyReleased(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/icon/pencarian.png"))); // NOI18N

        tblData.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblData);

        javax.swing.GroupLayout viewDataLayout = new javax.swing.GroupLayout(viewData);
        viewData.setLayout(viewDataLayout);
        viewDataLayout.setHorizontalGroup(
            viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewDataLayout.createSequentialGroup()
                        .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(864, 864, 864))
                    .addGroup(viewDataLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(viewDataLayout.createSequentialGroup()
                                .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 361, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addComponent(jSeparator1)
        );
        viewDataLayout.setVerticalGroup(
            viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(viewDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTambah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txtPencarian, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(viewData, "card2");

        addData.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel4.setText("Data Barang > Tambah Data");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel5.setText("Tambah Data Barang");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel6.setText("Kode Barang");

        t_kodeBarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel7.setText("Nama Barang");

        t_namaBarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel8.setText("Jenis Barang");

        t_JenisBarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        btnJenisBarang.setBackground(new java.awt.Color(153, 153, 153));
        btnJenisBarang.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnJenisBarang.setText("Pilih");
        btnJenisBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJenisBarangActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel9.setText("Model / Type");

        t_ModelType.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        btnModelType.setBackground(new java.awt.Color(153, 153, 153));
        btnModelType.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnModelType.setText("Pilih");
        btnModelType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelTypeActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel10.setText("Merk Barang");

        t_MerkBrand.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        btnMerkBarang.setBackground(new java.awt.Color(153, 153, 153));
        btnMerkBarang.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnMerkBarang.setText("Pilih");
        btnMerkBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMerkBarangActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel11.setText("Satuan");

        t_Satuan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        btnSatuan.setBackground(new java.awt.Color(153, 153, 153));
        btnSatuan.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        btnSatuan.setText("Pilih");
        btnSatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSatuanActionPerformed(evt);
            }
        });

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel12.setText("Harga Barang");

        t_Harga.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel13.setText("Stock");

        t_Stok.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));

        btnTambah1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnTambah1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/icon/tambah.png"))); // NOI18N
        btnTambah1.setText("TAMBAH");
        btnTambah1.setPreferredSize(new java.awt.Dimension(100, 30));
        btnTambah1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambah1ActionPerformed(evt);
            }
        });

        btnBatal1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        btnBatal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/inventory/icon/CANCEL.png"))); // NOI18N
        btnBatal1.setText("BATAL");
        btnBatal1.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBatal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatal1ActionPerformed(evt);
            }
        });

        t_id_JenisBarang.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(153, 153, 153)));

        t_id_ModelType.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(153, 153, 153)));

        t_id_MerkBrand.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(153, 153, 153)));

        t_id_Satuan.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(153, 153, 153)));

        serialNumber.setMaximumSize(new java.awt.Dimension(25, 25));
        serialNumber.setMinimumSize(new java.awt.Dimension(25, 25));
        serialNumber.setPreferredSize(new java.awt.Dimension(25, 25));
        serialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNumberActionPerformed(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel14.setText("Mempunyai Serial Number");

        btnSerialNumber.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnSerialNumber.setText("Isi SN");
        btnSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialNumberActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(t_ModelType, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnModelType, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnJenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_Stok, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                                    .addComponent(t_Harga)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel13)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(serialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSerialNumber)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(109, 109, 109))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(t_JenisBarang, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                                    .addComponent(t_namaBarang)
                                    .addComponent(t_kodeBarang))
                                .addGap(26, 26, 26)
                                .addComponent(t_id_JenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(t_MerkBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(t_id_ModelType, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(33, 33, 33)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_id_MerkBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnMerkBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(t_Satuan, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(0, 364, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(t_id_Satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(t_kodeBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(t_Satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(t_namaBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(serialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(7, 7, 7))
                            .addComponent(btnSerialNumber)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnSatuan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_id_Satuan, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(t_id_JenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_JenisBarang, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t_ModelType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(t_MerkBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(btnJenisBarang))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(btnModelType))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_Stok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMerkBarang, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnTambah1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBatal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t_id_MerkBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(t_id_ModelType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout addDataLayout = new javax.swing.GroupLayout(addData);
        addData.setLayout(addDataLayout);
        addDataLayout.setHorizontalGroup(
            addDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(addDataLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(addDataLayout.createSequentialGroup()
                        .addGroup(addDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        addDataLayout.setVerticalGroup(
            addDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addDataLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel.add(addData, "card3");

        jScrollPane1.setViewportView(mainPanel);

        add(jScrollPane1, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        mainPanel.removeAll();
        mainPanel.repaint();
        mainPanel.revalidate();
        
        mainPanel.add(addData);
        mainPanel.repaint();
        mainPanel.revalidate();
        
        btnTambah1.setText("SIMPAN");
        btnJenisBarang.setEnabled(true);
        btnModelType.setEnabled(true);
        btnMerkBarang.setEnabled(true);
        btnSatuan.setEnabled(true);
        
        if(btnTambah.getText().equals("UBAH"))
        {
            dataTabel();
        }
        
        
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        viewPanel();
        loadData();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        deleteData();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtPencarianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPencarianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPencarianActionPerformed

    private void txtPencarianKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPencarianKeyReleased
        //searchData();
    }//GEN-LAST:event_txtPencarianKeyReleased

    private void btnTambah1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambah1ActionPerformed
        if(btnTambah1.getText().equals("TAMBAH"))
        {
            btnTambah1.setText("SIMPAN");
        }
        else if(btnTambah1.getText().equals("SIMPAN"))
        {
            saveData();
        }
        else if(btnTambah1.getText().equals("UBAH"))
        {
           changeData();
        }    
    }//GEN-LAST:event_btnTambah1ActionPerformed

    private void btnJenisBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJenisBarangActionPerformed
        boolean closable = true;
        
        FormDataJenisBarang djb = new FormDataJenisBarang(null, closable);
        djb.setVisible(true);
        
        t_id_JenisBarang.setText(djb.jenisbarang.getIdJenisBarang());
        t_JenisBarang.setText(djb.jenisbarang.getNamaJenisBarang());
        
        t_ModelType.requestFocus();
        aktif();
    }//GEN-LAST:event_btnJenisBarangActionPerformed

    private void btnModelTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelTypeActionPerformed
        boolean closable = true;
        
        FormDataModelType dmt = new FormDataModelType(null, closable);
        dmt.setVisible(true);
        
        t_id_ModelType.setText(dmt.model.getIdModelTypeItems());
        t_ModelType.setText(dmt.model.getNameTypeItems());
        
        t_MerkBrand.requestFocus();
        aktif();
    }//GEN-LAST:event_btnModelTypeActionPerformed

    private void btnMerkBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMerkBarangActionPerformed
        boolean closable = true;
        
        FormDataProductBrands dpb = new FormDataProductBrands(null, closable);
        dpb.setVisible(true);
        
        t_id_MerkBrand.setText(dpb.brand.getIdProductBrand());
        t_MerkBrand.setText(dpb.brand.getNameProductBrand());
        
        t_Satuan.requestFocus();
        aktif();
    }//GEN-LAST:event_btnMerkBarangActionPerformed

    private void btnSatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSatuanActionPerformed
        boolean closable = true;
        
        FormDataSatuan ds = new FormDataSatuan(null, closable);
        ds.setVisible(true);
        
        t_id_Satuan.setText(ds.unit.getIdSatuan());
        t_Satuan.setText(ds.unit.getNamaSatuan());
        
        t_Harga.requestFocus();
        aktif();
    }//GEN-LAST:event_btnSatuanActionPerformed

    private void btnBatal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatal1ActionPerformed
         viewPanel();
         loadData();
         resetForm();
    }//GEN-LAST:event_btnBatal1ActionPerformed

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        if(btnTambah.getText().equals("TAMBAH"))
        {
            btnTambah.setText("UBAH");
        }
        btnHapus.setVisible(true);
        btnBatal.setVisible(true);
    }//GEN-LAST:event_tblDataMouseClicked

    private void serialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNumberActionPerformed
        
        
        if (serialNumber.isSelected()) {

            btnSerialNumber.setVisible(true);

        } else {

            btnSerialNumber.setVisible(false);

        }
    }//GEN-LAST:event_serialNumberActionPerformed

    private void btnSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialNumberActionPerformed
        addData();
    }//GEN-LAST:event_btnSerialNumberActionPerformed
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addData;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnBatal1;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnJenisBarang;
    private javax.swing.JButton btnMerkBarang;
    private javax.swing.JButton btnModelType;
    private javax.swing.JButton btnSatuan;
    private javax.swing.JButton btnSerialNumber;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTambah1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JCheckBox serialNumber;
    private javax.swing.JTextField t_Harga;
    private javax.swing.JTextField t_JenisBarang;
    private javax.swing.JTextField t_MerkBrand;
    private javax.swing.JTextField t_ModelType;
    private javax.swing.JTextField t_Satuan;
    private javax.swing.JTextField t_Stok;
    private javax.swing.JTextField t_id_JenisBarang;
    private javax.swing.JTextField t_id_MerkBrand;
    private javax.swing.JTextField t_id_ModelType;
    private javax.swing.JTextField t_id_Satuan;
    private javax.swing.JTextField t_kodeBarang;
    private javax.swing.JTextField t_namaBarang;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtPencarian;
    private javax.swing.JPanel viewData;
    // End of variables declaration//GEN-END:variables

    private void aktif(){
        t_kodeBarang.setEnabled(true);
        t_namaBarang.setEnabled(true);
        t_Harga.setEnabled(true);
        t_Stok.setEnabled(true);
    }
    
    private void loadData() {
       btnHapus.setVisible(false);
       btnBatal.setVisible(false);
       List<ModelDataBarang> list = servis.getData();
       tblModel.setData(list);
    }

    private void viewPanel() {
        mainPanel.removeAll();
        mainPanel.add(viewData);
        mainPanel.repaint();
        mainPanel.revalidate();
    }

    private void resetForm() {
        btnTambah.requestFocus();
        btnTambah.setText("TAMBAH");
        t_kodeBarang.setText("");
        t_namaBarang.setText("");
        t_JenisBarang.setText("");
        t_id_JenisBarang.setText("");
        t_ModelType.setText("");
        t_id_ModelType.setText("");
        t_MerkBrand.setText("");
        t_id_MerkBrand.setText("");
        t_Satuan.setText("");
        t_id_Satuan.setText("");
        t_Harga.setText("");
        t_Stok.setText("");
    }

   
    
    

    private void saveData() {
        if(validasiInput() ==true){
            String codeDataBarang = t_kodeBarang.getText();
            String namaProdukBarang = t_namaBarang.getText();
            
            String idJenisBarang = t_id_JenisBarang.getText();
            String idModelTypeItems = t_id_ModelType.getText();
            String idProductBrand = t_id_MerkBrand.getText();
            String idSatuan = t_id_Satuan.getText();
            Long price = Long.parseLong(t_Harga.getText());
            int stock = Integer.parseInt(t_Stok.getText());
            
            ModelDataBarang barang = new ModelDataBarang();
            ModelJenisBarang jenisbarang = new ModelJenisBarang();
            ModelTypeItems model = new ModelTypeItems();
            ModelProductBrands productbrands = new ModelProductBrands();
            ModelSatuan unit = new ModelSatuan();
            
            barang.setCodeDataBarang(codeDataBarang);
            barang.setNamaProdukBarang(namaProdukBarang);
            jenisbarang.setIdJenisBarang(idJenisBarang);
            model.setIdModelTypeItems(idModelTypeItems);
            productbrands.setIdProductBrand(idProductBrand);
            unit.setIdSatuan(idSatuan);
            barang.setPrice(price);
            barang.setStock(stock);
            
            barang.setJnsBarang(jenisbarang);
            barang.setTypItems(model);
            barang.setProBrands(productbrands);
            barang.setSatuan(unit);
            
            servis.addData(barang);
            tblModel.insertData(barang);
            loadData();
            resetForm();
            viewPanel();
            btnTambah1.setText("TAMBAH");
        }
    }
    
    private void changeData() {
        int index = tblData.getSelectedRow();
        if (index != -1){
            ModelDataBarang mobar = tblModel.getData(tblData.convertRowIndexToModel(index));
            
            if(validasiInput() == true){
                String codeDataBarang = t_kodeBarang.getText();
                String namaProdukBarang = t_namaBarang.getText();
            
                String idJenisBarang = t_id_JenisBarang.getText();
                String idModelTypeItems = t_id_ModelType.getText();
                String idProductBrand = t_id_MerkBrand.getText();
                String idSatuan = t_id_Satuan.getText(); 
                Long price = Long.parseLong(t_Harga.getText());
                int stock = Integer.parseInt(t_Stok.getText());
                
                ModelDataBarang barang = new ModelDataBarang();
                ModelJenisBarang jenisbarang = new ModelJenisBarang();
                ModelTypeItems model = new ModelTypeItems();
                ModelProductBrands productbrands = new ModelProductBrands();
                ModelSatuan unit = new ModelSatuan();
            
                barang.setCodeDataBarang(codeDataBarang);
                barang.setNamaProdukBarang(namaProdukBarang);
                jenisbarang.setIdJenisBarang(idJenisBarang);
                model.setIdModelTypeItems(idModelTypeItems);
                productbrands.setIdProductBrand(idProductBrand);
                unit.setIdSatuan(idSatuan);
                barang.setPrice(price);
                barang.setStock(stock);
                
                barang.setJnsBarang(jenisbarang);
                barang.setTypItems(model);
                barang.setProBrands(productbrands);
                barang.setSatuan(unit);
                
                servis.updateData(barang);
                tblModel.updateData(index, barang);
                loadData();
                resetForm();
                viewPanel();
                
            }
        }
    }
    
    private void deleteData() {
        int index = tblData.getSelectedRow();
        if(index!=-1){
            ModelDataBarang barang = tblModel.getData(tblData.convertRowIndexToModel(index));
            if(JOptionPane.showConfirmDialog(null,"Yakin data akan dihapus ?", 
                   "Konfirmasi", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
           {
               servis.deleteData(barang);
               tblModel.deleteData(index);
               loadData();
           }   
           }else{
               JOptionPane.showMessageDialog(null,"Pilih dahulu Record yang akan diupdate");
               
           }
        }
    }
    
    private boolean validasiInput(){
        boolean valid = false;
        if(t_kodeBarang.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Kode Barang tidak boleh kosong");
        } else if (t_namaBarang.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Nama Barang tidak boleh kosong");
        } else if (t_JenisBarang.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Jenis Barang tidak boleh kosong");
        } else if (t_ModelType.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Model/Type tidak boleh kosong");
        } else if (t_MerkBrand.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Merk Barang tidak boleh kosong");
        } else if (t_Satuan.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Satuan Barang tidak boleh kosong");
        } else if (t_Harga.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Harga Barang tidak boleh kosong");
        } else if (t_Stok.getText().trim().isEmpty() ){
            JOptionPane.showMessageDialog(null, "Stok Barang tidak boleh kosong");
        } else{
            valid = true;
        }
        return valid;
    }

    private void dataTabel() {
       viewData.setVisible(false);
       addData.setVisible(true);
       
       int row = tblData.getSelectedRow();
       jLabel5.setText("UBAH DATA BARANG");
       
       t_JenisBarang.setEnabled(true);
       t_ModelType.setEnabled(true);
       t_MerkBrand.setEnabled(true);
       t_Satuan.setEnabled(true);
       
       t_kodeBarang.setText (tblData.getModel().getValueAt(row, 1).toString());
       t_namaBarang.setText (tblData.getModel().getValueAt(row, 2).toString());
       t_JenisBarang.setText (tblData.getModel().getValueAt(row, 3).toString());
       t_ModelType.setText(tblData.getModel().getValueAt(row, 4).toString());
       t_MerkBrand.setText(tblData.getModel().getValueAt(row, 5).toString());
       t_Satuan.setText(tblData.getModel().getValueAt(row, 6).toString());
       t_Harga.setText(tblData.getModel().getValueAt(row, 7).toString());
       t_Stok.setText(tblData.getModel().getValueAt(row, 8).toString());
       
       aktif();
       btnTambah1.setText("UBAH");
       btnBatal.setVisible(true);
    }

    private void addData() {
        FormInputSerialNumber formInput = new FormInputSerialNumber(null, true, 1, null, this);
        formInput.setVisible(true);
        loadData();
    }

    

    

    

   
    
}
