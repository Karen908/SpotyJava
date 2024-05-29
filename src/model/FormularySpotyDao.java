
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;

public class FormularySpotyDao {
    ConnectionMysql2 conexion = new ConnectionMysql2();
    Connection conn; 
    PreparedStatement pst; 
    ResultSet rs; 
    
    public static int idAlbum = 0;
    public static String Titulo = "";
    public static String Artista = "";
    public static String link_album = "";
    public static String Descripcion = "";
    public static int Fk_genero =0 ;
    public static int Fk_Usuario=0;
 
    //metodo para llenar el formulario
    public boolean registerFormularioQuery(FormularioSpoty formularioSpoty) {
        String query = "INSERT INTO album(Titulo, Artista, link_album,Descripcion, fecha_creacion,Fk_genero,Fk_Usuario) VALUES(?, ?, ?, ?, ?, ?, ?)";
                Timestamp datetime = new Timestamp(new Date().getTime());

        try {
            conn = conexion.getConnection();
            pst = conn.prepareStatement(query);
            pst.setString(1,formularioSpoty.getTitulo());
            pst.setString(2, formularioSpoty.getArtista());
            pst.setString(3, formularioSpoty.getLink_album());
            pst.setString(4, formularioSpoty.getDescripcion());
            pst.setTimestamp(5, datetime);

            pst.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al realizar el formulario: " + e);
            return false;
        }
    }
}
