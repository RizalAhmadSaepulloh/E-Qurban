/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.itenas.projectuas.view;
import com.itenas.projectuas.controller.ControllerLogin;
import com.itenas.projectuas.controller.ControllerUser;
import javax.swing.JOptionPane;

/**
 *
 * @author rizal
 */
public class viewRegister extends javax.swing.JFrame {
    ControllerLogin conLog = new ControllerLogin();
    ControllerUser conUs = new ControllerUser();
    /**
     * Creates new form viewLogin
     */
    public viewRegister() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_password2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_password = new javax.swing.JPasswordField();
        btn_register = new javax.swing.JButton();
        lbl_login = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_Alamat = new javax.swing.JTextField();
        txt_noTelp = new javax.swing.JTextField();
        txt_Nama = new javax.swing.JTextField();
        cb_pass = new javax.swing.JCheckBox();

        txt_password2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_password2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Nama Lengkap :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(78, 188, 0));

        label1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("To App");

        label2.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        label2.setForeground(new java.awt.Color(255, 255, 255));
        label2.setText("WELCOME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Username :");

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Password :");

        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        btn_register.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_register.setText("Register");
        btn_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registerMouseClicked(evt);
            }
        });
        btn_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registerActionPerformed(evt);
            }
        });

        lbl_login.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbl_login.setText("Login");
        lbl_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_loginMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Nama Lengkap :");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Alamat :");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("No Telp :");

        txt_Alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AlamatActionPerformed(evt);
            }
        });

        txt_noTelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noTelpActionPerformed(evt);
            }
        });

        txt_Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NamaActionPerformed(evt);
            }
        });

        cb_pass.setText("Show Password");
        cb_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_passActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(txt_password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                .addComponent(txt_username, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel6)
                            .addComponent(txt_noTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 227, Short.MAX_VALUE))
                            .addComponent(txt_Alamat, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Nama, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cb_pass)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_register)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbl_login)
                                .addGap(129, 129, 129))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_pass)
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_Nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txt_Alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_noTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btn_register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_login)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
       
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void btn_registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerMouseClicked
        
    }//GEN-LAST:event_btn_registerMouseClicked

    private void cb_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_passActionPerformed
        if (cb_pass.isSelected()) {
            txt_password.setEchoChar((char)0);
            cb_pass.setText("Hide Password");
        }else{
            txt_password.setEchoChar('*');
            cb_pass.setText("Show Password");
                    
        }
    }//GEN-LAST:event_cb_passActionPerformed

    private void lbl_loginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_loginMouseClicked
        new viewLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_lbl_loginMouseClicked

    private void txt_password2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_password2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_password2ActionPerformed

    private void btn_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registerActionPerformed
        String username = txt_username.getText();
        String password = txt_password.getText();
        String nama = txt_Nama.getText();
        String alamat = txt_Alamat.getText();
        String noTelp = txt_noTelp.getText();
        
        boolean hasil = conUs.insertUser(username, password, nama, alamat, noTelp);
        
        if (hasil) {
            JOptionPane.showMessageDialog(null, "Register berhasil","Pesan",JOptionPane.INFORMATION_MESSAGE);
            viewLogin viewLogin = new viewLogin();
            viewLogin.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "register Gagal","Pesan",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_registerActionPerformed

    private void txt_AlamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AlamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AlamatActionPerformed

    private void txt_noTelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noTelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noTelpActionPerformed

    private void txt_NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NamaActionPerformed

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
            java.util.logging.Logger.getLogger(viewRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_register;
    private javax.swing.JCheckBox cb_pass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private javax.swing.JLabel lbl_login;
    private javax.swing.JTextField txt_Alamat;
    private javax.swing.JTextField txt_Nama;
    private javax.swing.JTextField txt_noTelp;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JPasswordField txt_password2;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
