
package model;

public class Usuarios {
    private int idUsuarios;
    private String Nombre;
    private String Rol;
    private String Contrasena;

    public Usuarios() {
    }

    public Usuarios(int idUsuarios, String Nombre, String Rol, String Contrasena) {
        this.idUsuarios = idUsuarios;
        this.Nombre = Nombre;
        this.Rol = Rol;
        this.Contrasena = Contrasena;
    }

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }
    
}
