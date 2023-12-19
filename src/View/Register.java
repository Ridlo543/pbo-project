package View;

import Controller.RegisterController;
import Model.User;
import java.util.List;

public class Register extends javax.swing.JFrame {

    private List<User> userList;
    private RegisterController registerController;

    public Register(List<User> userList, RegisterController registerController) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.userList = userList;
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
        jButtonToLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelUsername.setText("Username");

        jLabelPassword.setText("Password");

        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Staff" }));

        jLabelUsername1.setText("Role");

        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        jLabelConfirmPassword.setText("Confirm Password");

        jLabelTelepon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTelepon.setText("Nomor Telepon");

        jTextFieldTelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTeleponActionPerformed(evt);
            }
        });

        jButtonToLogin.setText("Login");
        jButtonToLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonToLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUsername, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTelepon, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelUsername1, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(26, 26, 26))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(178, Short.MAX_VALUE)
                                .addComponent(jLabelConfirmPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRegister, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonToLogin, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUsername1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUsername))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelepon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelConfirmPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonRegister)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonToLogin)
                .addContainerGap(88, Short.MAX_VALUE))
        );

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

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JButton jButtonToLogin;
    private javax.swing.JComboBox<String> jComboBox1;
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
