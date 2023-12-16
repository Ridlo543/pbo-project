/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LoginController;
import Model.User;
import Model.UserModel;

/**
 *
 * @author LENOVO
 */
public class Login extends javax.swing.JFrame {

    private final UserModel userModel;
    private LoginController loginController;

    public Login(UserModel userModel, LoginController loginController) {
        initComponents();
        this.userModel = userModel;
        setLoginController(loginController);
    }

    // Metode setLoginController
    public void setLoginController(LoginController loginController) {
        this.loginController = loginController;
    }

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
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabelUsername1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonToRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsername.setText("Username");

        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelPassword.setText("Password");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Staff" }));

        jLabelUsername1.setText("Role");

        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });

        jButtonToRegister.setText("Register");
        jButtonToRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabelUsername1)
                .addGap(67, 67, 67)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabelUsername)
                .addGap(37, 37, 37)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(jLabelPassword)
                .addGap(40, 40, 40)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jButtonLogin))
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jButtonToRegister))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelUsername1))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelUsername))
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabelPassword))
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonLogin)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addComponent(jButtonToRegister))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
        String role = jComboBox1.getSelectedItem().toString();
        String username = jTextField1.getText();
        String password = new String(jPasswordField1.getPassword());
        
        // Memanggil metode processLogin pada LoginController
        boolean loginSuccessful = loginController.processLogin(role, username, password);
        
        if (loginSuccessful) {
            // Jika login berhasil, pindah ke halaman paket
            loginController.switchToPaket(username);
        } else {
            // Jika login gagal, tambahkan logika lainnya jika diperlukan
            System.out.println("Login Gagal!");
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonToRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonToRegisterActionPerformed
        // TODO add your handling code here:
        if (loginController != null) {
            loginController.switchToRegister();
        } else {
            System.err.println("LoginController is null. Make sure it is set before calling switchToRegister.");
        }
    }//GEN-LAST:event_jButtonToRegisterActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonToRegister;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabelUsername1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
