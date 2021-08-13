package Flyweight.listaReproduccion.cancion;

public class Cancion {
    // atributos
    private String nombre;
    private String artista;
    private String genero;

    // constructor
    protected Cancion(String nombre) {
        this.nombre = nombre;
    }

    // getters y setters
    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getArtista() {
        return artista;
    }

    protected void setArtista(String artista) {
        this.artista = artista;
    }

    protected String getGenero() {
        return genero;
    }

    protected void setGenero(String genero) {
        this.genero = genero;
    }
}
