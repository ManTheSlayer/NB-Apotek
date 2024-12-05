/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author lukma
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Obat extends javax.swing.JFrame {

    /**
     * Creates new form Obat
     */
    DefaultTableModel model;
    
    public Obat() {
        initComponents();
        String[] judul = {"Kode Obat", "Nama Obat", "Harga", "Jumlah", "Jenis"};
        model = new DefaultTableModel(judul, 0);
        table.setModel(model);
        tampilkan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        kode_obat = new javax.swing.JTextField();
        nama_obat = new javax.swing.JTextField();
        jumlah = new javax.swing.JTextField();
        harga = new javax.swing.JTextField();
        jenis = new javax.swing.JTextField();
        btn_tambah = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_hapus = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btn_cari = new javax.swing.JButton();
        txtCari = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel1.setText("Apotek Gunafarma");

        jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel2.setText("Kode Obat");

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel3.setText("Nama Obat");

        jLabel4.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel4.setText("Harga");

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel5.setText("Jenis");

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 14)); // NOI18N
        jLabel6.setText("Jumlah");

        kode_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_obatActionPerformed(evt);
            }
        });

        nama_obat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_obatActionPerformed(evt);
            }
        });

        jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jumlahActionPerformed(evt);
            }
        });

        harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaActionPerformed(evt);
            }
        });

        jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jenisActionPerformed(evt);
            }
        });

        btn_tambah.setBackground(new java.awt.Color(102, 204, 255));
        btn_tambah.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(255, 204, 102));
        btn_edit.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_hapus.setBackground(new java.awt.Color(255, 153, 153));
        btn_hapus.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(204, 255, 204));
        btn_reset.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Gill Sans MT", 1, 14)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);

        btn_cari.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        btn_cari.setText("Cari");
        btn_cari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariActionPerformed(evt);
            }
        });

        txtCari.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        txtCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(112, 112, 112)
                        .addComponent(harga))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(103, 103, 103)
                        .addComponent(jumlah))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(78, 78, 78)
                        .addComponent(kode_obat))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(75, 75, 75)
                        .addComponent(nama_obat))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(118, 118, 118)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jenis))))
                .addGap(111, 111, 111))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_tambah)
                                .addGap(133, 133, 133)
                                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_cari))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(125, 125, 125))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kode_obat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama_obat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah)
                    .addComponent(btn_edit)
                    .addComponent(btn_hapus)
                    .addComponent(btn_reset))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cari))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kode_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_obatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kode_obatActionPerformed

    private void nama_obatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_obatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_obatActionPerformed

    private void jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jumlahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jumlahActionPerformed

    private void hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaActionPerformed

    private void jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jenisActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        try {
            // TODO add your handling code here:
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db-apotek", "root", "");
            
            // Ambil kode obat dari field
            String kodeObat = kode_obat.getText();
            
            // Konfirmasi delete
            int confirm = JOptionPane.showConfirmDialog(null,
                    "Apakah Anda yakin ingin menghapus data obat dengan kode " + kodeObat + "?",
                    "Konfirmasi Hapus", JOptionPane.YES_NO_OPTION);
            
            // Jika pengguna memilih 'Yes' untuk menghapus
            if (confirm == JOptionPane.YES_OPTION) {
                // Query untuk menghapus data obat berdasarkan kode obat
                String deleteQuery = "DELETE FROM obat WHERE kode_obat = '" + kodeObat + "'";
                
                // Eksekusi query delete
                Statement stmt = cn.createStatement();
                int rowsDeleted = stmt.executeUpdate(deleteQuery);
                
                // Menampilkan pesan jika delete berhasil
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(null, "Data berhasil dihapus.");
                    tampilkan();  // Panggil metode untuk menampilkan data terbaru pada tabel
                } else {
                    JOptionPane.showMessageDialog(null, "Data tidak ditemukan untuk dihapus.");
                }
            } else {
                // Jika pengguna memilih 'No', tidak ada tindakan lanjut
                JOptionPane.showMessageDialog(null, "Penghapusan dibatalkan.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Obat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
           // Mengosongkan field input
           kode_obat.setText("");    // Reset kode obat
           nama_obat.setText("");    // Reset nama obat
           harga.setText("");        // Reset harga
           jumlah.setText("");       // Reset jumlah
           jenis.setText("");        // Reset jenis
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        try {
        // Membuat koneksi ke database
        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db-apotek", "root", "");
        System.out.println("Koneksi berhasil!");

        // Validasi input
        if (kode_obat.getText().isEmpty() || nama_obat.getText().isEmpty() || harga.getText().isEmpty() ||
            jumlah.getText().isEmpty() || jenis.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Semua field harus diisi!");
            return; // Menghentikan eksekusi jika ada input yang kosong
        }

        // Validasi format angka untuk harga dan jumlah
        try {
            Integer.parseInt(harga.getText());
            Integer.parseInt(jumlah.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Harga dan jumlah harus berupa angka!");
            return; // Menghentikan eksekusi jika input salah
        }

        // Membuat query manual
        String query = "INSERT INTO obat VALUES ('" 
                        + kode_obat.getText() + "', '" 
                        + nama_obat.getText() + "', " 
                        + harga.getText() + ", " 
                        + jumlah.getText() + ", '" 
                        + jenis.getText() + "')";

        // Eksekusi query
        cn.createStatement().executeUpdate(query);
        tampilkan(); // Memanggil metode untuk menampilkan data terbaru di tabel
        JOptionPane.showMessageDialog(null, "Data berhasil dimasukkan!");

    } catch (SQLException ex) {
        // Menampilkan pesan error SQL jika terjadi kesalahan
        JOptionPane.showMessageDialog(null, "Terjadi kesalahan: " + ex.getMessage());
        ex.printStackTrace(); // Debugging error SQL
    }

    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db-apotek", "root", "");
            // Ambil data dari field
            String kodeObat = kode_obat.getText();
            String namaObat = nama_obat.getText();
            String hargaObat = harga.getText();
            String jumlahObat = jumlah.getText();
            String jenisObat = jenis.getText();
            
            // Query untuk update data obat berdasarkan kode obat
            String updateQuery = "UPDATE obat SET nama_obat = '" + namaObat +
                    "', harga = '" + hargaObat +
                    "', jumlah = '" + jumlahObat +
                    "', jenis = '" + jenisObat +
                    "' WHERE kode_obat = '" + kodeObat + "'";
            
            // Eksekusi query update
            Statement stmt = cn.createStatement();
            int rowsUpdated = stmt.executeUpdate(updateQuery);
            
            // Menampilkan pesan jika update berhasil
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(null, "Data berhasil diperbarui.");
                tampilkan();  // Panggil metode untuk menampilkan data terbaru pada tabel
            } else {
                JOptionPane.showMessageDialog(null, "Data tidak ditemukan untuk diupdate.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Obat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int selectedRow = table.getSelectedRow();
        if (selectedRow != -1) {
            // Ambil data dari setiap kolom dalam baris yang dipilih
            String kodeObat = table.getValueAt(selectedRow, 0).toString();
            String namaObat = table.getValueAt(selectedRow, 1).toString();
            String hargaObat = table.getValueAt(selectedRow, 2).toString();
            String jumlahObat = table.getValueAt(selectedRow, 3).toString();
            String jenisObat = table.getValueAt(selectedRow, 4).toString();
            
            // Set data ke dalam field untuk diedit
            kode_obat.setText(kodeObat);
            nama_obat.setText(namaObat);
            harga.setText(hargaObat);
            jumlah.setText(jumlahObat);
            jenis.setText(jenisObat);
        }
    }//GEN-LAST:event_tableMouseClicked

    private void btn_cariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariActionPerformed
        try {
            // Membuat koneksi ke database
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db-apotek", "root", "");
            
            // Ambil nilai pencarian dari field
            String searchText = txtCari.getText().trim();  // Mengambil nilai dari JTextField
            
            // Query untuk menampilkan semua data jika field pencarian kosong
            String cariQuery;
            
            if (searchText.isEmpty()) {
                // Jika pencarian kosong, tampilkan semua data
                cariQuery = "SELECT * FROM obat";
            } else {
                // Query untuk mencari data berdasarkan semua kolom
                cariQuery = "SELECT * FROM obat WHERE kode_obat LIKE '%" + searchText + "%' OR nama_obat LIKE '%" + searchText + "%' OR harga LIKE '%" + searchText + "%' OR jumlah LIKE '%" + searchText + "%' OR jenis LIKE '%" + searchText + "%'";
            }
            
            // Eksekusi query menggunakan Statement
            Statement stmt = cn.createStatement();
            ResultSet rs = stmt.executeQuery(cariQuery);
            
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            model.setRowCount(0); // Clear existing rows
            
            // Menampilkan hasil pencarian atau semua data pada tabel
            while (rs.next()) {
                String[] data = {
                    rs.getString("kode_obat"),
                    rs.getString("nama_obat"),
                    rs.getString("harga"),
                    rs.getString("jumlah"),
                    rs.getString("jenis")
                };
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Obat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_cariActionPerformed

    private void txtCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCariActionPerformed

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
            java.util.logging.Logger.getLogger(Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Obat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Obat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cari;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_hapus;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JTextField harga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jenis;
    private javax.swing.JTextField jumlah;
    private javax.swing.JTextField kode_obat;
    private javax.swing.JTextField nama_obat;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCari;
    // End of variables declaration//GEN-END:variables

    private void tampilkan() {
        int row = table.getRowCount();
        for (int a=0; a<row;a++){
            model.removeRow(0);
        }
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/db-apotek","root", "");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM obat");
            while(rs.next()){
                String data[]={rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Obat.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
