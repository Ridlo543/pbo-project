package View;

import Controller.LoginController;
import Model.User;
import java.util.List;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {

    private List<User> userList;
    private LoginController loginController;

    public Login(List<User> userList, LoginController loginController) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.userList = userList;

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
        jLabelRole = new javax.swing.JLabel();
        nameKaraoke = new javax.swing.JLabel();
        jLabelDeskription = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        fTextFieldUsername = new source_ui.FTextField();
        fPasswordField = new source_ui.FPasswordField();
        fButtonRegister = new source_ui.FButton();
        fButtonLogin = new source_ui.FButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setBackground(new java.awt.Color(39, 0, 93));
        setPreferredSize(new java.awt.Dimension(1080, 608));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabelUsername.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(228, 241, 255));
        jLabelUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUsername.setText("Username");
        getContentPane().add(jLabelUsername);
        jLabelUsername.setBounds(640, 200, 170, 30);

        jLabelPassword.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(228, 241, 255));
        jLabelPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPassword.setText("Password");
        getContentPane().add(jLabelPassword);
        jLabelPassword.setBounds(640, 290, 140, 30);

        jLabelRole.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabelRole.setForeground(new java.awt.Color(228, 241, 255));
        jLabelRole.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabelRole.setText("In a world of noise, \nfind your melody \nwith us.");
        getContentPane().add(jLabelRole);
        jLabelRole.setBounds(30, 90, 460, 30);

        nameKaraoke.setFont(new java.awt.Font("Poppins", 1, 70)); // NOI18N
        nameKaraoke.setForeground(new java.awt.Color(228, 241, 255));
        nameKaraoke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nameKaraoke.setText("UVUtopia");
        getContentPane().add(nameKaraoke);
        nameKaraoke.setBounds(30, 20, 350, 70);

        jLabelDeskription.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jLabelDeskription.setForeground(new java.awt.Color(228, 241, 255));
        jLabelDeskription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDeskription.setText("Role");
        getContentPane().add(jLabelDeskription);
        jLabelDeskription.setBounds(640, 110, 70, 30);

        jComboBox1.setBackground(new java.awt.Color(174, 210, 255));
        jComboBox1.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(148, 0, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Staff" }));
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(640, 150, 260, 30);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(570, 602, 0, 0);

        fTextFieldUsername.setFont(new java.awt.Font("Poppins", 1, 18)); // NOI18N
        fTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fTextFieldUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(fTextFieldUsername);
        fTextFieldUsername.setBounds(640, 230, 270, 48);
        getContentPane().add(fPasswordField);
        fPasswordField.setBounds(640, 320, 270, 50);

        fButtonRegister.setText("Register");
        fButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButtonRegisterActionPerformed(evt);
            }
        });
        getContentPane().add(fButtonRegister);
        fButtonRegister.setBounds(790, 410, 110, 40);

        fButtonLogin.setText("Login");
        fButtonLogin.setMaximumSize(new java.awt.Dimension(120, 36));
        fButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(fButtonLogin);
        fButtonLogin.setBounds(640, 410, 110, 40);

        jLabel2.setBackground(new java.awt.Color(39, 0, 93));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/backgroundImage.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(540, 340, 540, 270);

        jLabel4.setBackground(new java.awt.Color(39, 0, 93));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/backgroundImage.png"))); // NOI18N
        jLabel4.setText("jLabel2");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 0, 540, 340);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/loginImage.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setPreferredSize(new java.awt.Dimension(540, 608));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 540, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButtonRegisterActionPerformed
        // TODO add your handling code here:
        if (loginController != null) {
            loginController.switchToRegister();
        } else {
            System.err.println("LoginController is null. Make sure it is set before calling switchToRegister.");
        }
    }//GEN-LAST:event_fButtonRegisterActionPerformed

    private void fTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fTextFieldUsernameActionPerformed

    private void fButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fButtonLoginActionPerformed
        // TODO add your handling code here:
        String role = jComboBox1.getSelectedItem().toString();
        String username = fTextFieldUsername.getText();
        String password = new String(fPasswordField.getPassword());

        // Pemeriksaan apakah rolenya sesuai dengan JComboBox
        if (isRoleValid(role)) {
            // Memanggil metode processLogin pada LoginController
            boolean loginSuccessful = loginController.processLogin(role, username, password);

            if (loginSuccessful) {
                // Jika login berhasil, pindah ke halaman paket atau history
                loginController.nextPage(role, username);
            } else {
                // Jika login gagal, tambahkan logika lainnya jika diperlukan
                System.out.println("Login Gagal!");
            }
        } else {
            // Menampilkan pesan kesalahan jika rolenya tidak sesuai
            JOptionPane.showMessageDialog(this, "Role yang dipilih tidak sesuai dengan data user.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_fButtonLoginActionPerformed

    // Metode untuk memeriksa apakah rolenya sesuai dengan data user
    private boolean isRoleValid(String selectedRole) {
        for (User user : userList) {
            if (user.getRole().equals(selectedRole)) {
                return true;
            }
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private source_ui.FButton fButtonLogin;
    private source_ui.FButton fButtonRegister;
    private source_ui.FPasswordField fPasswordField;
    private source_ui.FTextField fTextFieldUsername;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDeskription;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelRole;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel nameKaraoke;
    // End of variables declaration//GEN-END:variables
}
