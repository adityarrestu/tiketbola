/**
 *
 * @author adityarestu
 */
public class FormLogin extends javax.swing.JFrame {

    /**
     * Creates new form Test
     */
    public FormLogin() {
        initComponents();

        this.addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                int close = javax.swing.JOptionPane.showConfirmDialog(
                    null, 
                    "Yakin ingin menutup aplikasi?", 
                    "Tutup Aplikasi", 
                    javax.swing.JOptionPane.YES_NO_OPTION, 
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);

                if (close == 0) {
                    e.getWindow().dispose();
                }
            }
           
        });
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panelLatar = new javax.swing.JPanel();
        latar = new javax.swing.JLabel();
        formInput = new javax.swing.JPanel();
        btnMasuk = new javax.swing.JButton();
        titleApp = new javax.swing.JLabel();
        inputUsername = new PlaceholderTextField();
        inputPassword = new PlaceholderPasswordField();
        versionText = new javax.swing.JLabel();
        loginText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        latar.setIcon(new javax.swing.ImageIcon("./src/img/latar.png")); // NOI18N

        formInput.setBackground(new java.awt.Color(255, 255, 255));
        
        btnMasuk.setBackground(new java.awt.Color(51, 153, 255));
        btnMasuk.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        btnMasuk.setForeground(new java.awt.Color(255, 255, 255));
        btnMasuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMasuk.setText("Masuk");
        btnMasuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasukActionPerformed(evt);
            }
        });

        titleApp.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        titleApp.setText("Aplikasi E-Ticket Sepak Bola");

        inputUsername.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        inputUsername.setPlaceholder("Username");
        inputUsername.setText("");

        inputPassword.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        inputPassword.setPlaceholder("Password");
        inputPassword.setText("");
        inputPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputPasswordPassKeyPressed(evt);
            }
        });

        versionText.setFont(new java.awt.Font("Poppins", 0, 11)); // NOI18N
        versionText.setText("Versi 0.1");

        loginText.setFont(new java.awt.Font("Poppins Medium", 1, 32)); // NOI18N
        loginText.setForeground(new java.awt.Color(51, 153, 255));
        loginText.setText("Login");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(formInput);
        formInput.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMasuk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(titleApp)
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(versionText)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(loginText)
                        .addGap(83, 83, 83)))
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(loginText)
                .addGap(41, 41, 41)
                .addComponent(inputUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnMasuk, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(versionText)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelLatar);
        panelLatar.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(latar, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(formInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(latar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(formInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelLatar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>  
    
    private void login() {
        FormUtama mainForm = new FormUtama();

        if (inputUsername.getText().equals("admin") && String.valueOf(inputPassword.getPassword()).equals("admin")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Login berhasil!");

            mainForm.setVisible(true);    
            this.dispose();

        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Login gagal! Username atau password salah!");
            inputPassword.setText("");
        }
    }

    private void btnMasukActionPerformed(java.awt.event.ActionEvent evt) {
        login();
    }

    private void inputPasswordPassKeyPressed(java.awt.event.KeyEvent evt) {
        if (evt.getKeyCode() == 10) {
            login();
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton btnMasuk;
    private javax.swing.JLabel latar;
    private javax.swing.JLabel loginText;
    private javax.swing.JLabel titleApp;
    private javax.swing.JLabel versionText;
    private javax.swing.JPanel panelLatar;
    private javax.swing.JPanel formInput;
    private PlaceholderTextField inputUsername;
    private PlaceholderPasswordField inputPassword;
    // End of variables declaration                   
}