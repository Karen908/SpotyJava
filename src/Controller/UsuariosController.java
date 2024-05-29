
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Usuarios;
import model.UsuariosDao;
import view.LoginViewU;

public class UsuariosController implements ActionListener {
    private Usuarios usuarios;
    private UsuariosDao usuariosDao;
    private LoginViewU loginViewU;

    public UsuariosController(Usuarios usuarios, UsuariosDao usuariosDao, LoginViewU loginViewU) {
        this.usuarios = usuarios;
        this.usuariosDao = usuariosDao;
        this.loginViewU = loginViewU;
        this.loginViewU.btn_Registrar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginViewU.btn_Registrar) {
            System.out.println("Botón Registrar presionado");

            // Verificar si los campos están vacíos
            if (loginViewU.txt_NombreR.getText().trim().isEmpty() || 
                loginViewU.cmb_RolRegistro.getSelectedItem() == null || 
                new String(loginViewU.txt_ContraR.getPassword()).trim().isEmpty() || 
                new String(loginViewU.txt_ConfirmarContra.getPassword()).trim().isEmpty()) {
                
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
                System.out.println("Campos vacíos detectados");

            } else {
                // Si no lo están, insertar datos
                usuarios.setNombre(loginViewU.txt_NombreR.getText().trim());
                usuarios.setRol(loginViewU.cmb_RolRegistro.getSelectedItem().toString());
                usuarios.setContrasena(new String(loginViewU.txt_ContraR.getPassword()).trim());

                System.out.println("Nombre: " + usuarios.getNombre());
                System.out.println("Rol: " + usuarios.getRol());
                System.out.println("Contraseña: " + usuarios.getContrasena());

                if (usuariosDao.registerUsuariosQuery(usuarios)) {
                    JOptionPane.showMessageDialog(null, "Usuario registrado con éxito");
                    System.out.println("Registro exitoso");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al registrar al usuario");
                    System.out.println("Error en el registro");
                }
            }
        }
    }
}