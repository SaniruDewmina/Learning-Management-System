/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginForms;

import LoginForms.*;
import java.awt.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author sanir
 */
public class AdminForgotPassword extends javax.swing.JFrame {

    /**
     * Creates new form AdminForgotPassword
     */
    public AdminForgotPassword() {
        initComponents();
        pnl_changePassword.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_secretPin = new javax.swing.JPasswordField();
        txt_adminUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnl_changePassword = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txt_newPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        txt_confirmPassword = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        CheckBox_showNewPassword = new javax.swing.JCheckBox();
        CheckBox_showConfirmPassword = new javax.swing.JCheckBox();
        StudentForgetPasswordImage = new javax.swing.JLabel();
        btn_cancle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(875, 550));

        txt_adminUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_adminUsernameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setText("Forgot Password");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Secret Pin");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("New Password");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Confirm Password");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        CheckBox_showNewPassword.setText("Show");
        CheckBox_showNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_showNewPasswordActionPerformed(evt);
            }
        });

        CheckBox_showConfirmPassword.setText("Show");
        CheckBox_showConfirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_showConfirmPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_changePasswordLayout = new javax.swing.GroupLayout(pnl_changePassword);
        pnl_changePassword.setLayout(pnl_changePasswordLayout);
        pnl_changePasswordLayout.setHorizontalGroup(
            pnl_changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_changePasswordLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnl_changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_changePasswordLayout.createSequentialGroup()
                        .addComponent(txt_confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckBox_showConfirmPassword))
                    .addGroup(pnl_changePasswordLayout.createSequentialGroup()
                        .addComponent(txt_newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CheckBox_showNewPassword))
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_changePasswordLayout.setVerticalGroup(
            pnl_changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_changePasswordLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBox_showNewPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_changePasswordLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CheckBox_showConfirmPassword))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        StudentForgetPasswordImage.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\Images\\Forgot password-rafiki.png")); // NOI18N
        StudentForgetPasswordImage.setToolTipText("");
        StudentForgetPasswordImage.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                StudentForgetPasswordImageComponentResized(evt);
            }
        });

        btn_cancle.setBackground(new java.awt.Color(0, 0, 0));
        btn_cancle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_cancle.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancle.setText("Cancel");
        btn_cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancleActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Username");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Verify");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(StudentForgetPasswordImage, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancle))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_adminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_secretPin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(28, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(pnl_changePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(StudentForgetPasswordImage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancle)
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_adminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_secretPin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_changePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_adminUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_adminUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_adminUsernameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String newPassword = new String(txt_newPassword.getPassword()).trim();
        String confirmPassword = new String(txt_confirmPassword.getPassword()).trim();
        String adminID = txt_adminUsername.getText().trim();

        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match. Please try again.");
            return;
        }

        String connectionString = "jdbc:mysql://localhost:3306/LMS";
        String dbUsername = "root";
        String dbPassword = "";

        Connection conn = null;
        PreparedStatement stmt = null;

        try {

            if (newPassword.isEmpty() || confirmPassword.isEmpty() || adminID.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All fields are required. Please fill in all details.");
                return;
            }

            conn = DriverManager.getConnection(connectionString, dbUsername, dbPassword);

            String sql = "UPDATE Admin SET adminPassword = ? WHERE adminID = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, newPassword);
            stmt.setString(2, adminID);

            int rowsUpdated = stmt.executeUpdate();
            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Password Reset Successful!");
                AdminLogin adminLogin = new AdminLogin();
                adminLogin.setVisible(true);
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Admin ID or Error resetting password. Please try again.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: Unable to reset password. Please contact support.");
            ex.printStackTrace();
        } finally {

            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error Closing Resources: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CheckBox_showNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_showNewPasswordActionPerformed
        // TODO add your handling code here:
        if (CheckBox_showNewPassword.isSelected()) {
            txt_newPassword.setEchoChar((char) 0);
        } else {
            txt_newPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBox_showNewPasswordActionPerformed

    private void CheckBox_showConfirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_showConfirmPasswordActionPerformed
        // TODO add your handling code here:
        if (CheckBox_showConfirmPassword.isSelected()) {
            txt_confirmPassword.setEchoChar((char) 0);
        } else {
            txt_confirmPassword.setEchoChar('*');
        }
    }//GEN-LAST:event_CheckBox_showConfirmPasswordActionPerformed

    private void StudentForgetPasswordImageComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_StudentForgetPasswordImageComponentResized
        // TODO add your handling code here:
        StudentForgetPasswordImage.setIcon(ImageResizer.resizeImage("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\Images\\Forgot password-rafiki.png", 530, 530));
    }//GEN-LAST:event_StudentForgetPasswordImageComponentResized

    private void btn_cancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancleActionPerformed
        // TODO add your handling code here:
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_cancleActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String adminID = txt_adminUsername.getText().trim();
        String adminPin = txt_secretPin.getText().trim();

        String connectionString = "jdbc:mysql://localhost:3306/LMS";
        String dbUsername = "root";
        String dbPassword = "";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(connectionString, dbUsername, dbPassword);
            String sql = "SELECT adminID FROM Admin WHERE adminID = ? AND adminSecretPin = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, adminID);
            stmt.setString(2, adminPin);

            rs = stmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Verification Successful! You can now reset your password.");
                pnl_changePassword.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Secret Pin. Please try again.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error Closing Resources: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AdminForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForgotPassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForgotPassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CheckBox_showConfirmPassword;
    private javax.swing.JCheckBox CheckBox_showNewPassword;
    private javax.swing.JLabel StudentForgetPasswordImage;
    private javax.swing.JButton btn_cancle;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel pnl_changePassword;
    private javax.swing.JTextField txt_adminUsername;
    private javax.swing.JPasswordField txt_confirmPassword;
    private javax.swing.JPasswordField txt_newPassword;
    private javax.swing.JPasswordField txt_secretPin;
    // End of variables declaration//GEN-END:variables
}
