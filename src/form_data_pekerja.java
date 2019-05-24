import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class form_data_pekerja extends javax.swing.JFrame {

    private DefaultTableModel tabmode;
    
    private void tampil_barang(){
        Object[]baris = {"Nama ", "Keahlian", "Tanggal Masuk", "Bidang Di Inginkan"};
        tabmode= new DefaultTableModel(null, baris);
        calonpekerja.setModel(tabmode);
        String sql = "select * from calonpekerja";
        try {
            Connection konek = new koneksi_mysql().getConnection();
            Statement stat = konek.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String Nama = hasil.getString("Nama");
                String Keahlian = hasil.getString("Keahlian");
                String TanggalMasuk = hasil.getString("TanggalMasuk");
                String BidangDiInginkan = hasil.getString("BidangDiInginkan");
                String[]data = {Nama, Keahlian, TanggalMasuk, BidangDiInginkan};
                tabmode.addRow(data);
            }
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menampilkan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public form_data_pekerja() {
        initComponents();
        tampil_barang();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        calonpekerja = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txNama = new javax.swing.JTextField();
        txKeahlian = new javax.swing.JTextField();
        txBidang = new javax.swing.JTextField();
        c_tgl = new javax.swing.JComboBox<>();
        c_bln = new javax.swing.JComboBox<>();
        c_thn = new javax.swing.JComboBox<>();
        b_Simpan = new javax.swing.JButton();
        b_Reset = new javax.swing.JButton();
        b_Update = new javax.swing.JButton();
        b_Delete = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORM PEKERJAAN");

        calonpekerja.setModel(new javax.swing.table.DefaultTableModel(
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
        calonpekerja.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calonpekerjaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(calonpekerja);

        jButton1.setText("Refresh Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama");

        jLabel4.setText("Keahlian");

        jLabel5.setText("tgl_masuk");

        jLabel6.setText("Bidang Di Inginkan");

        c_tgl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tanggal", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        c_tgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_tglActionPerformed(evt);
            }
        });

        c_bln.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bulan", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        c_bln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_blnActionPerformed(evt);
            }
        });

        c_thn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tahun", "2016", "2015", "2014", "2013", "2012", "2011", "2000" }));

        b_Simpan.setText("Simpan");
        b_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_SimpanActionPerformed(evt);
            }
        });

        b_Reset.setText("Reset");
        b_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ResetActionPerformed(evt);
            }
        });

        b_Update.setText("Update");
        b_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_UpdateActionPerformed(evt);
            }
        });

        b_Delete.setText("Delete");
        b_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(25, 25, 25)))
                    .addComponent(jLabel6)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txNama)
                    .addComponent(txKeahlian)
                    .addComponent(txBidang)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(c_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c_bln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(c_thn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(b_Update, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(b_Simpan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(b_Reset, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(b_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 39, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txKeahlian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(c_tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_bln, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(c_thn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txBidang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Simpan)
                            .addComponent(b_Reset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_Update)
                            .addComponent(b_Delete))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tampil_barang();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void b_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_SimpanActionPerformed
        String Nama="", Keahlian = "", tgl_masuk="", tgl="", bln="", thn="";
        int harga = 0;
        
        Nama = txNama.getText();
        Keahlian = txKeahlian.getText();
        tgl = c_tgl.getSelectedItem().toString();
        bln = c_bln.getSelectedItem().toString();
        thn = c_thn.getSelectedItem().toString();
        String TanggalMasuk = thn+"-"+bln+"-"+tgl;
        String BidangDiInginkan = txBidang.getText();
        try {
            Connection konek = new koneksi_mysql().getConnection();
            String sql = "insert into calonpekerja values('"+Nama+"', '"+Keahlian+"', '"+TanggalMasuk+"', '"+BidangDiInginkan+"')";
            PreparedStatement stat = (PreparedStatement) konek.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menyimpan data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_barang();
            reset();
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menyimpan data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_b_SimpanActionPerformed
    
    private void reset(){
        txNama.setText("");
        txKeahlian.setText("");
        c_tgl.setSelectedIndex(0);
        c_bln.setSelectedIndex(0);
        c_thn.setSelectedIndex(0);
        txBidang.setText("");
    }
    
    private void b_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ResetActionPerformed
        reset();
    }//GEN-LAST:event_b_ResetActionPerformed

    public ambil_data f_ambil_barang = null;
    
    private void calonpekerjaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calonpekerjaMouseClicked
        // TODO add your handling code here:
        int tabelBarang = calonpekerja.getSelectedRow();
        txNama.setText(calonpekerja.getValueAt(tabelBarang, 0).toString());
        txKeahlian.setText(calonpekerja.getValueAt(tabelBarang, 1).toString());
        txBidang.setText(calonpekerja.getValueAt(tabelBarang, 3).toString());
        c_tgl.setSelectedItem(calonpekerja.getValueAt(tabelBarang, 2).toString().substring(8, 10));
        c_bln.setSelectedItem(calonpekerja.getValueAt(tabelBarang, 2).toString().substring(5, 7));
        c_thn.setSelectedItem(calonpekerja.getValueAt(tabelBarang, 2).toString().substring(0, 4));
    }//GEN-LAST:event_calonpekerjaMouseClicked

    private void b_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_UpdateActionPerformed
        String kode_barang="", nama_barang = "", tgl_masuk="", tgl="", bln="", thn="";
        int harga = 0;
        
        kode_barang = txNama.getText();
        nama_barang = txKeahlian.getText();
        tgl = c_tgl.getSelectedItem().toString();
        bln = c_bln.getSelectedItem().toString();
        thn = c_thn.getSelectedItem().toString();
        tgl_masuk = thn+"-"+bln+"-"+tgl;
        String bidang = txBidang.getText();
        try {
            Connection konek = new koneksi_mysql().getConnection();
            String sql = "update calonpekerja set "
                    + "Keahlian='"+nama_barang+"', "
                    + "TanggalMasuk='"+tgl_masuk+"', "
                    + "BidangDiInginkan='"+bidang+"'"
                    + "where Nama='"+kode_barang+"'";
            PreparedStatement stat = (PreparedStatement) konek.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Merubah data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_barang();
            reset();
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Merubah data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_b_UpdateActionPerformed

    private void b_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_DeleteActionPerformed
        // TODO add your handling code here:
        String kode_barang="";
        kode_barang = txNama.getText();
        try {
            Connection konek = new koneksi_mysql().getConnection();
            String sql = "delete from calonpekerja where Nama='"+kode_barang+"'";
            PreparedStatement stat = (PreparedStatement) konek.prepareStatement(sql);
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null, "Menghapus data BERHASIL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            tampil_barang();
            reset();
            konek.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Menghapus data GAGAL", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_b_DeleteActionPerformed

    private void c_tglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_tglActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_tglActionPerformed

    private void c_blnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_blnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_blnActionPerformed

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
            java.util.logging.Logger.getLogger(form_data_pekerja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form_data_pekerja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form_data_pekerja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form_data_pekerja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form_data_pekerja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_Delete;
    private javax.swing.JButton b_Reset;
    private javax.swing.JButton b_Simpan;
    private javax.swing.JButton b_Update;
    private javax.swing.JComboBox<String> c_bln;
    private javax.swing.JComboBox<String> c_tgl;
    private javax.swing.JComboBox<String> c_thn;
    private javax.swing.JTable calonpekerja;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txBidang;
    private javax.swing.JTextField txKeahlian;
    private javax.swing.JTextField txNama;
    // End of variables declaration//GEN-END:variables
}
