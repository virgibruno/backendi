package Flyweight.bosque;

import Flyweight.bosque.arboles.ArbolFactory;

public class Bosque {
    // atributos
    private static int cantArbolesPlantados;

    // métodos
    public static void plantarArbol(String color) {
        ArbolFactory.getInstance().getArbol(color);
        cantArbolesPlantados ++;
    }
    // plantar 500.000 árboles de cada color y mostrar cuántos árboles se plantatos y cuánta memoria se usó
    public static void plantarMuchos(){
        for (int i = 0; i < 500000; i++) {
            plantarArbol("verde");
        }
        for (int i = 0; i < 500000; i++) {
            plantarArbol("rojo");
        }
        for (int i = 0; i < 500000; i++) {
            plantarArbol("celeste");
        }

        System.out.println("Árboles plantados: " + cantArbolesPlantados);
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }

    public static void main(String[] args) {

        plantarMuchos();

    }

}
