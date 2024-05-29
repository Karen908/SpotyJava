
package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuariosDao {
    //instanciamos la conexion
    ConnectionMysql2 conexion = new ConnectionMysql2();
    // Creamos 3 variables que nos ayudaran en la conexion 
    Connection conn; // Realizamos la conexion
    PreparedStatement pst; // Nos ayuda con las consultas
    ResultSet rs; // Obtenemos los datos de las consultas 
    
    //utilizamos el static para enviar datos desde interfaces 
    public static int idUsuarios = 0;
    public static String Nombre_usuario = "";
    public static String Rol_usuarios = "";
    public static String contra = "";
    
    //metodo del login 
    public Usuarios loginQueryUsuarios(String Nombre, String Rol, String Contrasena) {
        String query = "SELECT * FROM usuarios WHERE Nombre = ? AND Rol = ? AND Contrasena = ?";
        Usuarios usuarios = new Usuarios();
        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            //enviamos los parametros
            pst.setString(1, Nombre);
            pst.setString(2, Rol);
            pst.setString(3, Contrasena);

            rs = pst.executeQuery();
            //verificamos si los datos del nombre rol y contraseña coinciden
            if (rs.next()) {
                usuarios.setIdUsuarios(rs.getInt("idUsuarios"));
                idUsuarios = usuarios.getIdUsuarios();
                usuarios.setNombre(rs.getString("Nombre"));
                Nombre_usuario = usuarios.getNombre();
                usuarios.setRol(rs.getString("Rol"));
                Rol_usuarios = usuarios.getRol();
                usuarios.setContrasena(rs.getString("Contrasena"));
                contra = usuarios.getContrasena();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener el usuario: " + e);
        }
        return usuarios;
    }

    //metodo para registrar usuarios
    public boolean registerUsuariosQuery(Usuarios usuarios) {
        String query = "INSERT INTO usuarios(Nombre, Rol, Contrasena) VALUES(?, ?, ?)";
        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1, usuarios.getNombre());
            pst.setString(2, usuarios.getRol());
            pst.setString(3, usuarios.getContrasena());
            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al realizar el registro: " + e);
            return false;
        }
    }
}
