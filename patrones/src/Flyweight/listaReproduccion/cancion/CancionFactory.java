package Flyweight.listaReproduccion.cancion;

import java.util.HashMap;

public class CancionFactory {
    private HashMap<String, Cancion> canciones = new HashMap();
    private static CancionFactory instance;

    private CancionFactory() { }

    public static CancionFactory getInstance() {
        if (instance == null)
            instance = new CancionFactory();
        return  instance;
    }


    public Cancion getCancion(String nombre) {
        Cancion c = canciones.get(nombre);
        if (c == null) {
            c = new Cancion(nombre);
            System.out.println("Se creó la canción " + nombre);
            canciones.put(nombre, c);
        }
        return c;
    }

    public void setGenero(String nombre, String genero) {
        Cancion c = canciones.get(nombre);
        if (c == null) {
            c = new Cancion(nombre);
            System.out.println("Se creó la canción " + nombre + " con género " + genero);
            canciones.put(nombre, c);
        } else {
            c.setGenero(genero);
        }
    }

    public void setArtista(String nombre, String artista) {
        Cancion c = canciones.get(nombre);
        if (c == null) {
            c = new Cancion(nombre);
            System.out.println("Se creó la canción " + nombre + " con artista " + artista);
            canciones.put(nombre, c);
        } else {
            c.setArtista(artista);
        }
    }

}
