
package Catatan_Keuangan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Catatan_Keuangan extends javax.swing.JFrame {

   DefaultTableModel model;
   DefaultTableModel model2;
   
   public Catatan_Keuangan() {
        initComponents();
        String []judul={"NO. TRANSAKSI","KATEGORI","KETERANGAN","TANGAL TRANSAKSI","JUMLAH UANG", "USER"};
        model = new DefaultTableModel (judul,0);
        TabelData_Pemasukan.setModel(model);
        tampilkan1();
        model2 = new DefaultTableModel (judul,0);
        TabelData_Pengeluaran.setModel(model2);
        tampilkan2();
    }
   private void tampilkan1(){
        int row = TabelData_Pemasukan.getRowCount();
        
        for (int a=0; a<row;a++){
            model.removeRow(0);
        }try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Data_Pemasukan_Keuangan","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM Data_Transaksi");
            while(rs.next()){
                String data[]={rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), 
                               rs.getString(5), rs.getString(6)};
                model.addRow(data);
            }
        }catch (SQLException ex){
            Logger.getLogger(Catatan_Keuangan.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
   private void tampilkan2(){
        int row = TabelData_Pengeluaran.getRowCount();
        
        for (int a=0; a<row;a++){
            model2.removeRow(0);
        }try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Data_Pengeluaran","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM Data_Transaksi");
            while(rs.next()){
                String data[]={rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                               rs.getString(5), rs.getString(6)};
                model2.addRow(data);
            }
        }catch (SQLException ex){
            Logger.getLogger(Catatan_Keuangan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    private void reset(){
        NoTransaksi.setText("");
        Kategori.getSelectedItem();
        Keterangan.setText("");
        Tgl_Transaksi.setText("");
        JmlUang.setText("");
        USER.setText("");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelData_Pemasukan = new javax.swing.JTable();
        Total_Pengeluaran = new javax.swing.JTextField();
        Total_Pemasukan = new javax.swing.JTextField();
        Delete_Pengeluaran = new javax.swing.JButton();
        BtnEdit_Pemasukan = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelData_Pengeluaran = new javax.swing.JTable();
        Delete_Pemasukan = new javax.swing.JButton();
        btn_Total_Pemasukan = new javax.swing.JButton();
        Btn_Total_Pengeluaran = new javax.swing.JButton();
        Btn_Selisih = new javax.swing.JButton();
        Selisih1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Tgl_Transaksi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NoTransaksi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Kategori = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        Keterangan = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JmlUang = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        USER = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        BtnEdit_Pengeluaran = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        BtnSimpanPengeluaran = new javax.swing.JButton();
        BtnSimpanPemasukan = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        Btn_Exit = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 204));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("CATATAN TRANSAKSI KEUANGAN ");

        TabelData_Pemasukan.setBackground(new java.awt.Color(0, 255, 51));
        TabelData_Pemasukan.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TabelData_Pemasukan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NO. TRANSAKSI", "KATEGORI", "KETERANGAN", "TANGGAL TRANSAKSI", "JUMLAH UANG", "USER"
            }
        ));
        TabelData_Pemasukan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelData_PemasukanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelData_Pemasukan);
        if (TabelData_Pemasukan.getColumnModel().getColumnCount() > 0) {
            TabelData_Pemasukan.getColumnModel().getColumn(0).setResizable(false);
        }

        Total_Pengeluaran.setBackground(new java.awt.Color(255, 51, 255));
        Total_Pengeluaran.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        Total_Pemasukan.setBackground(new java.awt.Color(255, 51, 255));
        Total_Pemasukan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Total_Pemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Total_PemasukanActionPerformed(evt);
            }
        });

        Delete_Pengeluaran.setBackground(new java.awt.Color(255, 255, 51));
        Delete_Pengeluaran.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Delete_Pengeluaran.setText("HAPUS DATA");
        Delete_Pengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_PengeluaranActionPerformed(evt);
            }
        });

        BtnEdit_Pemasukan.setBackground(new java.awt.Color(255, 0, 0));
        BtnEdit_Pemasukan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnEdit_Pemasukan.setText("EDIT DATA ");
        BtnEdit_Pemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEdit_PemasukanActionPerformed(evt);
            }
        });

        TabelData_Pengeluaran.setBackground(new java.awt.Color(255, 255, 102));
        TabelData_Pengeluaran.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NO. TRANSAKSI", "KATEGORI", "KETERANGAN", "TANGGAL TRANSAKSI", "JUMLAH UANG", "USER"
            }
        ));
        TabelData_Pengeluaran.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelData_PengeluaranMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TabelData_Pengeluaran);

        Delete_Pemasukan.setBackground(new java.awt.Color(0, 255, 51));
        Delete_Pemasukan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Delete_Pemasukan.setText("HAPUS DATA");
        Delete_Pemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_PemasukanActionPerformed(evt);
            }
        });

        btn_Total_Pemasukan.setBackground(new java.awt.Color(0, 255, 204));
        btn_Total_Pemasukan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Total_Pemasukan.setText("TOTAL PEMASUKAN");
        btn_Total_Pemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Total_PemasukanActionPerformed(evt);
            }
        });

        Btn_Total_Pengeluaran.setBackground(new java.awt.Color(0, 204, 204));
        Btn_Total_Pengeluaran.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Btn_Total_Pengeluaran.setText("TOTAL PENGELUARAN");
        Btn_Total_Pengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Total_PengeluaranActionPerformed(evt);
            }
        });

        Btn_Selisih.setBackground(new java.awt.Color(255, 255, 0));
        Btn_Selisih.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Btn_Selisih.setText("JUMLAH SALDO");
        Btn_Selisih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SelisihActionPerformed(evt);
            }
        });

        Selisih1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Selisih1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Selisih1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Tanggal Transaksi");

        Tgl_Transaksi.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("No. Transaksi");

        NoTransaksi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Kategori");

        Kategori.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Kategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PILIH KATEGORI", "PEMASUKAN", "PENGELUARAN", "" }));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setText("Keterangan");

        Keterangan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Jumlah Uang");

        JmlUang.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("USER");

        USER.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel12.setText("YYYY-MM-DD");

        jLabel14.setBackground(new java.awt.Color(255, 255, 102));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Rp.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(jLabel14)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JmlUang, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(NoTransaksi))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Keterangan)
                            .addComponent(Tgl_Transaksi, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NoTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Keterangan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Tgl_Transaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JmlUang, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        BtnEdit_Pengeluaran.setBackground(new java.awt.Color(255, 0, 0));
        BtnEdit_Pengeluaran.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BtnEdit_Pengeluaran.setText("EDIT DATA");
        BtnEdit_Pengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEdit_PengeluaranActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Rp.");

        jLabel8.setBackground(new java.awt.Color(255, 255, 102));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Rp.");

        jPanel2.setBackground(new java.awt.Color(153, 255, 204));

        jLabel13.setText("*Masukkan Data Transaksi");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(160, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 0));

        jLabel10.setText("DATA PEMASUKAN ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 0));

        jLabel11.setText("DATA PENGELUARAN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        BtnSimpanPengeluaran.setBackground(new java.awt.Color(255, 0, 51));
        BtnSimpanPengeluaran.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnSimpanPengeluaran.setText("SIMPAN PENGELUARAN");
        BtnSimpanPengeluaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanPengeluaranActionPerformed(evt);
            }
        });

        BtnSimpanPemasukan.setBackground(new java.awt.Color(0, 255, 0));
        BtnSimpanPemasukan.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnSimpanPemasukan.setText("SIMPAN PEMASUKAN");
        BtnSimpanPemasukan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSimpanPemasukanActionPerformed(evt);
            }
        });

        BtnReset.setBackground(new java.awt.Color(255, 255, 0));
        BtnReset.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnReset.setText("RESET");
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });

        Btn_Exit.setBackground(new java.awt.Color(255, 255, 255));
        Btn_Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_Exit.setText("EXIT");
        Btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BtnSimpanPemasukan)
                    .addComponent(Btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnSimpanPengeluaran)
                    .addComponent(BtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSimpanPemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSimpanPengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jLabel16.setBackground(new java.awt.Color(255, 255, 102));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Rp.");

        jPanel6.setBackground(new java.awt.Color(102, 255, 204));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Pilih menu");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(52, 52, 52))
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(Btn_Total_Pengeluaran)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Total_Pengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btn_Total_Pemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(22, 22, 22)
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(Total_Pemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(Btn_Selisih)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel16)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Selisih1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnEdit_Pemasukan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Delete_Pemasukan))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BtnEdit_Pengeluaran)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Delete_Pengeluaran)))
                            .addContainerGap()))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(418, 418, 418)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BtnEdit_Pemasukan)
                                .addComponent(Delete_Pemasukan))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BtnEdit_Pengeluaran)
                                    .addComponent(Delete_Pengeluaran)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btn_Total_Pemasukan, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Selisih1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Total_Pemasukan, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Btn_Selisih, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel16))))
                                .addGap(18, 18, 18)
                                .addComponent(Btn_Total_Pengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Total_Pengeluaran, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        reset();
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnEdit_PemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEdit_PemasukanActionPerformed
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Data_Pemasukan_Keuangan","root","");
            cn.createStatement().executeUpdate("UPDATE Data_Transaksi SET Kategori='"+Kategori.getSelectedItem()+
                    "',Keterangan='"+Keterangan.getText()+"',Tanggal_Transaksi='"+Tgl_Transaksi.getText()+
                    "',Jumlah_Uang='"+JmlUang.getText()+"',USER='"+USER.getText()+
                    "'WHERE NoTransaksi='"+NoTransaksi.getText()+"'");
            tampilkan1();
            reset();
            
        }catch (SQLException ex){
            Logger.getLogger(Catatan_Keuangan.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_BtnEdit_PemasukanActionPerformed

    private void TabelData_PemasukanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelData_PemasukanMouseClicked
       int i = TabelData_Pemasukan.getSelectedRow();
       if(i>-6){
           NoTransaksi.setText(model.getValueAt(i, 0).toString());
                   
           Keterangan.setText(model.getValueAt(i, 2).toString());
           Tgl_Transaksi.setText(model.getValueAt(i, 3).toString());
           JmlUang.setText(model.getValueAt(i, 4).toString());
           USER.setText(model.getValueAt(i, 5).toString());
       
       }
    }//GEN-LAST:event_TabelData_PemasukanMouseClicked

    private void BtnSimpanPengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanPengeluaranActionPerformed
        
       try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Data_Pengeluaran","root","");
            cn.createStatement().executeUpdate("INSERT INTO Data_Transaksi VALUES"+"('"+NoTransaksi.getText()+"','"+
               Kategori.getSelectedItem()+"','"+Keterangan.getText()+"','"+Tgl_Transaksi.getText()+"','"+JmlUang.getText()+"','"+USER.getText()+"')");
            
            tampilkan2();
            reset();
       }catch(SQLException ex){
           Logger.getLogger(Catatan_Keuangan.class.getName()).log(Level.SEVERE, null, ex);
       }
    
    }//GEN-LAST:event_BtnSimpanPengeluaranActionPerformed

    private void Delete_PengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_PengeluaranActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Data_Pengeluaran","root","");
            cn.createStatement().executeUpdate("DELETE FROM Data_Transaksi WHERE NoTransaksi='"+NoTransaksi.getText()+"'");
            tampilkan2();
            reset();
        }catch (SQLException ex){
            Logger.getLogger(Catatan_Keuangan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Delete_PengeluaranActionPerformed

    private void Total_PemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Total_PemasukanActionPerformed
        
    }//GEN-LAST:event_Total_PemasukanActionPerformed

    private void TabelData_PengeluaranMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelData_PengeluaranMouseClicked
       int i = TabelData_Pengeluaran.getSelectedRow();
       if(i>-6){
           NoTransaksi.setText(model2.getValueAt(i, 0).toString());
                     
           Keterangan.setText(model2.getValueAt(i, 2).toString());
           Tgl_Transaksi.setText(model2.getValueAt(i, 3).toString());
           JmlUang.setText(model2.getValueAt(i, 4).toString());
           USER.setText(model2.getValueAt(i, 5).toString());
           
       }
    }//GEN-LAST:event_TabelData_PengeluaranMouseClicked

    private void BtnSimpanPemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSimpanPemasukanActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Data_Pemasukan_Keuangan","root","");
            cn.createStatement().executeUpdate("INSERT INTO Data_Transaksi VALUES"+"('"+NoTransaksi.getText()+"','"+
               Kategori.getSelectedItem()+"','"+Keterangan.getText()+"','"+Tgl_Transaksi.getText()+"','"+JmlUang.getText()+"','"+USER.getText()+"')");
            
            tampilkan1();
            reset();
       }catch(SQLException ex){
           Logger.getLogger(Catatan_Keuangan.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_BtnSimpanPemasukanActionPerformed

    private void Delete_PemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_PemasukanActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Data_Pemasukan_Keuangan","root","");
            cn.createStatement().executeUpdate("DELETE FROM Data_Transaksi WHERE NoTransaksi='"+NoTransaksi.getText()+"'");
            tampilkan1();
            reset();
        }catch (SQLException ex){
            Logger.getLogger(Catatan_Keuangan.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_Delete_PemasukanActionPerformed

    private void btn_Total_PemasukanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Total_PemasukanActionPerformed
        int total = 0;
        for (int y = 0; y < TabelData_Pemasukan.getRowCount(); y++){
            total+=Integer.parseInt(TabelData_Pemasukan.getValueAt(y, 4).toString());
        }
        Total_Pemasukan.setText(total+".00");
    }//GEN-LAST:event_btn_Total_PemasukanActionPerformed

    private void Btn_Total_PengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Total_PengeluaranActionPerformed
        int total = 0;
        for (int y = 0; y < TabelData_Pengeluaran.getRowCount(); y++){
            total+=Integer.parseInt(TabelData_Pengeluaran.getValueAt(y, 4).toString());
        }
        Total_Pengeluaran.setText(total+".00");
    }//GEN-LAST:event_Btn_Total_PengeluaranActionPerformed

    private void BtnEdit_PengeluaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEdit_PengeluaranActionPerformed
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/data_pengeluaran","root","");
            cn.createStatement().executeUpdate("UPDATE Data_Transaksi SET Kategori='"+Kategori.getSelectedItem()+
                    "',Jenis='"+Keterangan.getText()+"',Tanggal_Transaksi='"+Tgl_Transaksi.getText()+
                    "',Jumlah_Uang='"+JmlUang.getText()+"',USER='"+USER.getText()+
                    "'WHERE NoTransaksi='"+NoTransaksi.getText()+"'");
            tampilkan2();
            reset();
            
        }catch (SQLException ex){
            Logger.getLogger(Catatan_Keuangan.class.getName()).log(Level.SEVERE, null, ex);
        }      
    }//GEN-LAST:event_BtnEdit_PengeluaranActionPerformed

    private void Selisih1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Selisih1ActionPerformed
        
    }//GEN-LAST:event_Selisih1ActionPerformed

    private void Btn_SelisihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SelisihActionPerformed
        int Selisih = 0;
        int total1 = 0, total2 = 0;
        for (int y = 0; y < TabelData_Pemasukan.getRowCount(); y++){
            total1+=Integer.parseInt(TabelData_Pemasukan.getValueAt(y, 4).toString());
        }
            for (int y = 0; y < TabelData_Pengeluaran.getRowCount(); y++){
                total2+=Integer.parseInt(TabelData_Pengeluaran.getValueAt(y, 4).toString());
            }
            Selisih=total1-total2;
        
       Selisih1.setText(Selisih+".00");
    }//GEN-LAST:event_Btn_SelisihActionPerformed

    private void Btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ExitActionPerformed
        int answer = JOptionPane.showConfirmDialog(null, "Keluar dari Aplikasi ?", "Opsi", JOptionPane.OK_OPTION);
        if (answer == JOptionPane.OK_OPTION){
            dispose();
        }
    }//GEN-LAST:event_Btn_ExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Catatan_Keuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catatan_Keuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catatan_Keuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catatan_Keuangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catatan_Keuangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEdit_Pemasukan;
    private javax.swing.JButton BtnEdit_Pengeluaran;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnSimpanPemasukan;
    private javax.swing.JButton BtnSimpanPengeluaran;
    private javax.swing.JButton Btn_Exit;
    private javax.swing.JButton Btn_Selisih;
    private javax.swing.JButton Btn_Total_Pengeluaran;
    private javax.swing.JButton Delete_Pemasukan;
    private javax.swing.JButton Delete_Pengeluaran;
    private javax.swing.JTextField JmlUang;
    private javax.swing.JComboBox<String> Kategori;
    private javax.swing.JTextField Keterangan;
    private javax.swing.JTextField NoTransaksi;
    private javax.swing.JTextField Selisih1;
    private javax.swing.JTable TabelData_Pemasukan;
    private javax.swing.JTable TabelData_Pengeluaran;
    private javax.swing.JTextField Tgl_Transaksi;
    private javax.swing.JTextField Total_Pemasukan;
    private javax.swing.JTextField Total_Pengeluaran;
    private javax.swing.JTextField USER;
    private javax.swing.JButton btn_Total_Pemasukan;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    
}
