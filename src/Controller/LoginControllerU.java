
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Usuarios;
import model.UsuariosDao;
import view.LoginViewU;
import view.VistaAdmin;
import view.VistaUsuario;

public class LoginControllerU implements ActionListener{
    private Usuarios usuarios;
    private UsuariosDao usuariosDao;
    private LoginViewU loginView;

    public LoginControllerU(Usuarios usuarios, UsuariosDao usuariosDao, LoginViewU loginView) {
        this.usuarios = usuarios;
        this.usuariosDao = usuariosDao;
        this.loginView = loginView;
        //lamamos al botton de ingresar 
        this.loginView.btn_Sesion_Aceptar.addActionListener(this);
 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //obtenemos los datos de la vista 
        //usamos en metodo trim, para eliminar los espacios en blanco 
           System.out.println("Acción realizada: " + e.getActionCommand());

        //revisamos si el usuario hizo click en el botton ingresar
        if(e.getSource()==loginView.btn_Sesion_Aceptar){
        String nombreUsuario = loginView.txt_NombreSesion.getText().trim();
        String RolUsu = loginView.cmb_RolSesion.getSelectedItem().toString();
        String password = String.valueOf(loginView.txt_ContraSesion.getPassword());
        System.out.println("Nombre de usuario: " + nombreUsuario);
        System.out.println("Rol_usu: " + RolUsu);
        System.out.println("Contraseña: " + password);

            //validamos que los campos no esten vacios 
            if (!nombreUsuario.equals("")|| !RolUsu.equals("") || !password.equals("")) {
            //pasamos los parametros al metodo login 
            usuarios = usuariosDao.loginQueryUsuarios(nombreUsuario, RolUsu,password );
            //verificamos la existencia del usuario
                if (usuarios.getNombre()!=null) {
                  if(usuarios.getRol().equals("Administrador")){
                      VistaAdmin admin = new VistaAdmin();
                      admin.setVisible(true);
                  }  else{
                      VistaUsuario usuarioView = new VistaUsuario();
                      usuarioView.setVisible(true);
                  }
                  this.loginView.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Usuario, contraseña o rol incorrecta");
                }
            
            }else{
                JOptionPane.showMessageDialog(null, "Los campos estan vacios ");
            }
        }
    }
    
}
