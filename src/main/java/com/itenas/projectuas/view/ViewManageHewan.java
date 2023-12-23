/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itenas.projectuas.view;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.itenas.projectuas.entity.Hewan;
import com.itenas.projectuas.controller.ControllerHewan;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author rizal
 */
public class ViewManageHewan extends javax.swing.JFrame {

    /**
     * Creates new form ViewManageHewan
     */
    ControllerHewan conHe = new ControllerHewan();
    boolean hasil;
    private DefaultTableModel model;
    private Hewan hewan = new Hewan();

    public ViewManageHewan() {
        initComponents();
        setLocationRelativeTo(null);
        model = new DefaultTableModel();

        tbl_hewan.setModel(model);

        model.addColumn("ID");
        model.addColumn("Nama hewan");
        model.addColumn("Berat");
        model.addColumn("Harga");
        getData();

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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_Home = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_hewan = new javax.swing.JTable();
        txt_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_namaHewan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_Berat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        btn_clear = new javax.swing.JButton();
        btn_insert = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(51, 204, 0));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setText("Manage Hewan");

        btn_Home.setBackground(new java.awt.Color(255, 255, 255));
        btn_Home.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_Home.setForeground(new java.awt.Color(51, 204, 0));
        btn_Home.setText("Home");
        btn_Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Home)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(17, 17, 17))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_Home)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_hewan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama Hewan", "Berat", "Harga"
            }
        ));
        tbl_hewan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_hewanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_hewan);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setText("ID :");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 0));
        jLabel3.setText("Nama Hewan :");

        Txt_namaHewan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_namaHewanActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 204, 0));
        jLabel4.setText("Berat :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 204, 0));
        jLabel5.setText("Harga :");

        btn_clear.setBackground(new java.awt.Color(255, 255, 255));
        btn_clear.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(51, 204, 0));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_insert.setBackground(new java.awt.Color(0, 102, 204));
        btn_insert.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_insert.setForeground(new java.awt.Color(255, 255, 255));
        btn_insert.setText("Insert");
        btn_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertActionPerformed(evt);
            }
        });

        btn_delete.setBackground(new java.awt.Color(204, 0, 0));
        btn_delete.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(51, 204, 0));
        btn_update.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(btn_insert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_update))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Txt_namaHewan, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_Berat, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btn_clear))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(Txt_namaHewan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(2, 2, 2)
                        .addComponent(txt_Berat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(2, 2, 2)
                        .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_clear)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_insert)
                    .addComponent(btn_delete)
                    .addComponent(btn_update))
                .addGap(0, 29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    ;
    

    
    public final void getData() {
        DefaultTableModel dtm = (DefaultTableModel) tbl_hewan.getModel();
        dtm.setRowCount(0);

        List<Hewan> listHewan = conHe.showHewan();
        String[] data = new String[5];
        for (Hewan newHewan : listHewan) {
            data[0] = newHewan.getIdHewan();
            data[1] = newHewan.getNamaHewan();
            data[2] = Double.toString(newHewan.getBerat());
            data[3] = Double.toString(newHewan.getHarga());

            dtm.addRow(data);
        }
    }

    private void clearData() {
        txt_ID.setText("");
        Txt_namaHewan.setText("");
        txt_Berat.setText("");
        txt_harga.setText("");

    }
    private void Txt_namaHewanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_namaHewanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_namaHewanActionPerformed

    private void btn_HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HomeActionPerformed
        new viewDashboardAdmin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_HomeActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clearData();
        getData();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertActionPerformed
        hasil = conHe.insertHewan(txt_ID.getText(), Txt_namaHewan.getText(), Double.parseDouble(txt_Berat.getText()), Double.parseDouble(txt_harga.getText()));
        if (hasil) {
            JOptionPane.showMessageDialog(null, "Data Berhasil Ditambahkan");
            getData();
            clearData();
        } else {
            JOptionPane.showMessageDialog(null, "Data Gagal Ditambahkan", "pesan", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_insertActionPerformed

    private void tbl_hewanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_hewanMouseClicked
        int i = tbl_hewan.getSelectedRow();
        TableModel model = tbl_hewan.getModel();

        // Dapatkan data hewan dari baris yang dipilih
        String idHewan = model.getValueAt(i, 0).toString();
        String namaHewan = model.getValueAt(i, 1).toString();
        String harga = model.getValueAt(i, 2).toString();
        String berat = model.getValueAt(i, 3).toString();

        // Set data hewan
        hewan.setIdHewan(idHewan);
        hewan.setNamaHewan(namaHewan);
        hewan.setBerat(Double.parseDouble(berat));
        hewan.setHarga(Double.parseDouble(harga));
    }//GEN-LAST:event_tbl_hewanMouseClicked

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int i = tbl_hewan.getSelectedRow();

        if (i == -1) {
            JOptionPane.showMessageDialog(btn_update,
                    "Harap pilih salah satu data", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = Integer.parseInt(tbl_hewan.getModel().getValueAt(i, 0).toString());

        conHe.deleteHewan(id);
        JOptionPane.showMessageDialog(btn_delete, "Data berhasil dihapus");
        getData();
        clearData();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        int i = tbl_hewan.getSelectedRow();

        if (i == -1) {
            JOptionPane.showMessageDialog(btn_update,
                    "Harap pilih salah satu data", "warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = Integer.parseInt(tbl_hewan.getModel().getValueAt(i, 0).toString());
        int newID = Integer.parseInt(txt_ID.getText());
        String nama = Txt_namaHewan.getText();
        double berat = Double.parseDouble(txt_Berat.getText());
        double harga = Double.parseDouble(txt_harga.getText());

        conHe.updateHewan(newID, id, nama, harga, berat);
        JOptionPane.showMessageDialog(btn_update, "Data berhasil diupdate");
        getData();
        clearData();
    }//GEN-LAST:event_btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(ViewManageHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewManageHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewManageHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewManageHewan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewManageHewan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Txt_namaHewan;
    private javax.swing.JButton btn_Home;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_insert;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_hewan;
    private javax.swing.JTextField txt_Berat;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_harga;
    // End of variables declaration//GEN-END:variables
}