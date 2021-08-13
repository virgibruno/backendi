package Proxy.drive;

import java.util.ArrayList;
import java.util.List;

public class Documento {
    private int id;
    private String url;
    private String contenido;
    private List<Usuario> usuarios;

    public Documento(int id, String url, String contenido) {
        this.id = id;
        this.url = url;
        this.contenido = contenido;
        usuarios = new ArrayList<>();
    }

    public void autorizarUsuario(Usuario u){
        usuarios.add(u);
    }

    public int getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getContenido() {
        return contenido;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }
}
