
package view;

import Controller.LoginControllerU;
import Controller.UsuariosController;
import model.Usuarios;
import model.UsuariosDao;

public class LoginViewU extends javax.swing.JFrame {
    //instanciamos a usuarios
    Usuarios usuarios = new Usuarios();
    UsuariosDao usuariosDao = new UsuariosDao();

    public LoginViewU() {
        //llamamos al controlador del login 
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        this.repaint();
        LoginControllerU loginView = new LoginControllerU(usuarios, usuariosDao, this);
        UsuariosController usuariosController = new UsuariosController(usuarios, usuariosDao, this);

        
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
        txt_NombreSesion = new javax.swing.JTextField();
        btn_Sesion_Aceptar = new javax.swing.JButton();
        jLabelRolSesion = new javax.swing.JLabel();
        cmb_RolSesion = new javax.swing.JComboBox<>();
        txt_ContraSesion = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabelConfirmarR = new javax.swing.JLabel();
        jLabelNombreR = new javax.swing.JLabel();
        txt_NombreR = new javax.swing.JTextField();
        jLabelContraR = new javax.swing.JLabel();
        btn_Registrar = new javax.swing.JButton();
        jLabelRolSesion1 = new javax.swing.JLabel();
        cmb_RolRegistro = new javax.swing.JComboBox<>();
        txt_ContraR = new javax.swing.JPasswordField();
        txt_ConfirmarContra = new javax.swing.JPasswordField();

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

        txt_NombreSesion.setBackground(new java.awt.Color(255, 255, 255));
        txt_NombreSesion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_NombreSesion.setForeground(new java.awt.Color(0, 0, 0));

        btn_Sesion_Aceptar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Sesion_Aceptar.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        btn_Sesion_Aceptar.setForeground(new java.awt.Color(0, 0, 0));
        btn_Sesion_Aceptar.setText("Aceptar");
        btn_Sesion_Aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Sesion_AceptarActionPerformed(evt);
            }
        });

        jLabelRolSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelRolSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRolSesion.setText("Rol:");

        cmb_RolSesion.setBackground(new java.awt.Color(255, 255, 255));
        cmb_RolSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        cmb_RolSesion.setForeground(new java.awt.Color(0, 0, 0));
        cmb_RolSesion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));

        txt_ContraSesion.setBackground(new java.awt.Color(255, 255, 255));
        txt_ContraSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txt_ContraSesion.setForeground(new java.awt.Color(0, 0, 0));
        txt_ContraSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ContraSesionActionPerformed(evt);
            }
        });

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
                            .addComponent(cmb_RolSesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_ContraSesion)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(btn_Sesion_Aceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(30, 30, 30)
                .addComponent(btn_Sesion_Aceptar)
                .addContainerGap(70, Short.MAX_VALUE))
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

        txt_NombreR.setBackground(new java.awt.Color(255, 255, 255));
        txt_NombreR.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_NombreR.setForeground(new java.awt.Color(0, 0, 0));

        jLabelContraR.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelContraR.setForeground(new java.awt.Color(255, 255, 255));
        jLabelContraR.setText("Contraseña:");

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

        cmb_RolRegistro.setBackground(new java.awt.Color(255, 255, 255));
        cmb_RolRegistro.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        cmb_RolRegistro.setForeground(new java.awt.Color(0, 0, 0));
        cmb_RolRegistro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuario", "Administrador" }));

        txt_ContraR.setBackground(new java.awt.Color(255, 255, 255));
        txt_ContraR.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txt_ContraR.setForeground(new java.awt.Color(0, 0, 0));

        txt_ConfirmarContra.setBackground(new java.awt.Color(255, 255, 255));
        txt_ConfirmarContra.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        txt_ConfirmarContra.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(txt_NombreR, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ContraR, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmb_RolRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_ConfirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))))
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
                    .addComponent(cmb_RolRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelContraR)
                    .addComponent(txt_ContraR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelConfirmarR)
                    .addComponent(txt_ConfirmarContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btn_Registrar)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 440, 360));

        jTabbedPane1.addTab("Registrar", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void btn_Sesion_AceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Sesion_AceptarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Sesion_AceptarActionPerformed

    private void txt_ContraSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ContraSesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ContraSesionActionPerformed

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
            java.util.logging.Logger.getLogger(LoginViewU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginViewU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginViewU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginViewU.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginViewU().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_Registrar;
    public javax.swing.JButton btn_Sesion_Aceptar;
    public javax.swing.JComboBox<String> cmb_RolRegistro;
    public javax.swing.JComboBox<String> cmb_RolSesion;
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
    public javax.swing.JPasswordField txt_ConfirmarContra;
    public javax.swing.JPasswordField txt_ContraR;
    public javax.swing.JPasswordField txt_ContraSesion;
    public javax.swing.JTextField txt_NombreR;
    public javax.swing.JTextField txt_NombreSesion;
    // End of variables declaration//GEN-END:variables
}
