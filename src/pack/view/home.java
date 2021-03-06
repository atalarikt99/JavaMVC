/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.logging.Level; 
import java.util.logging.Logger; 
import javax.swing.JButton; 
import javax.swing.JComboBox; 
import javax.swing.JOptionPane; 
import javax.swing.JTable; 
import javax.swing.JTextField; 
import javax.swing.table.DefaultTableModel; 
import pack.control.c_koneksi; 
import pack.control.controllerToko; 
import pack.model.m_toko;

/**
 *
 * @author Mokleters
 */
public class home extends javax.swing.JFrame {
    controllerToko ctoko;
    List<m_toko>listdata = new ArrayList<>();
    /**
     * Creates new form home
     */
    public home(String user) {
        initComponents();
        ctoko = new controllerToko (this);
        ctoko.isiTable();
        txtAdmin.setText(user);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtAdmin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        cbKategori = new javax.swing.JComboBox<>();
        cbJenis = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelToko = new javax.swing.JTable();
        cbCariKategori = new javax.swing.JComboBox<>();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Data Barang di Toko");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 30, 240, 40);

        jLabel2.setFont(new java.awt.Font("Malgun Gothic", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Admin Toko:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 10, 120, 30);

        txtAdmin.setEditable(false);
        txtAdmin.setFont(new java.awt.Font("Franklin Gothic Heavy", 0, 14)); // NOI18N
        jPanel1.add(txtAdmin);
        txtAdmin.setBounds(120, 10, 180, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 910, 90);

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));
        jPanel2.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Harga");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 170, 50, 30);

        jLabel4.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kode Barang");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 10, 100, 30);

        jLabel5.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nama Barang");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 50, 100, 30);

        jLabel6.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Kategori Barang");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 90, 130, 30);

        jLabel7.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Jenis Packaging");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 130, 130, 30);

        txtKode.setFont(new java.awt.Font("Humnst777 BT", 0, 14)); // NOI18N
        jPanel2.add(txtKode);
        txtKode.setBounds(160, 10, 450, 30);

        txtNama.setFont(new java.awt.Font("Humnst777 BT", 0, 14)); // NOI18N
        jPanel2.add(txtNama);
        txtNama.setBounds(160, 50, 450, 30);

        txtHarga.setFont(new java.awt.Font("Humnst777 BT", 0, 14)); // NOI18N
        jPanel2.add(txtHarga);
        txtHarga.setBounds(160, 170, 450, 30);

        cbKategori.setFont(new java.awt.Font("Humnst777 BT", 0, 14)); // NOI18N
        cbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Barang Lain" }));
        jPanel2.add(cbKategori);
        cbKategori.setBounds(160, 90, 450, 30);

        cbJenis.setFont(new java.awt.Font("Humnst777 BT", 0, 14)); // NOI18N
        cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack", "Lainnya" }));
        jPanel2.add(cbJenis);
        cbJenis.setBounds(160, 130, 450, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(30, 90, 650, 220);

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setLayout(null);

        btnSimpan.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel3.add(btnSimpan);
        btnSimpan.setBounds(10, 10, 180, 30);

        btnUbah.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });
        jPanel3.add(btnUbah);
        btnUbah.setBounds(10, 50, 180, 30);

        btnBersih.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        btnBersih.setText("Bersihkan");
        btnBersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihActionPerformed(evt);
            }
        });
        jPanel3.add(btnBersih);
        btnBersih.setBounds(10, 90, 180, 30);

        btnHapus.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel3.add(btnHapus);
        btnHapus.setBounds(10, 130, 180, 30);

        btnKeluar.setFont(new java.awt.Font("Geometr212 BkCn BT", 0, 14)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        jPanel3.add(btnKeluar);
        btnKeluar.setBounds(10, 170, 180, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(700, 90, 200, 220);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Pencarian Berdasarkan Kategori Makanan");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 320, 450, 30);

        jPanel4.setBackground(new java.awt.Color(255, 102, 0));
        jPanel4.setLayout(null);

        tabelToko.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tabelToko.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Barang", "Nama Barang", "Kategori", "Packaging", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tabelToko);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 840, 210);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(30, 360, 840, 200);

        cbCariKategori.setFont(new java.awt.Font("Humnst777 BT", 0, 14)); // NOI18N
        cbCariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Barang Lain" }));
        getContentPane().add(cbCariKategori);
        cbCariKategori.setBounds(430, 320, 120, 30);

        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        getContentPane().add(btnCari);
        btnCari.setBounds(560, 320, 120, 30);

        setBounds(0, 0, 917, 637);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnBersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihActionPerformed
        ctoko.Reset();
    }//GEN-LAST:event_btnBersihActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        dispose();
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        ctoko.CariKategori();
        ctoko.isiTable();
    }//GEN-LAST:event_btnCariActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //String user1 = login.user;

    }//GEN-LAST:event_formWindowOpened

    public JTextField getTxtKode(){ 
        return txtKode; 
    } 
    public JTextField getTxtNama(){ 
        return txtNama; 
    } 
    public JTextField getTxtHarga(){ 
        return txtHarga; 
    } 
    public JComboBox getCbKategori(){ 
        return cbKategori; 
    } 
    public JComboBox getCbJenis(){ 
        return cbJenis; 
    } 
    public JComboBox getCbCariKategori(){ 
        return cbCariKategori; 
    } 
    public JButton getButtonHapus(){ 
        return btnHapus; 
    } 
     
    public JButton getButtonBersih(){ 
        return btnBersih; 
    } 
    public JButton getButtonSimpan(){ 
        return btnSimpan; 
    } 
    public JButton getButtonUbah(){ 
        return btnUbah; 
    } 
    public JButton getButtonKeluar(){ 
        return btnKeluar; 
    } 
    public JTable getTableData(){ 
        return tabelToko; 
    }
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String user = null;
                new home(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbCariKategori;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JComboBox<String> cbKategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelToko;
    private javax.swing.JTextField txtAdmin;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
