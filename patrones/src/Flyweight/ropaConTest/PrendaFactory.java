package Flyweight.ropaConTest;

import java.util.HashMap;

public class PrendaFactory {
    // atributos
    private static PrendaFactory instance;
    private HashMap<String, Prenda> prendas;

    // constructor
    private PrendaFactory(){
        prendas = new HashMap();
    }

    // métodos
    public static PrendaFactory getInstance(){
        if (instance == null)
            instance = new PrendaFactory();
        return instance;
    }

    public Prenda getPrenda(String tipo){
        Prenda p = prendas.get(tipo);
        if (p == null) {
            p = new Prenda(tipo);
            prendas.put(tipo, p);
        }
        return p;
    }

    // getters y setters
    public HashMap<String, Prenda> getPrendas() {
        return prendas;
    }

    public void setPrendas(HashMap<String, Prenda> prendas) {
        this.prendas = prendas;
    }
}
