
package model;

public class FormularioSpoty {
    private int idAlbum;
    private String Titulo;
    private String Artista;
    private String link_album;
    private String Descripcion;
    private String fecha_creacion;
    private int Fk_genero;
    private int Fk_Usuario;

    public FormularioSpoty() {
    }

    public FormularioSpoty(int idAlbum, String Titulo, String Artista, String link_album, String Descripcion, String fecha_creacion, int Fk_genero, int Fk_Usuario) {
        this.idAlbum = idAlbum;
        this.Titulo = Titulo;
        this.Artista = Artista;
        this.link_album = link_album;
        this.Descripcion = Descripcion;
        this.Fk_genero = Fk_genero;
        this.Fk_Usuario = Fk_Usuario;
        this.fecha_creacion = fecha_creacion;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public String getLink_album() {
        return link_album;
    }

    public void setLink_album(String link_album) {
        this.link_album = link_album;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(String fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }
    

    public int getFk_genero() {
        return Fk_genero;
    }

    public void setFk_genero(int Fk_genero) {
        this.Fk_genero = Fk_genero;
    }

    public int getFk_Usuario() {
        return Fk_Usuario;
    }

    public void setFk_Usuario(int Fk_Usuario) {
        this.Fk_Usuario = Fk_Usuario;
    }
    
}
