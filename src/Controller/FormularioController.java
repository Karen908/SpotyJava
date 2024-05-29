
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.FormularioSpoty;
import model.FormularySpotyDao;
import view.VistaAdmin;

public class FormularioController implements ActionListener {
    private FormularioSpoty formularioSpoty;
    private FormularySpotyDao formularySpotyDao;
    private VistaAdmin vistaAdmin;

    public FormularioController(FormularioSpoty formularioSpoty, FormularySpotyDao formularySpotyDao, VistaAdmin vistaAdmin) {
        this.formularioSpoty = formularioSpoty;
        this.formularySpotyDao = formularySpotyDao;
        this.vistaAdmin = vistaAdmin;
        this.vistaAdmin.btn_SubirAlbum.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaAdmin.btn_SubirAlbum) {
            System.out.println("Botón subir album presionado");

            // Verificar si los campos están vacíos
            if (vistaAdmin.txt_TituloAlbum.getText().trim().isEmpty() || 
                vistaAdmin.txt_Artista.getText().trim().isEmpty() ||
                vistaAdmin.cmb_Genero.getSelectedItem().toString().isEmpty() ||
                vistaAdmin.txt_Link_Album.getText().trim().isEmpty() || 
                vistaAdmin.txtAreaDescripcion.getText().trim().isEmpty()) {
                
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");

            } else {
                formularioSpoty.setTitulo(vistaAdmin.txt_TituloAlbum.getText().trim());
                formularioSpoty.setArtista(vistaAdmin.txt_Artista.getText().trim());
                formularioSpoty.setFk_genero((int) vistaAdmin.cmb_Genero.getSelectedItem());
                formularioSpoty.setLink_album(vistaAdmin.txt_Link_Album.getText().trim());
                formularioSpoty.setDescripcion(vistaAdmin.txtAreaDescripcion.getText().trim());

                if (formularySpotyDao.registerFormularioQuery(formularioSpoty)) {
                    JOptionPane.showMessageDialog(null, "Album subido con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error al subir el album");
                }
            }
        }
    }
}
