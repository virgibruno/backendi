package Flyweight.listaReproduccion;

import Flyweight.listaReproduccion.cancion.Cancion;
import Flyweight.listaReproduccion.cancion.CancionFactory;

import java.util.HashMap;

public class ListaReproduccion {
    // atributos
    private String nombre;
    private HashMap<String, Cancion> canciones = new HashMap<>();

    // constructor
    public ListaReproduccion(String nombre) {
        this.nombre = nombre;
        App.listas.add(this);
    }

    // metodos
    public void agregarCancion(String nombre) {
        Cancion c = CancionFactory.getInstance().getCancion(nombre);
        canciones.put(nombre, c);
        System.out.println(nombre + " se agregó a la lista " + this.nombre);
    }

    public void eliminarCancion(String nombre){
        Cancion c = canciones.get(nombre);
        if (c == null)
            System.out.println("La canción no se encuentra en la lista "+ this.nombre);
        else {
            canciones.remove(nombre);
            System.out.println(nombre + " se ha eliminado de la lista "+ this.nombre);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
