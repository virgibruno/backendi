package Flyweight.bosque.arboles;

import Flyweight.listaReproduccion.cancion.CancionFactory;

import java.util.HashMap;
import java.util.Scanner;

public class ArbolFactory {
    // atributos. se aplica también patrón singletón.
    private HashMap<String, Arbol> arbolMap;
    private static ArbolFactory instance;

    // constructor (privado por singletón)
    private ArbolFactory() {
        arbolMap = new HashMap();
    }

    // métodos

    public static ArbolFactory getInstance() {
        if (instance == null)
            instance = new ArbolFactory();
        return  instance;
    }

    public Arbol getArbol(String color) {
        Arbol a = arbolMap.get(color);
        if (a == null) {
            a = new Arbol(color);

            Scanner lector = new Scanner(System.in);

            System.out.println("Ingrese el alto del árbol color " + color);
            a.setAlto(lector.nextInt());
            System.out.println("Ingrese el ancho del árbol color " + color);
            a.setAncho(lector.nextInt());
            System.out.println("Ingrese el tipo del árbol color " + color);
            a.setTipo(lector.next());

            arbolMap.put(color, a);
        }
        return a;
    }


}
