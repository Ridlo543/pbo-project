/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LoginController;
import Controller.RegisterController;
import Model.UserModel;

/**
 *
 * @author LENOVO
 */
public class Register extends javax.swing.JFrame {

    private UserModel userModel;
    private RegisterController registerController;

    public Register(UserModel userModel, RegisterController registerController) {
        initComponents();
        this.userModel = userModel;
        setRegisterController(registerController);
        registerController.setRegisterView(this); 
    }

    public void setRegisterController(RegisterController registerController) {
        this.registerController = registerController;
    }

//    REGISTER
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelUsername1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonRegister = new javax.swing.JButton();
        jLabelConfirmPassword = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabelTelepon = new javax.swing.JLabel();
        jTextFieldTelepon = new javax.swing.JTextField();
        fTextField2 = new source_ui.FTextField();
        fTextField3 = new source_ui.FTextField();
        fTextField4 = new source_ui.FTextField();
        fTextField5 = new source_ui.FTextField();
        jButtonToLogin = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1080, 608));
        setResizable(false);
        setSize(new java.awt.Dimension(1080, 608));
        getContentPane().setLayout(null);

        jLabelUsername.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(228, 241, 255));
        jLabelUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsername.setText("Username");
        getContentPane().add(jLabelUsername);
        jLabelUsername.setBounds(340, 140, 120, 30);

        jLabelPassword.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(228, 241, 255));
        jLabelPassword.setText("Password");
        getContentPane().add(jLabelPassword);
        jLabelPassword.setBounds(360, 290, 120, 20);

        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsername);
        jTextFieldUsername.setBounds(791, 108, 72, 26);

        jComboBox1.setBackground(new java.awt.Color(174, 210, 255));
        jComboBox1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(39, 0, 93));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Staff" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(350, 110, 380, 29);

        jLabelUsername1.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabelUsername1.setForeground(new java.awt.Color(225, 241, 255));
        jLabelUsername1.setText("Role");
        getContentPane().add(jLabelUsername1);
        jLabelUsername1.setBounds(350, 80, 80, 30);
        getContentPane().add(jPasswordField1);
        jPasswordField1.setBounds(791, 172, 72, 26);

        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegister);
        jButtonRegister.setBounds(790, 242, 77, 27);

        jLabelConfirmPassword.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabelConfirmPassword.setForeground(new java.awt.Color(228, 241, 255));
        jLabelConfirmPassword.setText("Confirm Password");
        getContentPane().add(jLabelConfirmPassword);
        jLabelConfirmPassword.setBounds(360, 360, 210, 30);
        getContentPane().add(jPasswordField2);
        jPasswordField2.setBounds(791, 204, 72, 26);

        jLabelTelepon.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        jLabelTelepon.setForeground(new java.awt.Color(228, 241, 255));
        jLabelTelepon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTelepon.setText("Nomor Telepon");
        getContentPane().add(jLabelTelepon);
        jLabelTelepon.setBounds(340, 210, 170, 30);

        jTextFieldTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTeleponActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTelepon);
        jTextFieldTelepon.setBounds(791, 140, 72, 26);

        fTextField2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        fTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(fTextField2);
        fTextField2.setBounds(350, 170, 380, 40);

        fTextField3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        fTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(fTextField3);
        fTextField3.setBounds(350, 240, 380, 40);

        fTextField4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        fTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(fTextField4);
        fTextField4.setBounds(350, 390, 370, 40);

        fTextField5.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        fTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(fTextField5);
        fTextField5.setBounds(350, 310, 370, 40);

        jButtonToLogin.setText("Login");
        jButtonToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonToLogin);
        jButtonToLogin.setBounds(791, 281, 76, 27);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/backgroundRegister.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(320, 70, 440, 390);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/backgroundImage.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 330, 600, 280);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/backgroundImage.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 600, 330);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/backgroundImage.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(600, 0, 480, 330);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/backgroundImage.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(600, 330, 480, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        // TODO add your handling code here:
        String role = jComboBox1.getSelectedItem().toString();
        String username = jTextFieldUsername.getText();
        String telepon = jTextFieldTelepon.getText();
        String password = new String(jPasswordField1.getPassword());
        String confirmPassword = new String(jPasswordField2.getPassword());
        registerController.processRegister(role, username, telepon, password, confirmPassword);

    }//GEN-LAST:event_jButtonRegisterActionPerformed

    private void jTextFieldTeleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTeleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTeleponActionPerformed

    private void jButtonToLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToLoginActionPerformed
        // TODO add your handling code here:

        if (registerController != null) {
            registerController.switchToLogin();
        } else {
            System.err.println("RegisterController is null. Make sure it is set before calling switchToLogin.");
        }
    }//GEN-LAST:event_jButtonToLoginActionPerformed

    private void fTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextField2ActionPerformed

    private void fTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextField3ActionPerformed

    private void fTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextField5ActionPerformed

    private void fTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextField4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private source_ui.FTextField fTextField2;
    private source_ui.FTextField fTextField3;
    private source_ui.FTextField fTextField4;
    private source_ui.FTextField fTextField5;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonToLogin;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelConfirmPassword;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTelepon;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabelUsername1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextFieldTelepon;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
