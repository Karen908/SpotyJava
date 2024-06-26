
package view;

import Controller.FormularioController;
import model.FormularioSpoty;
import model.FormularySpotyDao;
import model.Usuarios;
import model.UsuariosDao;

public class VistaAdmin extends javax.swing.JFrame {
    //instanciamos los objetos que vamos a usar en esta vista 
    Usuarios usuarios = new Usuarios();
    UsuariosDao usuariosDao = new UsuariosDao();
    
    FormularioSpoty formularioSpoty = new FormularioSpoty();
    FormularySpotyDao formularySpotyDao = new FormularySpotyDao();
    
    
    public VistaAdmin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelRolAdmin = new javax.swing.JLabel();
        jLabelNombreA = new javax.swing.JLabel();
        btn_SalirA = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabelNombreSesion = new javax.swing.JLabel();
        jLabelTituloAlbum = new javax.swing.JLabel();
        jLabelArtista = new javax.swing.JLabel();
        jLabelGenero = new javax.swing.JLabel();
        jLabelDescripcion = new javax.swing.JLabel();
        txt_TituloAlbum = new javax.swing.JTextField();
        txt_Artista = new javax.swing.JTextField();
        cmb_Genero = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDescripcion = new javax.swing.JTextArea();
        txt_Link_Album = new javax.swing.JTextField();
        btn_SubirAlbum = new javax.swing.JButton();
        jLabelLinkAlbum = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Bienvenido Administrador");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/icono.png"))); // NOI18N
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 70, 60));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 60, 60));

        jLabelRolAdmin.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabelRolAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelRolAdmin.setText("Rol");
        jPanel2.add(jLabelRolAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        jLabelNombreA.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        jLabelNombreA.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreA.setText("nombre");
        jPanel2.add(jLabelNombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, -1, -1));

        btn_SalirA.setBackground(new java.awt.Color(255, 255, 255));
        btn_SalirA.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btn_SalirA.setForeground(new java.awt.Color(0, 0, 0));
        btn_SalirA.setText("Salir");
        btn_SalirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SalirAActionPerformed(evt);
            }
        });
        jPanel2.add(btn_SalirA, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 80));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTabbedPane1.setForeground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/Subir_Cancion1.jpg"))); // NOI18N

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setForeground(new java.awt.Color(204, 204, 204));

        jLabelNombreSesion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabelNombreSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreSesion.setText("Subir album");

        jLabelTituloAlbum.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelTituloAlbum.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloAlbum.setText("Titulo del album:");

        jLabelArtista.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelArtista.setForeground(new java.awt.Color(255, 255, 255));
        jLabelArtista.setText("Artista");

        jLabelGenero.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelGenero.setForeground(new java.awt.Color(255, 255, 255));
        jLabelGenero.setText("Genero:");

        jLabelDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDescripcion.setText("Descripcion:");

        txt_TituloAlbum.setBackground(new java.awt.Color(255, 255, 255));
        txt_TituloAlbum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_TituloAlbum.setForeground(new java.awt.Color(0, 0, 0));

        txt_Artista.setBackground(new java.awt.Color(255, 255, 255));
        txt_Artista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_Artista.setForeground(new java.awt.Color(0, 0, 0));

        cmb_Genero.setBackground(new java.awt.Color(255, 255, 255));
        cmb_Genero.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 12)); // NOI18N
        cmb_Genero.setForeground(new java.awt.Color(0, 0, 0));
        cmb_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clásica", "Rock", "Pop", "Hip-hop/Rap", "Reggaeton", "vallenato", "bachata", "Clásica", "Electronica" }));

        txtAreaDescripcion.setColumns(20);
        txtAreaDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtAreaDescripcion);

        txt_Link_Album.setBackground(new java.awt.Color(255, 255, 255));
        txt_Link_Album.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_Link_Album.setForeground(new java.awt.Color(0, 0, 0));

        btn_SubirAlbum.setBackground(new java.awt.Color(255, 255, 255));
        btn_SubirAlbum.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 14)); // NOI18N
        btn_SubirAlbum.setForeground(new java.awt.Color(0, 0, 0));
        btn_SubirAlbum.setText("Subir album");

        jLabelLinkAlbum.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabelLinkAlbum.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLinkAlbum.setText("link_Album:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNombreSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTituloAlbum)
                    .addComponent(jLabelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLinkAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_SubirAlbum)
                        .addComponent(jLabelDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(54, 54, 54)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(txt_Artista)
                    .addComponent(cmb_Genero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_TituloAlbum)
                    .addComponent(txt_Link_Album))
                .addGap(28, 28, 28))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelNombreSesion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelTituloAlbum))
                    .addComponent(txt_TituloAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelArtista)
                    .addComponent(txt_Artista, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGenero)
                    .addComponent(cmb_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLinkAlbum)
                    .addComponent(txt_Link_Album, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabelDescripcion)
                        .addGap(30, 30, 30)
                        .addComponent(btn_SubirAlbum))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Formulario", jPanel4);

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 816, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 311, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Canciones subidas", jPanel6);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 820, 340));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_SalirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SalirAActionPerformed
        if (evt.getSource() == btn_SalirA) {
            dispose(); //Para que se cierre
            LoginViewU loginViewU = new LoginViewU();//para que deje la pantalla del login
            loginViewU.setVisible(true);
        }
    }//GEN-LAST:event_btn_SalirAActionPerformed

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
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_SalirA;
    public javax.swing.JButton btn_SubirAlbum;
    public javax.swing.JComboBox<String> cmb_Genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelArtista;
    private javax.swing.JLabel jLabelDescripcion;
    private javax.swing.JLabel jLabelGenero;
    private javax.swing.JLabel jLabelLinkAlbum;
    private javax.swing.JLabel jLabelNombreA;
    private javax.swing.JLabel jLabelNombreSesion;
    private javax.swing.JLabel jLabelRolAdmin;
    private javax.swing.JLabel jLabelTituloAlbum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextArea txtAreaDescripcion;
    public javax.swing.JTextField txt_Artista;
    public javax.swing.JTextField txt_Link_Album;
    public javax.swing.JTextField txt_TituloAlbum;
    // End of variables declaration//GEN-END:variables
}
