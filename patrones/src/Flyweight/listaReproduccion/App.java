package Flyweight.listaReproduccion;

import Flyweight.listaReproduccion.cancion.CancionFactory;

import java.util.ArrayList;
import java.util.List;

public class App {
    static List<ListaReproduccion> listas = new ArrayList<>();

    public static void mostrarListas(){
        System.out.println("Las listas de reproducción existentes son:");
        for(ListaReproduccion lista : listas) {
            System.out.println("\n- " + lista.getNombre());
        }
        System.out.println("\n--------------------------------------");
    }

    static public void main(String[] args) {

        ListaReproduccion romanticas = new ListaReproduccion("romanticas");
        ListaReproduccion rock = new ListaReproduccion("Rock");

        romanticas.agregarCancion("Still loving you");
        rock.agregarCancion("Still loving you");

        rock.eliminarCancion("Still loving you");
        rock.eliminarCancion("Pepe");

        CancionFactory.getInstance().setArtista("Still loving you","Scorpions");
        CancionFactory.getInstance().setGenero("Still loving you","Rock");

        CancionFactory.getInstance().setArtista("November rain", "Guns and roses");
        rock.agregarCancion("November rain");

        mostrarListas();
    }
}
