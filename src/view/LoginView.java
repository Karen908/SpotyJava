
package view;

public class LoginView extends javax.swing.JFrame {

    public LoginView() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.repaint();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelContraSesion = new javax.swing.JLabel();
        jLabelNombreSesion = new javax.swing.JLabel();
        txt_ContraSesion = new javax.swing.JTextField();
        txt_NombreSesion = new javax.swing.JTextField();
        btn_Aceptar_Contra = new javax.swing.JButton();
        jLabelRolSesion = new javax.swing.JLabel();
        cmb_RolSesion = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelConfirmarR = new javax.swing.JLabel();
        jLabelNombreR = new javax.swing.JLabel();
        txt_ContraR = new javax.swing.JTextField();
        txt_NombreR = new javax.swing.JTextField();
        jLabelContraR = new javax.swing.JLabel();
        txt_ConfirmarR = new javax.swing.JTextField();
        btn_Registrar = new javax.swing.JButton();
        jLabelRolSesion1 = new javax.swing.JLabel();
        cmb_RolSesion1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Spoty.jpg"))); // NOI18N
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Iniciar sesion");

        jLabelContraSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelContraSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraSesion.setText("Contraseña:");

        jLabelNombreSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelNombreSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreSesion.setText("Nombre:");

        txt_ContraSesion.setBackground(new java.awt.Color(255, 255, 255));
        txt_ContraSesion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_ContraSesion.setForeground(new java.awt.Color(0, 0, 0));
        txt_ContraSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContraSesionActionPerformed(evt);
            }
        });

        txt_NombreSesion.setBackground(new java.awt.Color(255, 255, 255));
        txt_NombreSesion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_NombreSesion.setForeground(new java.awt.Color(0, 0, 0));

        btn_Aceptar_Contra.setBackground(new java.awt.Color(255, 255, 255));
        btn_Aceptar_Contra.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_Aceptar_Contra.setForeground(new java.awt.Color(0, 0, 0));
        btn_Aceptar_Contra.setText("Aceptar");
        btn_Aceptar_Contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Aceptar_ContraActionPerformed(evt);
            }
        });

        jLabelRolSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelRolSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRolSesion.setText("Rol:");

        cmb_RolSesion.setBackground(new java.awt.Color(255, 255, 255));
        cmb_RolSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        cmb_RolSesion.setForeground(new java.awt.Color(0, 0, 0));
        cmb_RolSesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelContraSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelNombreSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelRolSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_NombreSesion, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                            .addComponent(txt_ContraSesion)
                            .addComponent(cmb_RolSesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btn_Aceptar_Contra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NombreSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreSesion))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRolSesion)
                    .addComponent(cmb_RolSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContraSesion)
                    .addComponent(txt_ContraSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btn_Aceptar_Contra)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 440, 360));

        jTabbedPane1.addTab("iniciar sesion", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Spoty.jpg"))); // NOI18N
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 360));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Registrate");

        jLabelConfirmarR.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelConfirmarR.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfirmarR.setText("Confirmar  contraseña:");

        jLabelNombreR.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelNombreR.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreR.setText("Nombre:");

        txt_ContraR.setBackground(new java.awt.Color(255, 255, 255));
        txt_ContraR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_ContraR.setForeground(new java.awt.Color(0, 0, 0));
        txt_ContraR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContraRActionPerformed(evt);
            }
        });

        txt_NombreR.setBackground(new java.awt.Color(255, 255, 255));
        txt_NombreR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_NombreR.setForeground(new java.awt.Color(0, 0, 0));

        jLabelContraR.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelContraR.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraR.setText("Contraseña:");

        txt_ConfirmarR.setBackground(new java.awt.Color(255, 255, 255));
        txt_ConfirmarR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_ConfirmarR.setForeground(new java.awt.Color(0, 0, 0));
        txt_ConfirmarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ConfirmarRActionPerformed(evt);
            }
        });

        btn_Registrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Registrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_Registrar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Registrar.setText("Registrar");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        jLabelRolSesion1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelRolSesion1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRolSesion1.setText("Seleccione su rol:");

        cmb_RolSesion1.setBackground(new java.awt.Color(255, 255, 255));
        cmb_RolSesion1.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        cmb_RolSesion1.setForeground(new java.awt.Color(0, 0, 0));
        cmb_RolSesion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabelNombreR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelContraR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelConfirmarR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabelRolSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_RolSesion1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_NombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ContraR, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ConfirmarR, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_NombreR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombreR))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRolSesion1)
                    .addComponent(cmb_RolSesion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ContraR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelContraR))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelConfirmarR)
                    .addComponent(txt_ConfirmarR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btn_Registrar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 440, 360));

        jTabbedPane1.addTab("Registrar", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_ContraSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContraSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContraSesionActionPerformed

    private void txt_ContraRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContraRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContraRActionPerformed

    private void txt_ConfirmarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ConfirmarRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ConfirmarRActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_Aceptar_ContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Aceptar_ContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Aceptar_ContraActionPerformed

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
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Aceptar_Contra;
    public javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox<String> cmb_RolSesion;
    private javax.swing.JComboBox<String> cmb_RolSesion1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelConfirmarR;
    private javax.swing.JLabel jLabelContraR;
    private javax.swing.JLabel jLabelContraSesion;
    private javax.swing.JLabel jLabelNombreR;
    private javax.swing.JLabel jLabelNombreSesion;
    private javax.swing.JLabel jLabelRolSesion;
    private javax.swing.JLabel jLabelRolSesion1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField txt_ConfirmarR;
    private javax.swing.JTextField txt_ContraR;
    public javax.swing.JTextField txt_ContraSesion;
    private javax.swing.JTextField txt_NombreR;
    public javax.swing.JTextField txt_NombreSesion;
    // End of variables declaration//GEN-END:variables
}
